package assignment;

public class GreetingsUsingSwitch {
	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		
		switch(button) {
		case 1 : System.out.println("hello");
		break;
		case 2 : System.out.println("namaste");
		break;
		case 3 : System.out.println("bonjour");
		break;
		default :System.out.println("invalid number");
		}
	}
}
