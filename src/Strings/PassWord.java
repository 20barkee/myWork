package Strings;

public class PassWord {
	private String password;
	
	public PassWord() {
		password="1aaaaa!?";
	}
	
	public boolean setPassword(String xPassword) {
		boolean worked=false;
		if(xPassword.contains("!")&& xPassword.contains("?")&&xPassword.charAt(0)==0||xPassword.charAt(0)==1||xPassword.charAt(0)==2||xPassword.charAt(0)==3||xPassword.charAt(0)==4||xPassword.charAt(0)==5||xPassword.charAt(0)==6||xPassword.charAt(0)==7||xPassword.charAt(0)==8||xPassword.charAt(0)==9) {
			password=xPassword;
			worked=true;
		}
		return worked;
	}
	public boolean match(String possiblePassword) {
		boolean match=false;
		if(password.equals(possiblePassword)) {
			//password=possiblePassword;
			match=true;
		}
		return match;
	}
}
