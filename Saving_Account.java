import java.util.*;
import java.util.Scanner;

public class Saving_Account
{
		protected int accountnumber;
		protected double balance=0;
		protected double rate;
		int x,y;
		
		public Saving_Account()
		{
			System.out.println("Default constructor");
		}
		
		public Saving_Account(int x)
		{
			this.x=x;
		}
		
		public Saving_Account(int x, int y)
		{
			this.x=x;
			this.y=y;
		}
		
		public void deposit (double amount)
		{
			                                                                           
			if (amount > 0.0) // if the depositAmount is valid     
			balance = balance + amount; // add it to the balance
		}
	
		public boolean checkminbalance()
		{
			if(balance>=1000)
			{
					return true;
			}
			else
			{
					return false;
			}
		}
		
		public boolean withdraw(double amount) 
		{
			if(this.checkminbalance()) 
			{
				balance-=amount;
			}
			return false;
		}
		
		public void addInterest(double rate)
		{
			balance += balance * (rate/100);
		}
		
		public static void main(String args[])
		{
			int n;
			Scanner in = new Scanner(System.in);
			Saving_Account SA=new Saving_Account();
			Saving_Account SA2=new Saving_Account(1000);
			System.out.println("Value of x = " + SA2.x);
			Saving_Account SA3=new Saving_Account(500,10);
			System.out.println("Value of x & y = " + SA3.x+" & "+SA3.y);
			
		
			while(true)
			{
				System.out.println("Select any option:");
				System.out.println("1. Enter Account Number");
				System.out.println("2. Check balance");
				System.out.println("3. Deposit Amount into your account");
				System.out.println("4. Add interest");
				System.out.println("5. Withdraw amount");
				System.out.println("6. Exit");
				System.out.print("Enter your choice: ");
				n=in.nextInt();
				
				switch(n)
				{
					case 1: System.out.print("Enter the your account number: ");
							SA.accountnumber=in.nextInt();
							
						break;
					case 2: System.out.println("You current balance is Rs. "+SA.balance);
						break;
					case 3:	System.out.print("Enter the amount you want to deposit: ");
							double amt=in.nextDouble();
							SA.deposit (amt);
							System.out.println("You current available balance is Rs. "+SA.balance);
						break;
					case 4: System.out.print("Enter the rate of interest: ");
							SA.rate=in.nextDouble();
							double bal=SA.balance;
							SA.addInterest(SA.rate);
							System.out.println("Amount before interest was Rs. "+bal);
							System.out.println("Amount after"+SA.rate+"% interest is Rs. "+SA.balance);
						break;
					case 5: System.out.print("Enter the amount you want to winthdraw: ");
							double amount=in.nextDouble();
							bal=SA.balance;
							SA.withdraw(amount);
							System.out.println("Amount before withdrawal was Rs. "+bal);
							System.out.println("Amount after withdrawal is Rs. "+SA.balance);
						break;
					case 6: System.exit(0);
						break;
					default: System.out.println("Incorrect Input!");
				}
			}
		}
					
				
			


}
		