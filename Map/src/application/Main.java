package application;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("telenone", "99711122");
		
		//removendo atraves da chave
		cookies.remove("email");
		
		System.out.println("telefone " + cookies.get("telenone"));
		System.out.println("Contem a chave telenone? " + cookies.containsKey("telenone"));
		
		System.out.println("Resumo");
		
		for(String k: cookies.keySet()) {
			System.out.println(k + ": " + cookies.get(k));
		}
	}

}
