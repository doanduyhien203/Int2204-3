public class Student {

	//Khai bao cac thuoc tinh
	private String name, id, group, email;
	
	//Them phuong thuc cho thuoc tinh
	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public String getId() {
		return id;
	}

	public void setId(String n) {
		this.id = n;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String n) {
		this.group = n;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String n) {
		this.email = n;
	}

	public void getInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(group);
		System.out.println(email);
	}

	public Student() {
		name = "Student";
		id = "000";
		group = "K59CB";
		email = "uet@vnu.edu.vn";
	}	

	public Student(String n, String sid, String em) {
		name = n;
		id = sid;
		email = em;
		group = "K59CB";
	}

	public  Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();

	}
}
