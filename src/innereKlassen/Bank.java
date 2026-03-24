package innereKlassen;

public class Bank {
	
	public class Account {
		private  double balance = 0.00;
		public  double showBalance() {
			return balance;
		}
		public void deposit(double amount) {
			balance = balance + amount;
		}
	}
	
	public static void main(String[]args) {
		Bank b = new Bank();
		Bank.Account a = b.new Account();
		a.deposit(10);
		System.out.println(a.showBalance());
	}
}
