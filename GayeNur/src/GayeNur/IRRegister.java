package GayeNur;

public class IRRegister  {
	private int value;

    public void load(int machineCode) {
        this.value = machineCode;
    }

    public int getValue() {
        return value;
    }
    
        public String getBinaryRepresentation() {
 
            return Integer.toBinaryString(value);
        }
    }


