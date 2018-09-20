package bai3;

public class Student {
	private String name,id,group,email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void getInfor()
	{
		System.out.println("Name : " + this.getName());
		System.out.println("Id : " + this.getId());
		System.out.println("Group : " + this.getGroup());
		System.out.println("Email : " + this.getEmail());
	}
	
	Student(){
		name = "Student";
		id = "000";
		group = "INT22041";
		email = "uet@vnu.edu.com";
	}
	Student(String n, String sid, String em){
		name = n;
		id = sid;
		email = em;
		group = "INT22041";
	}
	Student (Student s)
	{
		name= s.getName();
		id=s.getId();
		email=s.getEmail();
		group=s.getGroup();
	}

}
