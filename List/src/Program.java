import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		//iserção de valores
		list.add("Maria");
		list.add("Jonas");
		list.add("Julia");
		
		//adição
		list.add(2, "Marcos");
		
		//remove
		list.remove("Marcos");  //valor ou index
		
		//tamanho da lista
		System.out.println(list.size());
		
		//posição na lista
		//qunado o indexOf não encontrar o valor, o resultado será -1
		System.out.println("Position: " + list.indexOf("Jonas"));
		System.out.println("-----------------------------------");
		
		System.out.println("Lista de nomes:");
		for (String nomes : list) {
			System.out.println(nomes);
		}
		
		//Filrando a lista com todos que começam com J
		//tipo stream aceita operações do tipo lambda
		System.out.println("-------------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		for (String fil : result) {
			System.out.println("Listando nomes com Letra J: " + fil);
		}
		
		//Encontrando na lista o primeiro que começe com J
		System.out.println("-------------------------------------------");
		String encontrar = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println("Encontrando primeiro nome com a Letra J: " + encontrar);
		
		System.out.println("----------------------");
		
		//Função Lambda predicado (removendo todo String x, tal que x(Nome) na posição 0 seja igual a 'J'); 
		//(retorna true or false)
		list.removeIf(x -> x.charAt(0) == 'J'); 
		
		for (String nomes : list) {
			System.out.println(nomes);
		}
		

	}

}
