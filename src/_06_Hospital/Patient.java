package _06_Hospital;

public class Patient {

	boolean isCaredFor = false;
	
	boolean feelsCaredFor() {
		return isCaredFor;
	}
	
	public void setCaredFor(boolean m) {
		isCaredFor = m;
	}
	
	public void checkPulse() {
		isCaredFor = true;
	}
}
