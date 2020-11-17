package application;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrings = Arrays.asList("Jonas", "Maria", "Gabriel");
		printList(myStrings);
	}
	
	//List<?> acaba sendo uma lista de qualquer tipo
	//porém não é possível adicionar elementos à lista
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
