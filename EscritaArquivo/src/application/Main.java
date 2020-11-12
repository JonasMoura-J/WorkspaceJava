package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
		
		String path = "/home/jonas/Documents/out.txt";
		
		//o FileWriter com um parametro cria/recria o arquivo, já com o parametro true, acrescenta ao arquivo existente
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line); //o write não tem quebra de linha
				bw.newLine();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
