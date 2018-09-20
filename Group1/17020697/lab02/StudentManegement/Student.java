package StudentManagement;

public class Student {
	
	private String id;
	private String group;
	private String name;
	private String email;
	boolean tt;
	
	
	void getInfo() {
		System.out.println("Ten: " + name);
		System.out.println("MS sinh vien:" + id);
		System.out.println("Lop: "+ group);
		System.out.println("email: "+ email);
		System.out.println("-------------------");
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
	
	Student(){
		this.name = "Student";
		this.id = "000";
		this.group = "K59CB";
		this.email = "uet@vnu.edu.vn";
		tt= true;
	}
	
	Student(String n, String sid, String em){
		this.name = n;
		this.id = sid;
		this.email = em;
		this.group = "K59CB";
		tt= true;
	}
	Student(Student s){
		this.name = s.getName();
		this.group = s.getGroup();
		this.id = s.getId();
		this.email = s.getEmail();
		tt= true;
	}
	Student(String n, String sid, String em, String g){
		this.name = n;
		this.id = sid;
		this.email = em;
		this.group = g;
		tt= true;
	}
	
	
}
