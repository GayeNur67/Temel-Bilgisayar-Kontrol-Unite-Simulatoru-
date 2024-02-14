package GayeNur;
import java.util.HashMap;
import java.util.Map;

public class Decoder {
    private static final Map<Integer, String> INSTRUCTION_TABLE = new HashMap<>();

    static {
        INSTRUCTION_TABLE.put(0x0, "AND");
        INSTRUCTION_TABLE.put(0x1, "ADD");
        INSTRUCTION_TABLE.put(0x2, "LDA");
        INSTRUCTION_TABLE.put(0x3, "STA");
        INSTRUCTION_TABLE.put(0x4, "BUN");
        INSTRUCTION_TABLE.put(0x5, "BSA");
        INSTRUCTION_TABLE.put(0x6, "ISZ");
        INSTRUCTION_TABLE.put(0x7, "CLA");
        INSTRUCTION_TABLE.put(0x8, "CLE");
        INSTRUCTION_TABLE.put(0x9, "CMA");
        INSTRUCTION_TABLE.put(0xA, "CME");
        INSTRUCTION_TABLE.put(0xB, "CIR");
        INSTRUCTION_TABLE.put(0xC, "CIL");
        INSTRUCTION_TABLE.put(0xD, "INC");
        INSTRUCTION_TABLE.put(0xE, "SPA");
        INSTRUCTION_TABLE.put(0xF, "SNA");
        INSTRUCTION_TABLE.put(0x7800, "CLA");
        INSTRUCTION_TABLE.put(0x7400, "CLE");
        INSTRUCTION_TABLE.put(0x7200, "CMA");
        INSTRUCTION_TABLE.put(0x7100, "CME");
        INSTRUCTION_TABLE.put(0x7080, "CIR");
        INSTRUCTION_TABLE.put(0x7040, "CIL");
        INSTRUCTION_TABLE.put(0x7020, "INC");
        INSTRUCTION_TABLE.put(0x7010, "SPA");
        INSTRUCTION_TABLE.put(0x7008, "SNA");
        INSTRUCTION_TABLE.put(0x7004, "SZA");
        INSTRUCTION_TABLE.put(0x7002, "SZE");
        INSTRUCTION_TABLE.put(0x7001, "HLT");
        INSTRUCTION_TABLE.put(0xF800, "INP");
        INSTRUCTION_TABLE.put(0xF400, "OUT");
        INSTRUCTION_TABLE.put(0xF200, "SKI");
        INSTRUCTION_TABLE.put(0xF100, "SKO");
        INSTRUCTION_TABLE.put(0xF080, "ION");
        INSTRUCTION_TABLE.put(0xF040, "IOF");
    }

    public String decode(boolean[] IRBits) {

        int machineCode = booleanArrayToInt(IRBits);

        return decode(machineCode);
    }

    public String decode(int machineCode) {    
        int opcode = (machineCode >> 12) & 0xF;

        if (INSTRUCTION_TABLE.containsKey(opcode)) {
            return INSTRUCTION_TABLE.get(opcode);
        } else {
            return "UNKNOWN";
        }
    }

    private int booleanArrayToInt(boolean[] bits) {
        int result = 0;
        for (int i = 0; i < bits.length; i++) {
            if (bits[i]) {
                result |= (1 << (bits.length - 1 - i));
            }
        }
        return result;
    }
}
