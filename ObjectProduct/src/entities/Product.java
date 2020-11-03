package entities;

public class Product {
	public String Name;
	public double Price;
	public int Quantity;
	
	public double totalValueInStrock() {
		return Price * Quantity;
	}
	
	public void addProducts(int quantity) {
		this.Quantity += quantity;   //this � a auto refer�ncia para o obj(explicitando o acesso ao param�tro)s
	}
	
	public void removeProducts(int quantity) {
		this.Quantity -= quantity;
		
	}
	
	public String toString() {
		
		return  Name + ", " + String.format("%.2f", Price) + ", " +  Quantity + ", " + "units total: R$" + String.format("%.2f",totalValueInStrock());
				
	}
}