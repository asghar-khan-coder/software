package assignment;

public class RunningNumSum {
	public static void main(String[] args) {
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 1000;
		int sum = 0;
		
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			sum = sum + number;
			++number;
			
			System.out.println("The sum from" + LOWERBOUND + " to " + UPPERBOUND + " is "+ sum);
		}
	}
}
