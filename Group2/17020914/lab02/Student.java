public class Student{
	private String name,id,group,email;
	public String getName(){
		return name;
	}
	public String getID(){
		return id;
	}
	public String getGroup(){
		return group;
	}
	public String getEmail(){
		return email;
	}
	public void setName(String n){
 		name=n;
	} 
	public void setID(String n){
 		id=n;
	} 
	public void setGroup(String n){
 		group=n;
	} 
	public void setEmail(String n){
 		email=n;
	}
	public String getInfo(){
		System.out.println(this.getName());
		System.out.println(this.getID());
		System.out.println(this.getGroup());
		System.out.println(this.getEmail());
		return " ";
  	} 
	public Student(){
		name="Student";
		id="000";
		group="K59CB";
		email="uet@vnu.edu.com";
	}
	public Student(String n, String sid, String em){
		name=n;
		id=sid;
		group="K59CB";
		email=em;
	}
	public Student(Student s){
		name=s.name;
		id=s.id;
		group=s.group;
		email=s.email;
	}
	
}