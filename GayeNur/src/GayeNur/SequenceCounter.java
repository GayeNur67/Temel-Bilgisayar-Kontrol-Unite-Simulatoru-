package GayeNur;

public class SequenceCounter  {
	    private int counterValue;

	    public SequenceCounter(int initialValue) {
	        this.counterValue = initialValue;
	        this.counterValue = 0;
	    }

	    public int getCounterValue() {
	        return counterValue;
	    }

	    public void increment() {
	        counterValue = (counterValue + 1) % 16;
	    }
	    public void reset() {
	        counterValue = 0;
	    }
	    public String getBinaryRepresentation() {
	        
	        return String.format("%4s", Integer.toBinaryString(counterValue)).replace(' ', '0');
	    }
	    public static void main(String[] args) {
	        SequenceCounter sequenceCounter = new SequenceCounter(0);	      
	        for (int i = 0; i < 16; i++) {
	            System.out.println("Step " + i + ": " + sequenceCounter.getBinaryRepresentation());
	            sequenceCounter.increment();
	        }
	    }
	}


