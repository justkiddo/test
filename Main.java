package Registration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> Users = new ArrayList<Person>();
		Registration reg = new Registration();
		FirstWindow fw = new FirstWindow();
		LogIn log = new LogIn();
		Person Admin = new Person("test","1234", true);
		Users.add(Admin);
		Scanner sc = new Scanner(System.in);
		for(;;) {
			
//		if(fw.firstWindow()==2) {
//			System.out.println("you pressed 2");
//			reg.Registration();
//			Person User = new Person(reg.getRegLog(), reg.getRegPass());
//			Users.add(User);
//		}
		 if(fw.firstWindow()==1) {
			System.out.println("you pressed 1");
			String Login, Password;
			int Exit;
			log.logIn(); // in progress
			Login=log.getLog();
			Password=log.getPass();
			while(sc.nextInt()!=1) {
			for(Person x: Users) {
				// log pass equality
				if(x.getLogin().equals(Login)&&x.getPassword().equals(Password)) {
					System.out.println("welcome " + x.getLogin());
				}
				System.out.println("press 1 to exit");
				sc.nextInt();
			}
			}
		}
		for(Person x: Users) {
			System.out.println(x.getLogin()); //adds test
		}
		}
	}
}
