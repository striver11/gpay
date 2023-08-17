package gpay;
import java.util.Scanner;
public class BankProcess {
	public void bankProcess(bank c)
	{
		
		boolean b=true;
		while(b)
		{
			System.out.println("press 1 for balance \npress 2 for transfer");
			Scanner scan=new Scanner(System.in);
			int userInput=scan.nextInt();
			switch(userInput)
			{
			
			case 1:c.balance();
			break;
			case 2:c.transfer();
			}
		}
	}

}
