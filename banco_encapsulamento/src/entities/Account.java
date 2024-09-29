package entities;

public class Account {
	private int number;
	private String name;
	private double currency;
	
	public Account(String name, int number, double currency) {
		this.number = number;
		this.name = name;
		this.currency = currency;
	}
	public Account(String name, int number) {
		this.name = name;
		this.number = number;
	}
	//----------
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCurrency() {
		return currency;
	}
	//----------
	public void deposit(double num) {
		currency += num;
	}
	public void withdraw(double num) {
		currency -= (num + 5);
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", currency);
	}
	
}
