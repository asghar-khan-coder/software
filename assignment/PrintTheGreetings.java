package assignment;

public class PrintTheGreetings {
	public static void main(String[] args) {
		System.out.println(" Enter 1 for English.\n Enter 2 for Hindi. \n Enter 3 for french. ");
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		
		if(button == 1) {
			System.out.println("Hello");
		}else if(button == 2) {
			System.out.println("Namaste");
		}else if(button == 3) {
			System.out.println("Bonjour");
		}else {
			System.out.println("Invalid number");
		}
	}
}
