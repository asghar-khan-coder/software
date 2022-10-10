package assignment;

public class SumAverageDoWhile {
	public static void main(String[] args) {
		int sum = 0;
		 final int LOWERBOUND = 1;
	 int UPPERBOUND = 100;
		int number = LOWERBOUND;
		
		do {
			sum += number;
			++number;
		}while(number <= UPPERBOUND);
		double average = sum / number;
	System.out.println("The sum is " + sum);
	System.out.println("The average is " + average);
}
}
