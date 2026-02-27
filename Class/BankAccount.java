import java.util.Scanner;

class BankAccount{
	public int AccountNumber;
	public String OwnerName;
	public double Balance;
	
	BankAccount(int AccountNumber, String OwnerName, double Balance)
	{
		this.AccountNumber=AccountNumber;
		this.OwnerName=OwnerName;
		this.Balance=0;
	}

	public void deposit(double amount)
	{
		Balance+=amount;
		System.out.println("Amount Deposited " + amount);
		System.out.println("New Balance : " + Balance);
		return;
	}

	public void withdraw(double amount)
	{
		Balance-=amount;
		System.out.println("Amount Withdraw :" + amount);
		System.out.println("New Balance : " + Balance);
		return;
	}

	public void getBalance()
	{
		System.out.println("Balance : " + Balance);
		return;
	}
}
class Main
{
	public static void main(String[] args)

	{
		Scanner s1 = new Scanner(System.in);
		BankAccount b1 = new BankAccount(1,"Raghul",1200);

		while(true)
		{
			System.out.println("Enter the option : ");
			System.out.println("1.deposit \n 2.withdraw \n 3.getbalance \n 4.Exit");
			int option = s1.nextInt();
			if(option == 1)
			{
				System.out.println("Enter the amount :");
				double amount = s1.nextDouble();
				b1.deposit(amount);
			}
			if(option == 2)
			{
				System.out.println("Enter the amount :");
				double amount = s1.nextDouble();
				b1.withdraw(amount);
			}
			if(option == 3)
			{
				b1.getBalance();
			}
			if(option == 4)
			{
				System.out.println("Exiting....");
				break;
			}
		}
	}
}