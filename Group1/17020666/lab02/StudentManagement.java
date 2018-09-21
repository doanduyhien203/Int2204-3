public class StudentManagement {

	private Student[] students= new Student[100];
	public static void main(String args[]) {
		Student sv1 = new Student();
		Student sv =new Student("nguyen van a","012345","abc123@gmial.com");
		sv.setGroup("INT22041");
		Student sv3=new Student("nguyen van b","56789","danhandsome@gmail.com");
		sv3.setGroup("INT22042");
		StudentManagement sv2 = new StudentManagement();
		sv1.setName("VU MANH DAN");
		sv1.setId("17020666");
		sv1.setGroup("INT22041");
		sv1.setEmail("vumanhdan99@gmail.com");
		System.out.println(sv1.getName());
		System.out.println(sv1.getInfo());
		if(sv2.sameGroup(sv1, sv)==true) {
			System.out.println("Same Group");
		}
		else {
			System.out.println("Unsame Group");
		}

		if(sv2.sameGroup(sv1, sv3)==true) {
			System.out.println("Same Group");
		}
		else {
			System.out.println("Unsame Group");
		}
	}

	public  boolean sameGroup (Student s1, Student s2){
		if(s1.getGroup().equals(s2.getGroup())){
			return true;
		}
		return false;
	}
	public void removeStudent(String id) {
		
		int count=0,n=0;
		for(int i=0;students[i]!=null;i++) n++;
		for(int i=0;i<n;i++) {
			if(!students[i].getId().equals(id)) {
				students[count] = students[i];
				count++;
			}
		}
		for(int i=count;i<n;i++) {
			students[i]=null;
		}
	}

}
