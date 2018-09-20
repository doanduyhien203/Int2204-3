public class StudentManagement {
	public static void main(String[] args) {
	
       //Tao ra 1 sinh vien
	Student St1 = new Student();
	
	St1.setName("Dao Duy Nam") ;
	St1.setId("17020909") ;
	St1.setGroup("QH2017-I/CQ-CD") ;
	St1.setEmail("daonam230699@gmail.com") ;
	System.out.println("Ho ten sinh vien: " + St1.name);
	System.out.println("Thong tin sinh vien: ");
	St1.getInfo();

       //Phuong thuc kiem tra 2 student
    public boolean sameGroup(Student s1, Student s2) {
		return s1.getGroup().equals(s2.getGroup());
        }
    
	}
	Student St2[] = new Student();
	//Phuong thuc in thong tin sinh vien theo lop 
	public void studentByGroup() {
		for (int i=0;i<St2.length-1;i++) 
			for (int j=0;j<St2.length;j++)
				if (St2[i].getGroup().compareTo(St2[i].getGroup())<0) {
				Student A = new Student();
				A = St2[i];
				St2[i] = St2[j];
				St2[j] = A;
				}
		
	String group = " ";
	
	int i=0,n=St2.length;
	while (i<n) {
		if (St2[i].getGroup().equals(group) == false) {
			group = St2[i].getGroup();
			System.out.println("Cac sinh vien thuoc lop " + group + ": ");
			System.out.println(St2[i]);
		}
		else 
		{
			System.out.println(St2[i]);
		}
		i++;
		}
	
	}
	
	//Phuong thuc xoa sinh vien co ma sinh vien newid
	public void removeStudent(String newid) {
		int n=St2.length;
		for (int i=0;i<n;i++)
			if (St2[i].getGroup() == newid) {
				for (int j=i;j<n-1;j++)
					St2[j]=St2[j+1];
				n--;
			}
	}
}