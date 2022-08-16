package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {
	
	public void scaryPopup() {
		JOptionPane.showMessageDialog(null, "There is an error in the program");
	}
	
	public static void testPositive(int num) throws NegativeNumberException {
		if (num < 0) {
			throw new NegativeNumberException();
		}
	}
}
