public class Student{
	
	private String name;
	private String id;
	private String group;
	private String email;
	
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
	public void setEnmail(String email) {
		this.email = email;
	}
	public void getInfo() {
		System.out.println("Name: " + this.getName());
		System.out.println("Id: " + this.getId());
		System.out.println("Group: " + this.getGroup());
		System.out.println("Email: " + this.getEmail());
		System.out.println();
	}
	public Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}
	public Student(String name, String id ,String email)
    {
        this. name = name;
        this.id = id;
        this.email = email;
        this.group = "INT22041";
    }
	public Student(Student s){
   	    this. name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
   }
   public Student(String name, String id, String group ,String email)
    {
        this. name = name;
        this.id = id;
        this.email = email;
        this.group = group;
    }
}