package Registration;
import java.util.Scanner;

public class LogIn {
		private String entLog,entPass,confPass;
		public boolean logIn() {
			boolean logSuc = false;
			Scanner scLog= new Scanner(System.in);
			System.out.println("Enter login");
			entLog=scLog.next();
			do {
			System.out.println("Enter password");
			entPass=scLog.next();
			System.out.println("Confirm password");
			confPass=scLog.next();
			}while(!entPass.equals(confPass));
			return logSuc;
		}
		public String getLog() {
			return entLog;
		}
		public String getPass() {
			return entPass;
		}
}
