/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Zung
 */
public class StudentMangement {
 
	  static Student[] sv = new Student[100];
	 
      public static void main(String[] args){
	   Student cero = new Student();
	   cero.setName(" NKC ");
	   cero.setid(" 17020627 ");
	   cero.setGroup(" k62c-d ");
	   cero.setEmail(" nguyenkhacuong99@gmail.com ");
	   System.out.println(cero.getName());
	   System.out.println(cero.getInfo());
	   Student ss1 = new Student();
	   Student ss2 = new Student("cuong", "1007", "hsgdasgdjk");
	   Student ss3 = new Student(cero);
	  
	   

	   Student sv1 = new Student();
	   Student sv2 = new Student();
	   Student sv3 = new Student();
	   sv1.setName("Nguyen Kha Duong");
	   sv1.setid("1102");
	   sv1.setGroup("INT22041");
	   sv1.setEmail("duongkha@gmail.com");
	   sv2.setName("Nguyen Kha Son");
	   sv2.setid("1999");
	   sv2.setGroup("INT22041");
	   sv2.setEmail("sonkha@gmail.com");
	   sv3.setName("Nguyen Kha Manh");
	   sv3.setid("1992");
	   sv3.setGroup("INT22042");
	   sv3.setEmail("manhkha@gmail.com");
	   
	   
	   
	  } 
	  public boolean sameGroup(Student s1, Student s2) {
		if(s1.getGroup().equals(s2.getGroup())) {
			return true;
		}
		return false;
	}
}
