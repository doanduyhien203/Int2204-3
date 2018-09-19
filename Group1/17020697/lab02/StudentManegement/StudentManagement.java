package StudentManagement;

import java.util.ArrayList;

public class StudentManagement {
	ArrayList<Student> students;
	
	public boolean sameGroup(Student s1, Student s2) {
		if(s1.getGroup().equals(s2.getGroup())) {
			return true;
		}
		return false;
	}
	
	
	public void StudentByGroup() {
		if(students.isEmpty() == true) {
			return;
		}
		for(int i=0;i<students.size();i++) {
			for(int j=i;j<students.size();j++) {
				if(sameGroup(students.get(j),students.get(i))==true) {
					students.get(j).tt = false;
					students.get(j).getInfo();
				}
			}
			for(int k=i+1;k<students.size();k++) {
				if(k == students.size()-1) {
					return;
				}
				if(sameGroup(students.get(k),students.get(i))==false && students.get(k).tt == true) {
					i=k-1;
					break;
				}
			}
		}
	}
	
	public void removeStudent(String id) {
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getGroup().equals(id)) {
				students.remove(i);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManagement SM = new StudentManagement();
		
		
		
		//testcase 1
		Student DMDuy = new Student();
		DMDuy.setName("Duy");
		DMDuy.setEmail("duycch@gmail.com");
		DMDuy.setGroup("K62IE3");
		DMDuy.setId("17020646");
		DMDuy.getInfo();
		
		
		Student OChDuy = new Student();
		OChDuy.getInfo();
		
		Student DuyNgl = new Student("DuyNgL","17020646","1234@gmail.com") ;
		DuyNgl.getInfo();
		
		Student Duys = new Student(DuyNgl);
		Duys.getInfo();
	
		Duys.setGroup("INT22041");
		OChDuy.setGroup("INT22041");
		DMDuy.setGroup("INT22042");
		
		
		if(SM.sameGroup(Duys,OChDuy)==true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
		//testcase2
		
		
		SM.students = new ArrayList<Student>();
		
		SM.students.add(new Student("Duy","001","duy@gmail.com","ie3"));
		SM.students.add(new Student("Dat","002","dat@gmail.com","ie3"));
		SM.students.add(new Student("Duc","004","duc@gmail.com","ie3"));
		SM.students.add(new Student("Dung","007","dung@gmail.com","ie2"));
		SM.students.add(new Student("Vu","012","Vu@gmail.com","ie4"));
		SM.students.add(new Student("Huy","009","huy@gmail.com","ie2"));
		SM.students.add(new Student("Hung","008","Hung@gmail.com","ie3"));
		SM.StudentByGroup();
		
	}



	
	
}
