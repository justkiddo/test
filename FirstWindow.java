package Registration;
import java.util.Scanner;

public class FirstWindow {
	int Action;
	public int firstWindow() {
		System.out.println("press 1 to enter\npress 2 to register");
		int Action;
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNextInt()) {
			System.out.println("only numbers, try again"); 
			sc.nextLine();
		}
		Action=sc.nextInt();
		return Action;
	}
	
	public int getAction() {
		return Action;
	}
}
