package assignment;

public class elseif {
	public static void main(String[] args) {
		System.out.print("Enter first number : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("Enter another number : ");
		int y = sc.nextInt();
		
		if(x==y) {
			System.out.println("x is equal to y");
		}else {
			if(x>y) {
				System.out.println("x is greater than y");
			}else {
				System.out.println("x is lesser than y");
			}
		}
		
		
	}
}
