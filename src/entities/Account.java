package entities;

public class Account {

	public int number;
	public String name;
	public double initial;
	
	public Account(int number) {
			
	}
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	public Account(int number, String name, double initial) {
		super();
		this.number = number;
		this.name = name;
		this.initial = initial;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getInitial() {
		return initial;
	}
	public void setInitial(double initial) {
		this.initial = initial;
	}
	
	public double deposit(double deposit) {
		return initial += deposit;
	}
	public double withdraw(double withdraw) {
		return initial -= withdraw + 5.00;
	}
	
	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: " + String.format("$ %.2f", initial);
	}
	
	
	
	
}
