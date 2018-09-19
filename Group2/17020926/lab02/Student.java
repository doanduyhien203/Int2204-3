public class Student{	
	private String name, id, group, email;
	public String getName(){
		return this.name;
	}
	public void setName(String n){
		name = n;
	}
	public String getID(){
		return this.id;
	}
	public void setID(String n){
		id = n;
	}
	public String getGroup(){
		return this.group;
	}
	public void setGroup(String n){
		group = n;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String n){
		email = n;
	}
	public String getInfo(){
		System.out.println(getName());
		System.out.println(getID());
		System.out.println(getGroup());
		System.out.println(getEmail());
		return "\n";
	}
	public Student(){
		name = "Student";
		id = "000";
		group = "INT22041";
		email = "uet@vnu.edu.vn";
	}
	public Student(String n,String sid,String em){
		name = n;
		id = sid;
		group = "INT22041";
		email = em;
	}
	public Student(Student s){
		name = s.name;
		id=s.id;
		group=s.group;
		email=s.email;
	}
	public Student(String n,String id,String gr,String em){
		name = n;
		id = id;
		group = gr;
		email = em;
	}
}