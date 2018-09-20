public class StudentManagement {
	
	private
	Student students[] = new Student[100];
	int size = 0;
	int classize = 0;
	String classname[] = new String[100];
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

	public void addStudent(Student s) {
		if(size<=100){
			students[size] = s;
			size++;
		}else{
			System.out.println("Số người đã đạt giới hạn.");
		}
	}
    public static boolean sameGroup(Student s1, Student s2) {
        // TODO
        return (s1.getGroup().equals(s2.getGroup())); // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
		classize = 0;
		for (int index = 0; index < size; index++) {
			boolean check = true;
			for (int i = 0; i <= classize; i++) {
				if (students[index].getGroup().equals(classname[i])) {
					check = false;
					break;
				}
			}
			if (check) {
				classname[classize] = students[index].getGroup();
				classize++;
			}
		}
		for (int i = 0; i < classize; i++) {
			System.out.print("*Lớp " + classname[i]);
			System.out.println(":");
			System.out.println("-----------------------");
			for (int j = 0; j < size; j++) {
				if (students[j].getGroup().equals(classname[i])) {
					// System.out.println(students[j].getName());
					students[j].getInfo();
					System.out.println("");
				}
			}
		}
    }

    void removeStudent(String id) {
        // TODO:
		for (int i = 0; i < size; i++) {
			if (students[i].getId().equals(id)) {
				for (int j = i; j < size; j++) {
					students[j] = students[j + 1];
				}
				size--;
				break;
			}
		}
    }

    public static void main(String[] args) {
        // TODO:
		Student s = new Student();
		s.setName("TRAN VAN TUAN");
		s.setGroup("INT22033");
		s.setId("17021033");
		s.setEmail("trantuan@gmail.com");
		Student s1 = new Student("tran Van A","1702xxxx","1702xxxx.gmail.com");
		Student s2 = new Student();
		Student s3 = new Student("tran Van B","17021234","17021234@vnu.edu.vn");
		Student s4 = new Student();
		s4.setName("nguyen van truong");
		s4.setGroup("INT22034");
		s4.setId("220133103");
		s4.setEmail("22011244@vnu.edu.vn");
		StudentManagement s5 = new StudentManagement();
		s5.addStudent(s1);
		s5.addStudent(s2);
		s5.addStudent(s3);
		s5.addStudent(s4);
		s5.studentsByGroup();

    }
}
