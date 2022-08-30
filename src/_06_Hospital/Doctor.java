package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void assignPatient (Patient p) throws Exception {
		if (patients.size() == 3) {
			throw new DoctorFullException();
		}
		else {
			patients.add(p);
		}
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void doMedicine() {
		for(int i = 0; i < patients.size(); i++) {
			patients.get(i).setCaredFor(true);
		}
	}
	
	public abstract boolean performsSurgery();
	
	public abstract boolean makesHouseCalls();
	
}
