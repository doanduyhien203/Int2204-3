package community.com;
/**
 * Đây là 1 class với các thuộc tính 
 * @name -tên sinh viên 
 * @id -mã số sinh viên 
 * @group -lớp học 
 * @email - địa chỉ email
 * 
 *
 */
public class Student {
	private String name ;
	private String id ;
	private String group;
	private String email;
	// tạo các phương thức get ,set cho các thuộc tính 
	public String getName ()
	{
		return this.name;
	}
	public void setName (String name )
	{
		this.name = name ;
	}
	public String getId ()
	{
		return this.id;
	}
	public void setId (String id )
	{
		this.id = id ;
	}
	public String getGroup ()
	{
		return this.group;
	}
	public void setGroup(String group)
	{
		this.group = group ;
	}
	public String getEmail ()
	{
		return this.email;
	}
	public void setEmail(String email )
	{
		this.email = email ;
	}
	//phương thức này in ra màn hình thông tin của sinh viên 
	public String getInfo()
	{
		return "\n *Tên : " + this.name + "\n *MSSV: "+this.id+ "\n *Lớp : "+this.group+"\n *Email: "+this.email;
	}
	//contructor 
	public Student()
	{
		this.name = "Student";
		this.id = "000";
		this.group = "K59CB";
		this.email = "uet@vnu.edu.vn";
		
	}
	public Student(String name ,String id ,String email)
	{
		this.name = name ; 
		this.id = id ;
		this.group = "K59CB";
		this.email = email ;
	}
	public Student (Student s )
	{
		this.name = s.name ; 
		this.id = s.id ;
		this.group = s.group;
		this.email = s.email ;
	}
	

}
