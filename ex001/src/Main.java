public class Main {

	public static void main(String[] args) {
		String prod1 = "Computer";
		String prod2 = "Scanner";
		
		int age = 30;
		int code = 5290;
		char gener = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("%s, which price is R$%f \n", prod1, price1);
		System.out.printf("%s, which price is R$%f \n\n", prod2, price2);
		System.out.printf("Record: %d years old, code 5290 and gender: %s \n\n", age, code, gener);
		System.out.printf("Measue with eight decimal places: %f \n", measure);
		System.out.printf("Rouded (theree decimal places): %.2f \n",measure);
	}

}
