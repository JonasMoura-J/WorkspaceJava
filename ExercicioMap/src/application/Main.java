package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> candidato = new TreeMap<>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				
				String nome = fields[0];
				int votos = Integer.parseInt(fields[1]);
				
				if(candidato.containsKey(nome)) {
					votos += candidato.get(nome);
					candidato.put(nome, votos);
					
				}else {
					candidato.put(nome, votos);
				}
				
				line = br.readLine();
			}
			
			for(String k : candidato.keySet()) {
				System.out.println(k + ": " + candidato.get(k));
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
