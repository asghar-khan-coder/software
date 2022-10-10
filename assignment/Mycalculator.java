package assignment;

public class Mycalculator {
public static void main(String[] args) {
		
		System.out.println("Enter a number...");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Enter another number");
		int b = sc.nextInt();
		
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		
		System.out.println("The addition  is...."+sum);
		System.out.println("The substraction is..."+sub);
		System.out.println("The multiplication is..."+mul);
		System.out.println("The division is..."+div);
		System.out.println("The modulo is..."+mod);
	}
}
