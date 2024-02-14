package GayeNur;
import java.util.List;
import java.util.ArrayList;

public class ControlSignals {
    private List<String> activeSignals;
    private boolean AND;
    private boolean ADD;
    private boolean LDA;
    private boolean STA;
    private boolean BUN;
    private boolean BSA;
    private boolean ISZ;
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
	public void setActiveSignal(String activeSignal) {
    }
    public ControlSignals() {
        this.activeSignals = new ArrayList<>();
    }

    public String getActiveSignalsAsString() {
        StringBuilder result = new StringBuilder();
        if (activeSignals != null) {
            for (String signal : activeSignals) {
                result.append(signal).append(", ");
            }
            if (result.length() > 0) {
                result.setLength(result.length() - 2); 
            }
        }
        return result.toString();
    } 

    public String toString() {
        return getActiveSignalsAsString();
    }

    public List<String> getActiveSignals() {
        return activeSignals;
    }

    public void setControlSignals(List<String> activeSignals) {
        this.activeSignals = activeSignals;
    }

    public void addSignal(String signal) {
        if (activeSignals != null) {
            this.activeSignals.add(signal);
        }
    }

    public String getControlSignals() {
        StringBuilder signals = new StringBuilder();

        appendSignal(signals, "AND", AND);
        appendSignal(signals, "ADD", ADD);
        appendSignal(signals, "LDA", LDA);
        appendSignal(signals, "STA", STA);
        appendSignal(signals, "BUN", BUN);
        appendSignal(signals, "BSA", BSA);
        appendSignal(signals, "ISZ", ISZ);
        appendSignal(signals, "CLA", CLA);
        appendSignal(signals, "CLE", CLE);
        appendSignal(signals, "CMA", CMA);
        appendSignal(signals, "CME", CME);
        appendSignal(signals, "CIR", CIR);
        appendSignal(signals, "CIL", CIL);
        appendSignal(signals, "INC", INC);
        appendSignal(signals, "SPA", SPA);
        appendSignal(signals, "SNA", SNA);
        appendSignal(signals, "SZA", SZA);
        appendSignal(signals, "SZE", SZE);
        appendSignal(signals, "HLT", HLT);
        appendSignal(signals, "INP", INP);
        appendSignal(signals, "OUT", OUT);
        appendSignal(signals, "SKI", SKI);
        appendSignal(signals, "SKO", SKO);
        appendSignal(signals, "ION", ION);
        appendSignal(signals, "IOF", IOF);

        return signals.toString();
    }

    private void appendSignal(StringBuilder signals, String signalName, boolean signalValue) {
        if (signalValue) {
            signals.append(signalName).append(",");
        }
    }


    public boolean isAND() {
        return AND;
    }

    public void setAND(boolean AND) {
        this.AND = AND;
    }

    public boolean isADD() {
        return ADD;
    }

    public void setADD(boolean ADD) {
        this.ADD = ADD;
    }

    public boolean isLDA() {
        return LDA;
    }

    public void setLDA(boolean LDA) {
        this.LDA = LDA;
    }

    public boolean isSTA() {
        return STA;
    }

    public void setSTA(boolean STA) {
        this.STA = STA;
    }

    public boolean isBUN() {
        return BUN;
    }

    public void setBUN(boolean BUN) {
        this.BUN = BUN;
    }

    public boolean isBSA() {
        return BSA;
    }

    public void setBSA(boolean BSA) {
        this.BSA = BSA;
    }

    public boolean isISZ() {
        return ISZ;
    }

    public void setISZ(boolean ISZ) {
        this.ISZ = ISZ;
    }

    public boolean isCLA() {
        return CLA;
    }

    public void setCLA(boolean CLA) {
        this.CLA = CLA;
    }

    public boolean isCLE() {
        return CLE;
    }

    public void setCLE(boolean CLE) {
        this.CLE = CLE;
    }

    public boolean isCMA() {
        return CMA;
    }

    public void setCMA(boolean CMA) {
        this.CMA = CMA;
    }

    public boolean isCME() {
        return CME;
    }

    public void setCME(boolean CME) {
        this.CME = CME;
    }

    public boolean isCIR() {
        return CIR;
    }

    public void setCIR(boolean CIR) {
        this.CIR = CIR;
    }

    public boolean isCIL() {
        return CIL;
    }

    public void setCIL(boolean CIL) {
        this.CIL = CIL;
    }

    public boolean isINC() {
        return INC;
    }

    public void setINC(boolean INC) {
        this.INC = INC;
    }

    public boolean isSPA() {
        return SPA;
    }

    public void setSPA(boolean SPA) {
        this.SPA = SPA;
    }

    public boolean isSNA() {
        return SNA;
    }

    public void setSNA(boolean SNA) {
        this.SNA = SNA;
    }

    public boolean isSZA() {
        return SZA;
    }

    public void setSZA(boolean SZA) {
        this.SZA = SZA;
    }

    public boolean isSZE() {
        return SZE;
    }

    public void setSZE(boolean SZE) {
        this.SZE = SZE;
    }

    public boolean isHLT() {
        return HLT;
    }

    public void setHLT(boolean HLT) {
        this.HLT = HLT;
    }

    public boolean isINP() {
        return INP;
    }

    public void setINP(boolean INP) {
        this.INP = INP;
    }

    public boolean isOUT() {
        return OUT;
    }

    public void setOUT(boolean OUT) {
        this.OUT = OUT;
    }

    public boolean isSKI() {
        return SKI;
    }

    public void setSKI(boolean SKI) {
        this.SKI = SKI;
    }

    public boolean isSKO() {
        return SKO;
    }

    public void setSKO(boolean SKO) {
        this.SKO = SKO;
    }

    public boolean isION() {
        return ION;
    }

    public void setION(boolean ION) {
        this.ION = ION;
    }

    public boolean isIOF() {
        return IOF;
    }

    public void setIOF(boolean IOF) {
        this.IOF = IOF;
    }


    public void setActiveSignals(List<String> activeSignals) {
      
    }

    public void setControlSignals(String decode) {
    	String[] signalNames = decode.split(",");
        activeSignals.clear();
        for (String signalName : signalNames) {
            switch (signalName) {
                case "AND":
                    setAND(true);
                    break;
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
                    setBUN(true);
                    break;
                case "ISZ":
                    setISZ(true);
                    break;
                case "CLA":
                    setCLA(true);
                    break;
                case "CLE":
                    setCLE(true);
                    break;
                case "CMA":
                    setCMA(true);
                    break;
                case "CME":
                    setCME(true);
                    break;
                case "CIR":
                    setCIR(true);
                    break;
                case "CIL":
                    setCIL(true);
                    break;
                case "INC":
                    setINC(true);
                    break;
                case "SPA":
                    setSPA(true);
                    break;
                case "SNA":
                    setSNA(true);
                    break;
                case "SZA":
                    setSZA(true);
                    break;
                case "SZE":
                    setSZE(true);
                    break;
                case "HLT":
                    setHLT(true);
                    break;
                case "INP":
                    setINP(true);
                    break;
                case "OUT":
                    setOUT(true);
                    break;
                case "SKI":
                    setSKI(true);
                    break;
                case "SKO":
                    setSKO(true);
                    break;
                case "ION":
                    setION(true);
                    break;
                case "IOF":
                    setIOF(true);
                    break;
                default:
                    activeSignals.add(signalName.trim());
                    break;
            }
        }
    }}
   
