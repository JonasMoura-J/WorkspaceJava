package entities;

public class Product {
	private String Name;
	private double Price;
	private int Quantity;
	
	public Product(String Name, double Price, int Quantity) {  //colocando o construtor com argumentos;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
	}
	
	public Product() {
		
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return Name;
	}
	
	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		this.Price = price;
	}

	public int getQuantity() {
		return Quantity;
	}
	
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
