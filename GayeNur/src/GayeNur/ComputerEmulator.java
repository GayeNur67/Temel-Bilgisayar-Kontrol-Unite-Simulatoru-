package GayeNur;

import java.util.HashMap;
import java.util.Map;

public class ComputerEmulator {
    private Map<String, String> instructionSet;

    public ComputerEmulator() {
        initializeInstructionSet();
    }

    private void initializeInstructionSet() {
        instructionSet = new HashMap<>();

        instructionSet.put("8xxx", "AND");
        instructionSet.put("9xxx", "ADD");
        instructionSet.put("Axxx", "LDA");
        instructionSet.put("Bxxx", "STA");
        instructionSet.put("Cxxx", "BUN");
        instructionSet.put("Dxxx", "BSA");
        instructionSet.put("Exxx", "ISZ");
        instructionSet.put("7800", "CLA");
        instructionSet.put("7400", "CLE");
        instructionSet.put("7200", "CMA");
        instructionSet.put("7100", "CME");
        instructionSet.put("7080", "CIR");
        instructionSet.put("7040", "CIL");
        instructionSet.put("7020", "INC");
        instructionSet.put("7010", "SPA");
        instructionSet.put("7008", "SNA");
        instructionSet.put("7004", "SZA");
        instructionSet.put("7002", "SZE");
        instructionSet.put("7001", "HLT");
        instructionSet.put("F800", "INP");
        instructionSet.put("F400", "OUT");
        instructionSet.put("F200", "SKI");
        instructionSet.put("F100", "SKO");
        instructionSet.put("F080", "ION");
        instructionSet.put("F040", "IOF");
    }

    public void executeInstruction(String opcode, String operand) {
        String hexadecimalCode = instructionSet.get(opcode.toUpperCase());
        if (hexadecimalCode != null) {
        	String finalHexCode = hexadecimalCode.replace("xxx", "");       
            System.out.println("Executing: " + opcode + " " + operand + " (Hex Code: " + finalHexCode + ")");
        } else {
            System.out.println("Invalid opcode: " + opcode);
        }
    }

    public static void main(String[] args) {
        ComputerEmulator emulator = new ComputerEmulator();

        emulator.executeInstruction("8xxx", "1001"); 
        emulator.executeInstruction("9xxx", "1001"); 
        emulator.executeInstruction("Axxx", "A123"); 
        emulator.executeInstruction("Bxxx", "B456"); 
        emulator.executeInstruction("Cxxx", "C789"); 
        emulator.executeInstruction("Dxxx", "D012"); 
        emulator.executeInstruction("Exxx", "E345"); 
        emulator.executeInstruction("7800", "");    
        emulator.executeInstruction("7400", "");     
        emulator.executeInstruction("7200", "");    
        emulator.executeInstruction("7100", "");     
        emulator.executeInstruction("7080", "");    
        emulator.executeInstruction("7040", "");    
        emulator.executeInstruction("7020", "");    
        emulator.executeInstruction("7010", "");     
        emulator.executeInstruction("7008", "");     
        emulator.executeInstruction("7004", "");     
        emulator.executeInstruction("7002", "");     
        emulator.executeInstruction("7001", "");     
        emulator.executeInstruction("F800", "");     
        emulator.executeInstruction("F400", "");     
        emulator.executeInstruction("F200", "");     
        emulator.executeInstruction("F100", "");     
        emulator.executeInstruction("F080", "");    
        emulator.executeInstruction("F040", "");    
        emulator.executeInstruction("XYZ", "5678"); 
    }
}
