package _06_Hospital;

public class GeneralPractitioner extends Doctor{

	@Override
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}

}
