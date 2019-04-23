package Registration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> Users = new ArrayList<Person>();
		Registration reg = new Registration();
		FirstWindow fw = new FirstWindow();
		LogIn log = new LogIn();
		Person Admin = new Person("test","1234", true);
		Person notAdmin = new Person("12","33");
		Users.add(notAdmin);
		Users.add(Admin);
		Scanner sc = new Scanner(System.in);
		for(;;) {
			fw.firstWindow();
	//		System.out.println(fw.getAction());
		if(fw.getAction()==2) {
			System.out.println("you pressed 2");
			reg.Registration();
			Person User = new Person(reg.getRegLog(), reg.getRegPass());
			Users.add(User);
		}
		else if(fw.getAction()==1) {
			System.out.println("you pressed 1");
			String Login, Password;
			int admAct=0,notAdmAct=0;
			log.logIn(); // in progress
			Login=log.getLog();
			Password=log.getPass();
		
			for(Person x: Users) {
				// log pass equality
				if(x.getLogin().equals(Login)&&x.getPassword().equals(Password)) {
					System.out.println("welcome " + x.getLogin());
					if(x.isAdmin()==true) {
						while(admAct!=2) {
						System.out.println("press 1 to show all users\npress 2 to exit");
						admAct=sc.nextInt();
								if(admAct==1) {
								System.out.println(Users.toString());
								}
						}
					}
					else if(x.isAdmin()==false) {
						while(notAdmAct!=1) {
							System.out.println("You can't do anything but press 1 to exit");
							notAdmAct=sc.nextInt();
						}
					}
				}
			}
			
		}
		for(Person x: Users) {
			System.out.println(x.getLogin()); //adds test
		}
		}
	}
}
