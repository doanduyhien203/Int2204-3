public class Student 
{
    private String name;
    private String id;
    private String group;
    private String mail;
    public void setName(String name)
	{
		this.name = name;
	}
	public void setID(String id)
	{
		this.id = id;
	}
	public void setGroup(String group)
	{
		this.group = group;
	}
	public void setMail(String mail)
	{
		this.mail = mail;
	}
    public String getName()
	{
		return name;
	}
	public String getID()
	{
		return id;
	}
	public String getGroup()
	{
		return group;
	}
	public String getMail()
	{
		return this.mail;
	}
    public String getInfo()
    {
        return name+"\t"+id+"\t"+group+"\t"+mail;
    }
	public Student()
	{
		name = "Student";
		id = "000";
		group = "INT22041";
		mail = "uet@vnu.edu.vn";
	}
    public Student(String n, String sid, String em)
	{
		this.name = n;
		this.id = sid;
		this.mail = em;
		this.group = "INT22041";
	}
	public Student(Student s)
	{
		this.name = s.name;
		this.id = s.id;
		this.group = s.group;
		this.mail = s.mail;
	}
}
