package GayeNur;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class RAMLoader {
public static void loadProgram(Ram ram, String fileName) {
    try {       
        for (String line : Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8)) {           
            String[] hexValues = line.split(" ");
            for (String hexValue : hexValues) {
                int machineCode = Integer.parseInt(hexValue, 16);
                ram.addInstruction(machineCode);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
