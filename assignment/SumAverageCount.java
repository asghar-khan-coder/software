package assignment;

public class SumAverageCount {
	public static void main(String[] args) {
		int sum = 0;
		double average = 0;
		final int LOWERBOUND = 111;
		final double UPPERBOUND = 8899;
		int number = LOWERBOUND;
		
		for(int count = 1;count <= UPPERBOUND;++count) {
			sum =+ number;
			average = sum / number;
			
		}
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
	}
}
