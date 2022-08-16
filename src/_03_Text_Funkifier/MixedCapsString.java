package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) { 

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String t = unfunkifiedText;
		boolean caps = false;
		String b = "";
		for (int i = 0; i < unfunkifiedText.length(); i++) {
			if (caps) {
				b+=Character.toUpperCase(t.charAt(i));
				caps = false;
			}
			else {
				b+=Character.toLowerCase(t.charAt(i));
				caps = true;
			}
		}
		return b;
	}

}
