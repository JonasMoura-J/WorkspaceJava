package functionString;

public class Main {

	public static void main(String[] args) {
		
		String original = "abcd FJSJLH ANB abc DEFG";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		int i = original.indexOf("bc");  //primeira ocorrencia do bc
		int j = original.lastIndexOf("bc"); //ultima ocorrencia do bc

		System.out.println("Original - "+ original);
		System.out.println("toLowerCase  - "+ s01);
		System.out.println("toUpperCase  - "+ s02);
		System.out.println("Trim  - "+ s03); //elimina espa�os ap�s e antes da cadeia
		System.out.println("Substring  - "+ s04); //nova string a partir do caracter 2
		System.out.println("Substring  - "+ s05); //nova string a partir do caracter 2 e vai at� a posi��o 9
		System.out.println("Replace  - "+ s06);
		System.out.println("IndexOF  - "+ i);
		System.out.println("lastIndexOF  - "+ j);
		
		
		//-------------------IMPORTANT-----------------------
		
		//split serve para recortar str
		String s = "Potato apple lemon";
		String[] vect= s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
