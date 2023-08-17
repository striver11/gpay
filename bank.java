package gpay;
import java.util.Scanner;
import java.util.Random;  
public interface bank {

	int balance();
	void transfer();
}

class SBI implements bank

{
	int otpCount=0;
	static double amount=2000;
	@Override
	public int balance()
	{
	     if (Pinset.gettingupipin()) {
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println(amount);
         System.out.println("Press 'y' to exit   else 'n' ");
          char purchaseYesNo=scan.next().charAt(0);
                if(purchaseYesNo=='n')
                {
                	Main.Exit();
                }
                else if(purchaseYesNo=='y')
                {
                	System.out.println("thanks for using SBI");
                	 AppFactory.getBank();

                }
                else
                {
                    System.out.println("Invalid Input");
                }
	     }
         return 0;
	}
	@Override
	public void transfer() {
		  
        int otpCount=0;
         Scanner scan=new Scanner(System.in);
        System.out.print("Enter the amount to transfer : ");
        double enterdAmount=scan.nextDouble();
        if (Pinset.gettingupipin()) {
           
            if(enterdAmount<=amount)
                 {
                    amount=amount-enterdAmount;
                    System.out.println("Transfer done successfully");
                     System.out.println("Press 'y' Transfer again 'n' to exit :");
                      char transferAgainYesNo=scan.next().charAt(0);
                if(transferAgainYesNo=='y')
                {
                    transfer();
                }
                else if(transferAgainYesNo=='n')
                {
                	AppFactory.getBank();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
                    
                 }
            else if(enterdAmount>amount)
            {
               System.out.println("insufficiant balance");
                
            }
        }
//            break;
//         }
//         else
//         {
//            System.out.println("Invalid OTP, Please try again.");
//
//         }
//         otpCount++;
//        }
//
//
//        if(otpCount==3)
//        {
//            System.out.println("TOO MANY ATTEMPTS ACCOUNT BLOCKED");
//             System.out.println("You have entered OTP wrong too many times, So your account is blocked please contact our help desk ");
//            System.out.println("Phone Number: 9456538451");
//            System.out.println("Email id   : Ewallet@gmai.com");
//            login();
//        }
//
//          System.out.print("Do you want to check the balance press '1' for 'yes' and '0' for 'no' ");
//         int enteredNum=scan.nextInt();
//
//         if(enteredNum==1)
//         {
//            balance();
//
//         }
//         else if(enteredNum==0)
//         {
//            login();
//         }
//         else
//         {
//             System.out.println("Invlaid input please try again");
//         }
//         
//		
	}
	
}

class HDFC implements bank
{

	static double  amount=5000;
	@Override
	public int balance()
	{
		 if (Pinset.gettingupipin()) {
				
			 Scanner scan=new Scanner(System.in);
			 System.out.println(amount);
	         System.out.println("Press 'y' to exit   else 'n' ");
	          char purchaseYesNo=scan.next().charAt(0);
	                if(purchaseYesNo=='n')
	                {
	                	Main.Exit();
	                }
	                else if(purchaseYesNo=='y')
	                {
	                	System.out.println("thanks for using SBI");
	                	 AppFactory.getBank();

	                }
	                else
	                {
	                    System.out.println("Invalid Input");
	                }
		     }
	         return 0;
		
	}
	@Override
	public void transfer() {
	   Scanner scan=new Scanner(System.in);
        System.out.print("Enter the amount to transfer : ");
        double enterdAmount=scan.nextDouble();
        if (Pinset.gettingupipin()) {
           
            if(enterdAmount<=amount)
                 {
                    amount=amount-enterdAmount;
                    System.out.println("Transfer done successfully");
                     System.out.println("Press 'y' Transfer again 'n' to exit :");
                      char transferAgainYesNo=scan.next().charAt(0);
                if(transferAgainYesNo=='y')
                {
                    transfer();
                }
                else if(transferAgainYesNo=='n')
                {
                	AppFactory.getBank();
                }
                else
                {
                    System.out.println("Invalid Input");
                }
                    
                 }
            else if(enterdAmount>amount)
            {
               System.out.println("insufficiant balance");
                
            }
        }
//        int otpCount=0;
//         Scanner scan=new Scanner(System.in);
//        System.out.print("Enter the amount to purchase : ");
//        double enterdAmount=scan.nextDouble();
//        Random random = new Random();
//         int randomNumber = random.nextInt(10000) + 1;
//         System.out.println(" OTP : " + randomNumber);
//        while(otpCount<=2)
//        {
//          System.out.print("Enter OTP : ");
//          int otpEnteredByUser=scan.nextInt();
//
//         if(otpEnteredByUser==randomNumber)
//         {
//            if(enterdAmount<=amount)
//                 {
//                    amount=amount-enterdAmount;
//                    System.out.println("Purchase done successfully");
//                     System.out.println("Press 'y' Purchase again 'n' to exit :");
//                      char purchaseAgainYesNo=scan.next().charAt(0);
//                if(purchaseAgainYesNo=='y')
//                {
//                    purchase();
//                }
//                else if(purchaseAgainYesNo=='n')
//                {
//                    login();
//                }
//                else
//                {
//                    System.out.println("Invalid Input");
//                }
//                    
//                 }
//            else if(enterdAmount>amount)
//            {
//                System.out.println("Insufficiant Balance");
//                System.out.print("Press 'y' Recharge 'n' to exit :");
//                char rechargeYesNo=scan.next().charAt(0);
//                if(rechargeYesNo=='y')
//                {
//                    recharge();
//                }
//                else if(rechargeYesNo=='n')
//                {
//                    login();
//                }
//                else
//                {
//                    System.out.println("Invalid Input");
//                }
//                
//            }
//            break;
//         }
//         else
//         {
//            System.out.println("Invalid OTP, Please try again.");
//
//         }
//         otpCount++;
//        }
//
//
//        if(otpCount==3)
//        {
//            System.out.println("TOO MANY ATTEMPTS ACCOUNT BLOCKED");
//             System.out.println("You have entered OTP wrong too many times, So your account is blocked please contact our help desk ");
//            System.out.println("Phone Number: 9456538451");
//            System.out.println("Email id   : Ewallet@gmai.com");
//            login();
//        }
//
//          System.out.print("Do you want to check the balance press '1' for 'yes' and '0' for 'no' ");
//         int enteredNum=scan.nextInt();
//
//         if(enteredNum==1)
//         {
//            balance();
//
//         }
//         else if(enteredNum==0)
//         {
//            login();
//         }
//         else
//         {
//             System.out.println("Invlaid input please try again");
//         }
//         
	}
	
	
}

class ICICI implements bank
{
	static double amount=10000;

