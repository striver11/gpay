package gpay;
import java.util.Scanner;

public class Pinset {

	public static int settingGpin() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		boolean a=true;
		while(a)
		{
		System.out.println("please enter your gpin");
		int gpin=scan.nextInt();
		int tgpin=gpin;
		int count=0;
		while(tgpin>0)
		{
			tgpin/=10;
			count++;
		}
		if(count==4)
		{
			boolean b=true;
			while(b)
			{
			System.out.println("re-enter the pin to conform");
			int cgpin=scan.nextInt();
			if(gpin==cgpin)
			{
				return gpin;
			}
			else {
				System.out.println("re-enter the conform pin");
			}
				
			}
			
		}
		else {
			System.out.println("please enter 4 digit  gpin");
		}
		
		
			
		
	
	
	}
		return 0;
}
	public static int settingUpipin() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		boolean a=true;
		while(a)
		{
		System.out.println("please enter your upipin");
		int upipin=scan.nextInt();
		int tupipin=upipin;
		int count=0;
		while(tupipin>0)
		{
			tupipin/=10;
			count++;
		}
		if(count==6)
		{
			boolean b=true;
			while(b)
			{
			System.out.println("re-enter the upipin to conform");
			int cupipin=scan.nextInt();
			if(upipin==cupipin)
			{
				return upipin;
			}
			else {
				System.out.println("re-enter the conform upipin");
			}
				
			}
			
		}
		else {
			System.out.println("please re-enter 6 digit  upipin");
		}
		
		
			
		
	
	
	}
		return 0;
}
	static int count=1;
	//////////////////////////////////////
	public static boolean gettingpin()
	{	
		Scanner scan=new Scanner(System.in);
		gpayapp g = gpayapp.getObject();
		System.out.println("please enter gpin to enter the application");
		int userGpin=scan.nextInt();
		
		if(userGpin==g.getgpin())
		{
			return true;
			
		}
		else if(count<=2)
        {
            System.out.println("Invalid User Name or Password please enter again");
            count++;
            System.out.println("You have "+(4-count)+" more left");
            Main.login();
        }
		 else
	        {
	            System.out.println("You have entered your password or User Name wrong too many times, So your account is blocked please contact our help desk ");
	            System.out.println("Phone Number: 9456538451");
	            System.out.println("Email id   : Ewallet@gmai.com");
	            
	           
	        }
		return false;
		
		
		
	}
	
	static int count2=1;
	//////////////////////////////////////
	public static boolean gettingupipin()
	{	
		Scanner scan=new Scanner(System.in);
		gpayapp g = gpayapp.getObject();
		System.out.println("please enter upipin to enter the application");
		int userUpipin=scan.nextInt();
		
		if(userUpipin==g.getupipin())
		{
			return true;
			
		}
		else if(count2<=2)
        {
            System.out.println("Invalid User Name or Password please enter again");
            count2++;
            System.out.println("You have "+(4-count)+" more left");
            gettingupipin();
        }
		 else
	        {
	            System.out.println("You have entered your password or User Name wrong too many times, So your account is blocked please contact our help desk ");
	            System.out.println("Phone Number: 9456538451");
	            System.out.println("Email id   : Ewallet@gmai.com");
	            
	           
	        }
		return false;
		
		
		
	}
}
