package models;

public class student {
	  private int id;
      private String rollnumber;
      private String name;
      private String email;
      private String branch;
      private String section;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int id, String rollnumber, String name, String email, String branch, String section) {
		super();
		this.id = id;
		this.rollnumber = rollnumber;
		this.name = name;
		this.email = email;
		this.branch = branch;
		this.section = section;
	}
      
	
      
}
