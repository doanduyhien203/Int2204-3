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
public class StudentManagenment {
     public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }
    public Student[] arr = new Student[100];
    public void studentByGroup()
    {
        Student tem = arr[0];
        String presentGroup = tem.getGroup();
        String nextGroup = "";

        int size = arr.length;
        boolean[] check = new boolean[size];
        for (int i = 0; i < size; i++)
        {
            Student temStudent = arr.length;
            if (check[i] != true)
            {
                if (temStudent.getGroup().equals(presentGroup))
                {
                    System.out.println(temStudent.getInfo());
                    check[i] = true;
                }
                else
                 {
                    nextGroup = temStudent.getGroup();

                }
                if (i == size - 1)
                {
                    i = 0;
                    presentGroup = nextGroup;
                }
            }
        }
    }
    public void removeStudent( String id){
        int n=arr.length;
        for(int i=0; i < n;i++ ){
            if(arr[i].getId().equals(id)){
                
                for(int j = i; j< n; j++){
                    arr[j] = arr[j+1];
                }
                n--;
            }
        }
        
    }



    public static void main(String[] args) {
        System.out.println("h");
        Student st1 = new Student();
        st1.setName("Ngo Ba Thieu");
        st1.setId("17021044");
        st1.setGroup("K62 CD");
        st1.setEmail("Ngobathieu99@gmail.com");
        System.out.println("fghjkl");
        Student st2 = new Student();
        
    }
}