package GayeNur;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ram  {
    private int[] memory;
    public Ram() {
        this.memory = new int[16];
    }
    public void loadProgram(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int address = 0;
            while ((line = reader.readLine()) != null && address < 16) {
                int machineCode = Integer.parseInt(line, 2);
                setInstruction(address, machineCode);

                address++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getInstruction(int address) {
        return memory[address];
    }
    public void setInstruction(int address, int value) {
        memory[address] = value;
    }
    public void addInstruction(int instruction) {
        int nextAddress = findNextEmptyAddress();
        if (nextAddress != -1) {
            setInstruction(nextAddress, instruction);
        } else {
            System.out.println("RAM is full. Cannot add more instructions.");
        }
    }
    private int findNextEmptyAddress() {
        for (int i = 0; i < memory.length; i++) {
            if (memory[i] == 0) {
                return i;
            }
        }
        return -1; 
    }
    public void printMemoryContents() {
        for (int i = 0; i < memory.length; i++) {
            System.out.println("Address " + i + ": " + Integer.toBinaryString(memory[i]));
        }
    }
}
