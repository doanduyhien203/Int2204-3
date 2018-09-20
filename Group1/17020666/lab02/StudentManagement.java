public class StudentManagement {

	public static boolean sameGroup(Student s1, Student s2)
	{
		if(s1.getGroup()==s2.getGroup()) return true;
		return false;
	}
	public static Student student[] = new Student[100];
	public static void main(String[] args) {
		Student student2 = new Student();
		student2.setName("VU MANH DAN");
		student2.setId("17020666");
		student2.setGroup("Group 1");
		student2.setEmail("vumanhdan99@gmail.com");
		System.out.println(student2.getName());
		System.out.println(student2.getInfo());
		student[0] = new Student();
        student[0].setGroup("INT22041");
		student[1] =new Student();
		student[1].setGroup("INT22041");
		student[2] =new Student();
		student[2].setGroup("INT22042");
		System.out.println(sameGroup(student[0],student[1]));
		
		

	}

}

