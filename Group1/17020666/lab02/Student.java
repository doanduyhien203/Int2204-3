public class Student {
	private String name,id,group,email;
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
		this.name = n; 
	}
	public void setId(String n) {
		this.id=n;
	}
	public void setGroup(String n) {
		this.group=n;
	}
	public void setEmail(String n) {
		this.email=n;
	}
	public String getInfo() {
		return "Ho Ten:  "+ name +"\nMSSV: "+id +"\nGroup: " +group+"\nEmail: "+email;
	}
	public Student() {
		name = "Student";
		id = "000";
		group ="INT22041";
		email = "uet@vnu.edu.vn";
	}
	public Student(String n, String sid, String em) {
		this.name = n;
		this.id = sid;
		this.email = em;
		this.group ="INT22041";
	}
	public Student(Student s) {
		this.name=s.getName();
		this.id=s.getId();
		this.group=s.getGroup();
		this.email=s.getEmail();
	}

}
