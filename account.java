package atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class account {
	int customernumber;
	int pinNumber; 
	double checkingbalance = 0;
	double savingbalance = 0;
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyinput = new DecimalFormat("'$'###,##0.00");
	public void setCustomerNumber(int customernumber)
	{
		this.customernumber = customernumber;
	}
	public void setPinNumber(int pinNumber)
	{
		this.pinNumber = pinNumber;
	}
	public int getCustomerNumber()
	{
		return (this.customernumber);
	}
	public int getPinNumber()
	{
		return (this.pinNumber);
	}
	public double getCheckCurrentBalance()
	{
		return checkingbalance;
	}
	public double getSavingsCurrentBalance()
	{
		return savingbalance;
	}
//	public double getCheckingWithdraw(double amount)
//	{
//		checkingbalance = checkingbalance - amount;
//		return checkingbalance;
//	}
//	public double getCheckDepositCash(double amount)
//	{
//		checkingbalance = checkingbalance - amount;
//		return checkingbalance;
//	}
	
//	public double getSavingsWithdraw(double amount)
//	{
//		savingbalance = savingbalance - amount;
//		return savingbalance;
//	}
//	public void getSavingsDepositCash(double amount)
//	{
//		
//	}
	public void getCheckingWithdrawInput()
	{
		System.out.println("Current balance= " + moneyinput.format(getCheckCurrentBalance()));
		System.out.println("Amount you want to Withdraw from your Checking Account");
		double amount = menuInput.nextDouble();
		if(checkingbalance-amount >= 0)
		{
			checkingbalance = checkingbalance - amount;
			System.out.println("Checking balance after withdrawing= "+ moneyinput.format(getCheckCurrentBalance()));
		}
		else
			System.out.println("Balance insufficient");
	}
	public void getCheckingDepositCashInput()
	{
		System.out.println("Current balance= " + moneyinput.format(getCheckCurrentBalance()));
		System.out.println("Amount you want to Deposit in your Checking Account");
		double amount = menuInput.nextDouble();
		if(checkingbalance+amount >= 0)
		{
			checkingbalance = checkingbalance + amount;
			System.out.println("Checking balance after depositing = "+ moneyinput.format(checkingbalance));
		}
		else
			System.out.println("Enter positive balance");
	}
	public void getSavingsWithdrawInput()
	{
		System.out.println("Current balance= " + moneyinput.format(getSavingsCurrentBalance()));
		System.out.println("Amount you want to Withdraw from your Savings Account");
		double amount = menuInput.nextDouble();
		if(savingbalance-amount >= 0)
		{
			savingbalance = savingbalance - amount;
			System.out.println("Savings balance after withdrawing= "+ moneyinput.format(savingbalance));
		}
		else
			System.out.println("Balance insufficient");
	}
	public void getSavingsDepositCashInput()
	{
		System.out.println("Current balance= " + moneyinput.format(getSavingsCurrentBalance()));
		System.out.println("Amount you want to Deposit in your Savings Account");
		double amount = menuInput.nextDouble();
		if(savingbalance+amount >= 0)
		{
			savingbalance = savingbalance + amount;
			System.out.println("Checking balance after depositing = "+ moneyinput.format(savingbalance));
		}
		else
			System.out.println("Enter positive balance");
	}
}
