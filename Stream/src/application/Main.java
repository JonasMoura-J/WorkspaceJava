package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		//criando Stram atraves de lista
		List<Integer> list = Arrays.asList(3,4,5,6,7);
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		
		//o toArray converte a Stram para um array
		System.out.println(Arrays.toString(st1.toArray()));
		
		//criando Stram atraves do Stream of
		Stream <String> st2 = Stream.of("Jonas", "Matheus", "Joana");
		System.out.println(Arrays.deepToString(st2.toArray()));
		
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray())); //o limit devolve uma nova Stream
		
		//sequencia de Fibonacci
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}