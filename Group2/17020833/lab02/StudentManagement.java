package community.com;

public class StudentManagement {
	//khai báo thuộc tính students là array chứa các đối tượng thuộc lớp (max.100)
	public Student[] students = new Student[100];
	// đây là phương thức để in ra danh sách sinh viên theo từng lớp 
	public  void studentsByGroup()
	{
		System.out.println("Danh sách sinh viên K59CLC");
		for (int i =0;i<students.length;i++)
		{
			if (students[i].getGroup().equals("K59CLC"))
				System.out.println(students[i].getInfo());
			
		}
		System.out.println("Danh sách sinh viên K59CB");
		for (int j =0;j<students.length;j++)
		{
			if (students[j].getGroup().equals("K59CB"))
				System.out.println(students[j].getInfo());
			
		}
		
	}
	//đây là phương thức để kiểm tra xem 2 sinh viên s1 và s2 có cùng lớp hay không 
	public boolean sameGroup(Student s1 ,Student s2)
	{
		return s1.getGroup().equals(s2.getGroup());
	}

	// đây là phương thức để xóa sinh viên với mã số là id ra khỏi danh sách 
	public void removeStudent(String id )
	{
		int i ,j;
		int n =students.length;
		
		for (i =0;i<n && students[i]!=null;i++)
		{
			if (students[i].getId().equals(id))
			{
				int Size = n-1 ;
				for (j =i;j<Size;i++)
				{
					students[j]=students[j+1];
					
				}
				n--;
				
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();//tạo 1 đối tượng student1
		// thiết lập thông tin cho 1 sinh viên 
		student1.setName("Nguyễn Thị Khanh");
		student1.setId("17020833");
		student1.setGroup("K62 C-D");
		student1.setEmail("lord251200@gmail.com");
		System.out.println("Tên của sinh viên 1 :"+student1.getName());
		System.out.println("Thông tin của sinh viên 1 :"+student1.getInfo());
		//kiểm tra phương thức khởi tạo 
		Student student2 = new Student();
		System.out.println("Thông tin của sinh viên 2 :"+student2.getInfo());
		Student student3 = new Student("Lục Bắc Thần","123","sur@gmail.com");
		System.out.println("Thông tin của sinh viên 3 :"+student3.getInfo());
		Student student4 = new Student(student2);
		System.out.println("Thông tin của sinh viên thứ 4 :"+student4.getInfo());
		//bai 10
		Student student5 = new Student();
		Student student6 = new Student ();
		Student student7 = new Student ();
		student6.setGroup("K59CLC");
		student7.setGroup("K59CLC");
		StudentManagement sm = new StudentManagement();
		//kiểm tra 2 sinh viên có cùng lớp không 
		if (sm.sameGroup(student5,student6))
			System.out.println("Hai sinh viên cùng lớp");
		else 
			System.out.println("Hai sinh viên khác lớp ");
		
		
		
		
	}

}
