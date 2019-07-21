package _00_Text_Funkifier;

public class AllUppercase extends SpecialString {

	public AllUppercase(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		
		String empty = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			empty += s.substring(i, i+1).toUpperCase();
			
		}
		
		return empty;
	}

}