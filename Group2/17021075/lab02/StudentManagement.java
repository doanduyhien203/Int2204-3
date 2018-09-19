import java.util.Scanner;

public class StudentManagement 
{
   public Student[] std = new Student[100];
   public void studentByGroup() 
   {
		for (int i=0;i<std.length-1;i++) 
			for (int j=0;j<std.length;j++)
				if (std[i].getGroup().compareTo(std[i].getGroup())<0) {
				Student a = new Student();
				a = std[i];
				std[i] = std[j];
				std[j] = a;
			}
		
	String group = " ";
	
	int i=0,n=std.length;
	while (i<n) {
		if (std[i].getGroup().equals(group) == false) {
			group = std[i].getGroup();
			System.out.println("Cac sinh vien lop " + group + ": ");
			System.out.println(std[i].getInfo());
		}
		else {
			System.out.println(std[i].getInfo());
		}
		i++;
	}
	
	}
 
   public static boolean sameGroup(Student s1, Student s2)
	{
		return s1.getGroup().equals(s2.getGroup());
	}
   public static void main(String args[])
	{
		Student d = new Student();
		d.setName("Nguyen Thi Huyen Trang");
		d.setID("17021075");
		d.setGroup("INT22041");
		d.setMail("trang12345.vn@gmail.com");
		
		System.out.println(d.getInfo());
		
		Student s1 = new Student();
		System.out.println(s1.getInfo());
		
		Student s2 = new Student("Thao", "17021025", "17021025@vnu.com");
		System.out.println(s2.getInfo());
		
		Student s3 = new Student("Trinh", "17021083", "17021083@vnu.com");
		System.out.println(s3.getInfo());
		
		StudentManagement sm = new StudentManagement();
		System.out.println(sm.sameGroup(s2,s3));
		Scanner scan = new Scanner(System.in);
	}
	
    public void removeStudent(String id)
    {
        int n=0,i;
		for(i=0;i<std.length;i++)
		{
			if(this.std[i]!=null)
				n++;
		}
        for(i=0;i<n;i++)
        {
            if (this.std[i].getID().equals(id))
            {
                int slong = n - 1;
                for (int j = i; j < slong; j++)
                {
                    this.std[j] = this.std[j + 1];
                }
                n--;
            }
        }
		this.std[n]=null;
    }
}
