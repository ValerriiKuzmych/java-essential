package lambdas_stream_api_optional.lambdas_simple_arithmetic;

public class Main {

	public static void main(String[] args) {

		Operation add = (x, y) -> x + y;
		Operation sub = (x, y) -> x - y;
		Operation div = (x, y) -> x / y;
		Operation multiple = (x, y) -> x * y;

		System.out.println(add.calculate(10, 10));
		System.out.println(sub.calculate(10, 10));
		System.out.println(multiple.calculate(10, 10));
		
		try {
			
			System.out.println(div.calculate(10, 10));

		} catch (ArithmeticException e) {

			System.out.println(e);
		}

	}

}

@FunctionalInterface
interface Operation {

	int calculate(int x, int y);

}