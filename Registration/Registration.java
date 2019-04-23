package Registration;
import java.util.Scanner;

public class Registration {
	
		String regLog, regPass, confPass;
	
		public boolean Registration(){
			boolean regSuc=false;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter login");
				this.regLog=sc.next();
				do {
			System.out.println("enter password");
				this.regPass=sc.next();
			System.out.println("confirm password");
				this.confPass=sc.next();
				}while(!regPass.equals(confPass));
				regSuc=true;
			return regSuc;
		}
		
		public String getRegLog() {
			return regLog;
		}
		public String getRegPass() {
			return regPass;
		}
		
}
