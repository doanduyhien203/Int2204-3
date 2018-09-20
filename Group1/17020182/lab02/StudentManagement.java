package bai3;

public class StudentManagement {
	
	public static boolean SameGroup(Student s1,Student s2)
	{
		if(s1.getGroup().equals(s2.getGroup()))
		{
			return true;
		}
		else return false;
	}
	
		//khai bao mang HS co 100 phan tu
	public Student[] HS = new Student[100]; 
	
	
		// sap xep danh sach cac sinh vien cung group trong mang HS
	public void studentsByGroup() {
		String a,b;
		Student Swap;
		for(int i=0;HS[i]!=null;++i)
		{
			for(int j=i+1;HS[j]!=null;++j)
			{
				// noi chua tam group cua cac HS
				a=HS[i].getGroup();
				b=HS[j].getGroup();
				// so sanh 2 HS neu != 0 thi khac nhom neu khac nhom thi doi cho
				if(a.compareTo(b)!=0)
				{
					Swap = HS[i];
					HS[i] = HS[j];
					HS[j] = Swap;
				}
			}
		}
	}
	
	
	
	public static void main(String[] arg) {
		Student Hieu = new Student();
		
		Hieu.setName(" Diep Van hieu ");
		Hieu.setId("17020182");
		Hieu.setGroup("INT22042");
		Hieu.setEmail("diepvanhieuuet@gmail.com");
		//Hieu.getInfor();
		
		Student Hai = new Student();
		Student hoang = new Student("Hoang","17020888","hoang@gmail.com");
		// Sinh vien hoang co group mac dinh la INT220041 
		//hoang.getInfor();
		
		// kiem tra 2 sinh vien co cung group khong
		if(SameGroup(Hieu,hoang))
				{
					System.out.println(" SameGroup");
				}
		else System.out.println(" NotSameGroup");
		
	}
	
}
