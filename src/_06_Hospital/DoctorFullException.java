package _06_Hospital;

import javax.swing.JOptionPane;

public class DoctorFullException extends Exception{
	
	void popUp() {
		JOptionPane.showMessageDialog(null, "I can't handle any more patients!");
	}
	
}
