package assignment;

public class OddEvenSum {
public static void main(String[] args) {
		
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 1000;
		int sumOdd = 0;
		int sumEven = 0;
		int number = LOWERBOUND;
		
		while(number <= UPPERBOUND) {
			if(number % 2==0) {
				sumEven += number;
			}else {
				sumOdd += number;
			}
		}
		++number;
		System.out.println("The sum of odd numbers from " + LOWERBOUND + "to" + UPPERBOUND + "is" + sumOdd);
		System.out.println("The sum of even numbers from "+ LOWERBOUND + "to" + UPPERBOUND + "is" + sumEven);
		System.out.println("The difference between the two sums is "+ (sumOdd - sumEven));
	}
}
