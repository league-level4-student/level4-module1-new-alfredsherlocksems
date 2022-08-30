package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addDoctor (Doctor d) {
		doctors.add(d);
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	public void addPatient (Patient p) {
		patients.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void assignPatientsToDoctors() throws Exception {
		ArrayList<Patient> temp = new ArrayList<Patient>();
		temp = patients;
		for (int i = 0; i < doctors.size(); i++) {
			for (int j = 0; j < 3; j++) {
				if (temp.size() == 0) {
					break;
				}
				doctors.get(i).assignPatient(temp.get(0));
				temp.remove(0);
			}
		}
	}
}
