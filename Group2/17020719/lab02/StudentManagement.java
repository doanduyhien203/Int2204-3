/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Admin
 */
public class StudentManagement {
    Student[] students = new Student[100];
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Hanh");
        st.setId("17020719");
        st.setGroup("K62-CE");
        st.setEmail("lehonghanh.120@gmail.com");
        System.out.println(st.getInfor());
        
        Student other1 = new Student();
        System.out.println(other1.getInfor());
        
        Student other2 = new Student("Hanh", "17020719", "lehonghanh.120@gmail");
        System.out.println(other2.getInfor());
        
        Student other3 = new Student(st);
        System.out.println(other3.getInfor());
        
        Student st1 = new Student();
        st1.setName("Chau");
        st1.setId("17020120");
        st1.setGroup("INT22041");
        st1.setEmail("chau@gmail.com");
        
        Student st2 = new Student();
        st2.setName("Dong");
        st2.setId("17020720");
        st2.setGroup("INT22041");
        st2.setEmail("dong@gmail.com");
        
        Student st3 = new Student();
        st3.setName("Tung");
        st3.setId("17021200");
        st3.setGroup("INT22042");
        st3.setEmail("tung@gmail.com");
        
        System.out.println(sameGroup(st1, st2));
        System.out.println(sameGroup(st2, st3));
    }
    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
    
    public void studentByGroup (){                                          
        Student first = new Student(students[0]);
        String presentGroup = first.getGroup();                                
        String nextGroup = " ";                                                

        boolean[] check = new boolean[students.length];                                 
        for (int i = 0; i < students.length; i++){
            Student temStudent = students[i];
            if (check[i] != true){
                if (temStudent.getGroup().equals(presentGroup)){
                    System.out.println(temStudent.getInfor());               
                    check[i] = true;                                          
                }
                else{
                    nextGroup = temStudent.getGroup();                            
                }
            }
            if (i == students.length - 1){
                i = 0;                                                    
                presentGroup = nextGroup;                                 
            }   
        }                                                                   
    }

    public void removeStudent(String id){
        int lth = 0;
        for(int i = 0; i < students.length; i++){
            if(this.students[i] != null)
                lth++;
        }
        for(int i = 0; i < lth; i++){
            if(this.students[i].getId().equals(id)){
                for(int j = i; j < lth - 1; j++)
                    this.students[j] = this.students[j+1];
            }
        }
        this.students[lth - 1] = null;
    }
}