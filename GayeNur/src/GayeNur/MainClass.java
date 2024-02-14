package GayeNur;

public class MainClass {
    public static void main(String[] args) {
        IRRegister irRegister = new IRRegister();
        Ram ram = new Ram();
        Decoder decoder = new Decoder();
        SequenceCounter sequenceCounter = new SequenceCounter(0);
        ControlSignals controlSignals = new ControlSignals();
        RAMLoader.loadProgram(ram, "RAM.txt");
        Simulator simulator = new Simulator(irRegister, ram, decoder, sequenceCounter, controlSignals); 
        simulator.simulate();
    }
}

