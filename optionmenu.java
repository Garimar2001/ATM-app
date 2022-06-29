package atm;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
//import java.util.Scanner;


public class optionmenu extends account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyinput = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> dataInput = new HashMap<>();
	
	public void getLogin() throws IOException {
	 int x = 1;
	 System.out.println("This is my first ATM project");
	 dataInput.put(92345, 76543);
	 dataInput.put(12345, 3456);
	 do {
		 try {
			 System.out.println("Enter your Customer Number");
			 setCustomerNumber(menuInput.nextInt());
			 System.out.println("Enter your Pin Number");
			 setPinNumber(menuInput.nextInt());
		 } catch (Exception e) {
			 System.out.println("Invalid Character");
			 x++;
		 }
		 int cn = getCustomerNumber();
		 int pn = getPinNumber();
		 if(dataInput.containsKey(cn)&&dataInput.get(cn) == pn) {
			 getAccountType();
		 }
		 else
			 System.out.println("Wrong customer number and pin number");
	 }while(x==1);
	}

	public void getAccountType() {

		System.out.println(".........Welcome to ATM........");
		System.out.println("Select your Account type");
		System.out.println("1. To Checking Account");
		System.out.println("2. To Open Savings Account");
		System.out.println("3. Exit");
		//System.out.println();
		int n = menuInput.nextInt();
		switch(n)
		{
		case 1: getCheckingAccount();
		break;
		case 2: getSavingsAccount();
		break;
		case 3: System.out.println("Thank you for visiting");
		break;
		default: System.out.println("You have entered wrong choice");
		getAccountType();
		}
	}
	
	public void getCheckingAccount()
	{
		System.out.println(".........Welcome to Checking Account.......");
		System.out.println("Select option you want to proceed");
		System.out.println("1. View Balance");
		System.out.println("2. Withdraw Cash");
		System.out.println("3. Deposit Cash");
		System.out.println("4. Exit");
		int n = menuInput.nextInt();
		switch(n)
		{
		case 1: System.out.println("Current Account Balance:" + moneyinput.format(getCheckCurrentBalance()));
		getCheckingAccount();
		break;
		
		case 2: getCheckingWithdrawInput();
		getCheckingAccount();
		break;
		
		case 3: getCheckingDepositCashInput();
		getCheckingAccount();
		break;
		
		case 4: System.out.println("Thank you for visiting");
		getAccountType();
		break;
		
		default: System.out.println("You have entered wrong choice");
		getCheckingAccount();
		}
		
	}
	
	public void getSavingsAccount()
	{
		System.out.println(".........Welcome to Savings Account.......");
		System.out.println("Select option you want to proceed");
		System.out.println("1. View Balance");
		System.out.println("2. Withdraw Cash");
		System.out.println("3. Deposit Cash");
		System.out.println("4. Exit");
		int n = menuInput.nextInt();
		switch(n)
		{
		case 1: System.out.println("Current Account Balance:" + moneyinput.format(getSavingsCurrentBalance()));
		getSavingsAccount();
		break;
		
		case 2: getSavingsWithdrawInput();
		getSavingsAccount();
		break;
		
		case 3: getSavingsDepositCashInput();
		getSavingsAccount();
		break;
		
		case 4: System.out.println("Thank you for visiting");
		getAccountType();
		break;
		
		default: System.out.println("You have entered wrong choice");
		getSavingsAccount();
		}
	}
}
