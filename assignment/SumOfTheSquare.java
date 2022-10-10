package assignment;

public class SumOfTheSquare {
	public static void main(String[] args) {
		int sum = 1;
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		int number = LOWERBOUND;
		
		for(number = 1; number <= UPPERBOUND; number++) {
			sum =+ (number * number);
				System.out.println("The Sum Of Square From 1 to 100 is " + sum);
			
		}
	}
}
