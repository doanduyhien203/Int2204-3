
public class Student {
	
	private String name,id, group, email;
	
	public Student() {
		name="Student";
		id="000";
		group="INT22041";
		email="uet@vnu.edu.vn";
	}
	
	public Student(String n, String sid, String em) {
		name = n;
		id = sid;
		email =em;
		group = "INT22041";
	}
	
	public Student(Student s) {
		name=s.getName();
		id=s.getId();
		group=s.getGroup();
		email=s.getEmail();
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getGroup() {
		return group;
	}
	public String getEmail() {
		return email;
	}
	
	public void setName(String n) {
		name= n;
	}
	public void setId(String n) {
		id= n;
	}
	public void setGroup(String n) {
		group= n;
	}
	public void setEmail(String n) {
		email= n;
	}
	
	public String getInfo() {
		return (name + " " + id + " " + group + " " + email);
	}
	
}
