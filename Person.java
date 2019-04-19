package Registration;

public class Person {
	private String Login;
	private String Password;
	private boolean Admin;
	
	public Person(String Login, String Password) {
		this.setLogin(Login);
		this.setPassword(Password);
	}
	public Person(String Login, String Password, boolean Admin) {
		this.setLogin(Login);
		this.setPassword(Password);
		this.setAdmin(Admin);
	}
	public boolean isAdmin() {
		return Admin;
	}
	public void setAdmin(boolean admin) {
		Admin = admin;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
