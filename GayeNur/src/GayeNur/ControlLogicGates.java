package GayeNur;
public class ControlLogicGates {
    private boolean[] decoderBits;
    private boolean I; 
    private boolean[] IRBits;
    private boolean[] ACBits;
    private boolean[] DRBits;

    private boolean CLA;  
    private boolean CLE;  
    private boolean CMA;  
    private boolean CME;  
    private boolean CIR;  
    private boolean CIL;  
    private boolean INC;  
    private boolean SPA;  
    private boolean SNA;  
    private boolean SZA;  
    private boolean SZE;  
    private boolean HLT;  
    private boolean INP;  
    private boolean OUT;  
    private boolean SKI;  
    private boolean SKO;  
    private boolean ION;  
    private boolean IOF;  

    private boolean ADD;
    private boolean LDA;
    private boolean STA;
    private boolean BUN;
    private boolean BSA;
    private boolean ISZ;

    private Decoder decoder;
    private ControlSignals controlSignals; 
   

    public ControlLogicGates(boolean[] IRBits, boolean[] ACBits, boolean[] DRBits) {
 
        this.IRBits = IRBits; 
        this.setACBits(ACBits);
        this.setDRBits(DRBits);
        
        this.controlSignals = new ControlSignals();
        
        setCLA(false);
        setCLE(false);
        setCMA(false);
        setCME(false);
        setCIR(false);
        setCIL(false);
        setINC(false);
        setSPA(false);
        setSNA(false);
        setSZA(false);
        setSZE(false);
        setHLT(false);
        setINP(false);
        setOUT(false);
        setSKI(false);
        setSKO(false);
        setION(false);
        setIOF(false);
        setADD(false);
        setLDA(false);
        setSTA(false);
        setBUN(false);
        setBSA(false);
        setISZ(false);
        
        this.decoder = new Decoder();
    }

    public void designControlLogic() {
        String decodedInstruction = decoder.decode(IRBits);
        controlSignals.setActiveSignal(decodedInstruction);
        setControlSignals(decodedInstruction);
    }
    private void setControlSignals(String decodedInstruction) {
        switch (decodedInstruction) {
            case "ADD":
                setADD(true);
                break;
            case "LDA":
                setLDA(true);
                break;
            case "STA":
                setSTA(true);
                break;
            case "BUN":
                setBUN(true);
                break;
            case "BSA":
                setBSA(true);
                break;
            case "ISZ":
                setISZ(true);
                break;
            default:
                resetControlSignals();
                break;
        }
    }
    private void resetControlSignals() {
  
        setADD(false);
        setLDA(false);
        setSTA(false);
        setBUN(false);
        setBSA(false);
        setISZ(false);
        setCLA(false);
        setCLE(false);
        setCMA(false);
        setCME(false);
        setCIR(false);
        setCIL(false);
        setINC(false);
        setSPA(false);
        setSNA(false);
        setSZA(false);
        setSZE(false);
        setHLT(false);
        setINP(false);
        setOUT(false);
        setSKI(false);
        setSKO(false);
        setION(false);
        setIOF(false);
    }

	public boolean[] getDecoderBits() {
		return decoderBits;
	}

	public void setDecoderBits(boolean[] decoderBits) {
		this.decoderBits = decoderBits;
	}

	public boolean isI() {
		return I;
	}

	public void setI(boolean I) {
	  
	    this.I = I;
	}

	public boolean[] getACBits() {
		return ACBits;
	}

	public void setACBits(boolean[] aCBits) {
		ACBits = aCBits;
	}

	public boolean[] getDRBits() {
		return DRBits;
	}

	public void setDRBits(boolean[] dRBits) {
		DRBits = dRBits;
	}

	public boolean isCLA() {
		return CLA;
	}

	public void setCLA(boolean cLA) {
		CLA = cLA;
	}

	public boolean isCLE() {
		return CLE;
	}

	public void setCLE(boolean cLE) {
		CLE = cLE;
	}

	public boolean isCMA() {
		return CMA;
	}

	public void setCMA(boolean cMA) {
		CMA = cMA;
	}

	public boolean isCME() {
		return CME;
	}

	public void setCME(boolean cME) {
		CME = cME;
	}

	public boolean isCIR() {
		return CIR;
	}

	public void setCIR(boolean cIR) {
		CIR = cIR;
	}

	public boolean isCIL() {
		return CIL;
	}

	public void setCIL(boolean cIL) {
		CIL = cIL;
	}

	public boolean isINC() {
		return INC;
	}

	public void setINC(boolean iNC) {
		INC = iNC;
	}

	public boolean isSPA() {
		return SPA;
	}

	public void setSPA(boolean sPA) {
		SPA = sPA;
	}

	public boolean isSZA() {
		return SZA;
	}

	public void setSZA(boolean sZA) {
		SZA = sZA;
	}

	public boolean isSZE() {
		return SZE;
	}

	public void setSZE(boolean sZE) {
		SZE = sZE;
	}

	public boolean isSNA() {
		return SNA;
	}

	public void setSNA(boolean sNA) {
		SNA = sNA;
	}

	public boolean isHLT() {
		return HLT;
	}

	public void setHLT(boolean hLT) {
		HLT = hLT;
	}

	public boolean isINP() {
		return INP;
	}

	public void setINP(boolean iNP) {
		INP = iNP;
	}

	public boolean isOUT() {
		return OUT;
	}

	public void setOUT(boolean oUT) {
		OUT = oUT;
	}

	public boolean isSKI() {
		return SKI;
	}

	public void setSKI(boolean sKI) {
		SKI = sKI;
	}

	public boolean isSKO() {
		return SKO;
	}

	public void setSKO(boolean sKO) {
		SKO = sKO;
	}

	public boolean isION() {
		return ION;
	}

	public void setION(boolean iON) {
		ION = iON;
	}

	public boolean isIOF() {
		return IOF;
	}

	public void setIOF(boolean iOF) {
		IOF = iOF;
	}

	public boolean isADD() {
		return ADD;
	}

	public void setADD(boolean aDD) {
		ADD = aDD;
	}

	public boolean isLDA() {
		return LDA;
	}

	public void setLDA(boolean lDA) {
		LDA = lDA;
	}

	public boolean isSTA() {
		return STA;
	}

	public void setSTA(boolean sTA) {
		STA = sTA;
	}

	public boolean isBUN() {
		return BUN;
	}

	public void setBUN(boolean bUN) {
		BUN = bUN;
	}

	public boolean isBSA() {
		return BSA;
	}

	public void setBSA(boolean bSA) {
		BSA = bSA;
	}

	public boolean isISZ() {
		return ISZ;
	}

	public void setISZ(boolean iSZ) {
		ISZ = iSZ;
	}}


 
  