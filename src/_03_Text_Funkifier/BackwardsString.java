package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	StringBuilder bob = new StringBuilder();
    	bob.append(unfunkifiedText);
    	bob.reverse();
        return bob.toString();

    }
}
