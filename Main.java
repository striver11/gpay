package gpay;

public class Main {
	static int count=1;
	public static void main(String[] args) {
		int gpin = Pinset.settingGpin();
		//System.out.println(gpin);
		gpayapp g = gpayapp.getObject();
		g.setgpin(gpin);
		
		int upipin = Pinset.settingUpipin();
		//System.out.println(upipin);
		gpayapp u = gpayapp.getObject();
		u.setupipin(upipin);

	login();
	}

	public static void login() {
		if (Pinset.gettingpin()) {
			BankProcess b = new BankProcess();
			bank c = AppFactory.getBank();
			b.bankProcess(c);
		}
		
		
	}
	public static void Exit() {
		System.out.println("thank you for using application");
	}

}
