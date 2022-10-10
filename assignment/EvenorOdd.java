package assignment;
import java.util.*;
public class EvenorOdd {
	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even Number...");
			
		}else {
			System.out.println("Not  a Even number...");
		}
	}

}
