package GayeNur;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Simulator {
    private IRRegister irRegister;
    private Ram ram;
    private Decoder decoder;
    private SequenceCounter sequenceCounter;
    private ControlSignals controlSignals;

    private static final int SIMULATION_TIME_INTERVAL = 1000;

    public Simulator(IRRegister irRegister, Ram ram, Decoder decoder, SequenceCounter sequenceCounter, ControlSignals controlSignals) {
        this.irRegister = irRegister;
        this.setRam(ram);
        this.decoder = decoder;
        this.sequenceCounter = sequenceCounter;
        this.controlSignals = controlSignals;
    }

    public void simulate() {
        String fileName = "RAM.txt";

        try {
            List<String> lines = readAllLines(fileName);

            System.out.println("RAM.txt dosyası okundu.");

            int time = 0;
            for (String line : lines) {
                int machineCode = Integer.parseInt(line, 2);

                irRegister.load(machineCode);
                String decodedInstruction = decoder.decode(machineCode);
                controlSignals.setControlSignals(decodedInstruction);
                printActiveControlSignals(time, machineCode, decodedInstruction);

                sequenceCounter.increment();

                try {
                    Thread.sleep(SIMULATION_TIME_INTERVAL);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                time++;
                if (time == 16) {
                    time = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printActiveControlSignals(int time, int machineCode, String decodedInstruction) {
        List<String> activeSignals = controlSignals.getActiveSignals();

        if (!activeSignals.isEmpty()) {
            String result = controlSignals.getControlSignals();
            if (result.endsWith(", ")) {
                result = result.substring(0, result.length() - 2);
            }
            System.out.println(result);
        } 
        String result = controlSignals.getControlSignals();
        if (result.endsWith(", ")) {
            result = result.substring(0, result.length() - 2);
        }
        String[] dValues = {"D0", "D1", "D2", "D3", "D4", "D5", "D6", "D7"};
        int ir15Bit = (machineCode >> 15) & 0b1;
        String iValue = (ir15Bit == 0) ? "0" : "1";
        int dValue = (machineCode >> 12) & 0b111;
        String dValueString = dValues[dValue];

        System.out.print("T" + time + " zamanında I = " + iValue +
                " " + dValueString +
                " aktif IR(11-0) = " + Integer.toBinaryString(machineCode) +
                " buyruk = " + decodedInstruction +"");

        System.out.println();
    }
    private static List<String> readAllLines(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        return Files.readAllLines(path, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        IRRegister irRegister = new IRRegister();
        Ram ram = new Ram();
        Decoder decoder = new Decoder();
        SequenceCounter sequenceCounter = new SequenceCounter(0);
        ControlSignals controlSignals = new ControlSignals();

        ram.loadProgram("RAM.txt");

        Simulator simulator = new Simulator(irRegister, ram, decoder, sequenceCounter, controlSignals);
        simulator.simulate();
    }
	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}
}
