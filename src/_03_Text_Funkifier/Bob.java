package _03_Text_Funkifier;

public class Bob implements TextFunkifier{
	
	private String text;
	public Bob(String text) {
		this.text = text;
	}
	@Override 
	public String funkifyText() {
		// TODO Auto-generated method stub
		String t = text.toUpperCase();
		return t;
	}
	

}
