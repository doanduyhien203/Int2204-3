public class StudentManagement{
	public static void studentByGroup(Student[] students){
		String[] group;
		group = new String[100];
		int a = 0;
		group[a] = students[0].getGroup();
		for(int i=0;i<100;i++){
			if(group[a] != students[i].getGroup()){
				a++;
				group[a] = students[i].getGroup();
			}
		}
		int j=a;
		for(a=0;a<=j;a++){
			for(int i=0;i<100;i++){
				if(students[i].getGroup() == group[a])	students[i].getInfo();
				else	a++;
			}
		}
		
	}
	public static boolean sameGroup(Student s1,Student s2){
		if(s1.getGroup()==s2.getGroup()){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String [] agrs){
		Student[] students;
		students = new Student[100];
		Student s1 = new Student();
		Student s2 = new Student("A","17020000","A@gmail.com");
		Student s3 = new Student(s2);
		s1.setName("Nghia");
		s1.setID("17020926");
		s1.setGroup("INT22041");
		s1.setEmail("ngocnghia@gmail.com");
		System.out.println(s1.getName());
		System.out.println("\n");
		s1.getInfo();
		s2.getInfo();
		s3.getInfo();
		System.out.println("\n");
		if(sameGroup(s1,s2)==true){
			System.out.println("cung lop");
		}
		else{
			System.out.println("khac lop");
		}
		System.out.println("\n");
		Student s4 = new Student("A","17020000","INT22041","a@gmail.com");
		Student s5 = new Student("B","17020001","INT22041","b@gmail.com");
		Student s6 = new Student("C","17020002","INT22042","c@gmail.com");
		if(sameGroup(s4,s5)==true){
			System.out.println("s4 cung lop s5");
		}
		else{
			System.out.println("s4 khac lop s5");
		}
		if(sameGroup(s4,s6)==true){
			System.out.println("s4 cung lop s6");
		}
		else{
			System.out.println("s4 khac lop s6");
		}
		System.out.println("\n");
		studentByGroup(students);
		
	}
}