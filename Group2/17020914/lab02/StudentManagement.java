public class StudentManagement{
	public void removeStudent(String id){
		
	}
	public void studentsByGroup(Student[] students){
		String[] group;
		group = new String[20];
		int k=0;
		group[k]=students[0].getGroup();
		for(int i=1;i<100;i++){
			if(group[k]!=students[i].getGroup()){
				k++;
				group[k]=students[i].getGroup();
			}
		} 
		for(int j=0;j<=k;j++){
			System.out.println(group[j]);
			for(int i=0;i<100;i++){
				if(group[j]==students[i].getGroup()) students[i].getInfo();
			}
			System.out.print("\n");
		}	
	}
	public boolean sameGroup(Student s1, Student s2){
		if(s1.getGroup()==s2.getGroup())return true;
		return false;
	}
	public static void main(String[] args){
		
		Student s1 = new Student();
		s1.setName("Nam");
		s1.setID("17020914");
		s1.setGroup("K62CD");
		s1.setEmail("tittodungdo@gmail.com");
		s1.getInfo();

		Student s2 = new Student();
		Student s3 = new Student("Nam","17020914","tittodungdo@gmail.com");
		Student s4 = new Student(s3);
		s2.getInfo();
		s3.getInfo();
		s4.getInfo();
		
		Student s5 = new Student();
		s5.setGroup("K59CLC");
		Student s6 = new Student(s5);
		StudentManagement main = new StudentManagement();
		if(main.sameGroup(s5,s6)==true)System.out.print("true");
		else System.out.print("false");
		
		Student[] students;
		students = new Student[100];

		
	}
}