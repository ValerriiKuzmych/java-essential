package lambdas_stream_api_optional.sum_squares_numbers;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer>listInteger = new Random()
				.ints(1, 100)
				.limit(10)
				.boxed()
				.collect(Collectors.toList());
		
		listInteger.forEach(System.out::println);
		
		int sumSquares = listInteger.stream().map((x) -> x*x).reduce((x,y) -> x + y).get();
		
		
        System.out.println("Summe of squares: " + sumSquares);
		
		
	}

}
