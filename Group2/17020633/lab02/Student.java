 public class Student {
    private String name;
	private String id;
	private String group;
	private String email;
	public String  getName()
        {
            return name;
        }
	public void setName(String n)
        {
		name=n;
        }
	public String  getId()
        {
            return id;
        }
	public void setId(String n)
        {
		id=n;
	}
	public String  getGroup()
        {
	
            return group;
        }
	public void setGroup(String n){
		group=n;}
	public String  getEmail()
        {
            return email;
        }
	public void setEmail(String n){
		email=n;}
	public String getInfo()
        {
		System.out.println(name);
		System.out.println(id);
		System.out.println(group);
		System.out.println(email);
                return " ";
	}
	public Student(){
		name="Student";
		id="000";
		group="INT22041";
		email="uet@vnu.edu.vn";
		}
	public Student(String n,String sid,String em){
		 name=n;
		id=sid;
		group="INT22042";
		email=em;}
	public Student(Student s){
		name=s.getName();
		 id=s.getId();
		 group=s.getGroup();
		 email=s.getEmail();
		}
}

