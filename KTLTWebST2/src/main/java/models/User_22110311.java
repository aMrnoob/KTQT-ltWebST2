package models;

import java.time.LocalDateTime;

public class User_22110311 {
	
	private int id;
    private String email;
    private String fullname;
    private int phone;
    private String passwd;
    private LocalDateTime signupDate;
    private LocalDateTime lastLogin;
    private boolean isAdmin;
    
    public User_22110311() {
		// TODO Auto-generated constructor stub
	}
    
    public User_22110311(int id, String email, String fullname, int phone, String passwd, 
    		LocalDateTime signupDate, LocalDateTime lastLogin, boolean isAdmin) {
		// TODO Auto-generated constructor stub
    	this.id = id;
    	this.email = email;
    	this.fullname = fullname;
    	this.phone = phone;
    	this.passwd = passwd;
    	this.signupDate = signupDate;
    	this.lastLogin = lastLogin;
    	this.isAdmin = isAdmin;
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public LocalDateTime getSignupDate() {
		return signupDate;
	}
	public void setSignupDate(LocalDateTime signupDate) {
		this.signupDate = signupDate;
	}
	public LocalDateTime getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}    
}
