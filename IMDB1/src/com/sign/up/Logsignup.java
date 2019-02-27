package com.sign.up;

public class Logsignup {
	private String firstname;
	private String email_id;
	private String cre_pwd;
	private String con_pwd;
	private long number;
	public Logsignup(String firstname, String email_id, String cre_pwd, String con_pwd, long number) {
		super();
		this.firstname = firstname;
		this.email_id = email_id;
		this.cre_pwd = cre_pwd;
		this.con_pwd = con_pwd;
		this.number = number;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail(String email_id) {
		this.email_id = email_id;
	}
	public String getCre_pwd() {
		return cre_pwd;
	}
	public void setCre_pwd(String cre_pwd) {
		this.cre_pwd = cre_pwd;
	}
	public String getCon_pwd() {
		return con_pwd;
	}
	public void setCon_pwd(String con_pwd) {
		this.con_pwd = con_pwd;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Logsignup [firstname=" + firstname + ", email=" + email_id + ", cre_pwd=" + cre_pwd + ", con_pwd="
				+ con_pwd + ", number=" + number + "]";
	}
	

}
