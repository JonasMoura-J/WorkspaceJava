package entities;

public class Bank {
	private int number;
	private String holder;
	private double Balance;
	
	public Bank(int number, String holder, double firstDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		this.Balance = firstDeposit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return Balance;
	}
	
	public void deposit(double d) {
		this.Balance += d;
	}
	
	public void withDraw(double w) {
		this.Balance -= (w + 5);
	}

//	public String toString() {
//		
//		return  Name + ", " + String.format("%.2f", Price) + ", " +  Quantity + ", " + "units total: R$" + String.format("%.2f",totalValueInStrock());
//				
//	}
}