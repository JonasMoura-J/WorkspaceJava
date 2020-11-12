package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//implemetação mais "poluída" para leitura de arquivos
		String path = "test.txt";
		
		FileReader fr = null;
		BufferedReader bf = null;
		
		try {
			fr = new FileReader(path);
			bf = new BufferedReader(fr);
			String line = bf.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bf.readLine();
				
			}
		}catch(IOException e) {
			System.out.println("error" + e.getMessage());
		}finally {
			try {
				if(bf != null) {
					bf.close();
				}
				if(fr != null) {
					fr.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