	@Override
	public int balance()
	{
		 if (Pinset.gettingupipin()) {
				
			 Scanner scan=new Scanner(System.in);
			 System.out.println(amount);
	         System.out.println("Press 'y' to exit   else 'n' ");
	          char purchaseYesNo=scan.next().charAt(0);
	                if(purchaseYesNo=='n')
	                {
	                	Main.Exit();
	                }
	                else if(purchaseYesNo=='y')
	                {
	                	System.out.println("thanks for using SBI");
	                	 AppFactory.getBank();

	                }
	                else
	                {
	                    System.out.println("Invalid Input");
	                }
		     }
	         return 0;
		
	}
	@Override
public void transfer() {
		 Scanner scan=new Scanner(System.in);
	        System.out.print("Enter the amount to transfer : ");
	        double enterdAmount=scan.nextDouble();
	        if (Pinset.gettingupipin()) {
	           
	            if(enterdAmount<=amount)
	                 {
	                    amount=amount-enterdAmount;
	                    System.out.println("Transfer done successfully");
	                     System.out.println("Press 'y' Transfer again 'n' to exit :");
	                      char transferAgainYesNo=scan.next().charAt(0);
	                if(transferAgainYesNo=='y')
	                {
	                    transfer();
	                }
	                else if(transferAgainYesNo=='n')
	                {
	                	AppFactory.getBank();
	                }
	                else
	                {
	                    System.out.println("Invalid Input");
	                }
	                    
	                 }
	            else if(enterdAmount>amount)
	            {
	               System.out.println("insufficiant balance");
	                
	            }
	        }
//		  
//        int otpCount=0;
//         Scanner scan=new Scanner(System.in);
//        System.out.print("Enter the amount to purchase : ");
//        double enterdAmount=scan.nextDouble();
//        Random random = new Random();
//         int randomNumber = random.nextInt(10000) + 1;
//         System.out.println(" OTP : " + randomNumber);
//        while(otpCount<=2)
//        {
//          System.out.print("Enter OTP : ");
//          int otpEnteredByUser=scan.nextInt();
//
//         if(otpEnteredByUser==randomNumber)
//         {
//            if(enterdAmount<=amount)
//                 {
//                    amount=amount-enterdAmount;
//                    System.out.println("transfer done successfully");
//                     System.out.println("Press 'y' transfer again 'n' to exit :");
//                      char purchaseAgainYesNo=scan.next().charAt(0);
//                if(purchaseAgainYesNo=='y')
//                {
//                    purchase();
//                }
//                else if(purchaseAgainYesNo=='n')
//                {
//                    login();
//                }
//                else
//                {
//                    System.out.println("Invalid Input");
//                }
//                    
//                 }
//            else if(enterdAmount>amount)
//            {
//                System.out.println("Insufficiant Balance");
//                System.out.print("Press 'y' Recharge 'n' to exit :");
//                char rechargeYesNo=scan.next().charAt(0);
//                if(rechargeYesNo=='y')
//                {
//                    recharge();
//                }
//                else if(rechargeYesNo=='n')
//                {
//                    login();
//                }
//                else
//                {
//                    System.out.println("Invalid Input");
//                }
//                
//            }
//            break;
//         }
//         else
//         {
//            System.out.println("Invalid OTP, Please try again.");
//
//         }
//         otpCount++;
//        }
//
//
//        if(otpCount==3)
//        {
//            System.out.println("TOO MANY ATTEMPTS ACCOUNT BLOCKED");
//             System.out.println("You have entered OTP wrong too many times, So your account is blocked please contact our help desk ");
//            System.out.println("Phone Number: 9456538451");
//            System.out.println("Email id   : Ewallet@gmai.com");
//            login();
//        }
//
//          System.out.print("Do you want to check the balance press '1' for 'yes' and '0' for 'no' ");
//         int enteredNum=scan.nextInt();
//
//         if(enteredNum==1)
//         {
//            balance();
//
//         }
//         else if(enteredNum==0)
//         {
//            login();
//         }
//         else
//         {
//             System.out.println("Invlaid input please try again");
//         }
//         
}

	
}


