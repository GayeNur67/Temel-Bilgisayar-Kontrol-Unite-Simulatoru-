package GayeNur;
import java.util.HashMap;
import java.util.Map;

public class InstructionDecoder {
    private static final Map<String, Integer> INSTRUCTION_TABLE = new HashMap<>();
    private static final int OPCODE_LENGTH = 4;  
    static {
        INSTRUCTION_TABLE.put("AND", 0b0000);
        INSTRUCTION_TABLE.put("ADD", 0b0001);
        INSTRUCTION_TABLE.put("LDA", 0b0010);
        INSTRUCTION_TABLE.put("STA", 0b0011);
        INSTRUCTION_TABLE.put("BUN", 0b0100);
        INSTRUCTION_TABLE.put("BSA", 0b0101);
        INSTRUCTION_TABLE.put("ISZ", 0b0110);
        INSTRUCTION_TABLE.put("CLA", 0b1111_1000_0000_0000);
        INSTRUCTION_TABLE.put("CLE", 0b1111_0100_0000_0000);
        INSTRUCTION_TABLE.put("CMA", 0b1111_0010_0000_0000);
        INSTRUCTION_TABLE.put("CME", 0b1111_0001_0000_0000);
        INSTRUCTION_TABLE.put("CIR", 0b1111_0000_1000_0000);
        INSTRUCTION_TABLE.put("CIL", 0b1111_0000_0100_0000);
        INSTRUCTION_TABLE.put("INC", 0b1111_0000_0010_0000);
        INSTRUCTION_TABLE.put("SPA", 0b1111_0000_0001_0000);
        INSTRUCTION_TABLE.put("SNA", 0b1111_0000_0000_1000);
        INSTRUCTION_TABLE.put("SZA", 0b1111_0000_0000_0100);
        INSTRUCTION_TABLE.put("SZE", 0b1111_0000_0000_0010);
        INSTRUCTION_TABLE.put("HLT", 0b1111_0000_0000_0001);
        INSTRUCTION_TABLE.put("INP", 0b1111_1111_1000_0000);
        INSTRUCTION_TABLE.put("OUT", 0b1111_1111_0100_0000);
        INSTRUCTION_TABLE.put("SKI", 0b1111_1111_0010_0000);
        INSTRUCTION_TABLE.put("SKO", 0b1111_1111_0001_0000);
        INSTRUCTION_TABLE.put("ION", 0b1111_1111_0000_1000);
        INSTRUCTION_TABLE.put("IOF", 0b1111_1111_0000_0100);
    }
    public static String decodeInstruction(int machineCode) {
        int opcode = machineCode >>> (16 - OPCODE_LENGTH); 
        for (Map.Entry<String, Integer> entry : INSTRUCTION_TABLE.entrySet()) {
            if (entry.getValue() == opcode) {
                return entry.getKey();
            }
        }
        return "UNKNOWN";
    }
}

