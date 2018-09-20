/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author nguyen ngoc gioi
 */
public class StudentManagement {
    Student[] arr = new Student[100];
    public static void main (String[] args){
        Student A = new Student();
        Student B = new Student();
        Student C = new Student();
        Student sv = new Student();
        sv.setName("Nguyen Ngoc Gioi");
        sv.setId("17020708");
        sv.setGroup("INT22043");
        sv.setEmail("nguyenngocgioi127@gmail.com");
        System.out.println("Name: " + sv.getName());
        System.out.println(sv.getInfo());
        Student sv1 = new Student();
        Student sv2 = new Student("Nguyen Van A", "17020112", "abc123@gmail.com");
        Student sv3 = new Student(sv);
        A.setGroup("INT22041");
        B.setGroup("INT22042");
        C.setGroup("INT22041");
        StudentManagement sinhVien = new StudentManagement();
        if(sinhVien.sameGroup(A, B)){
            System.out.println("Sinh vien A va B cung lop.");
        }else System.out.println("Sinh vien A va B khac lop.");
        if(sinhVien.sameGroup(A, C)){
            System.out.println("Sinh vien A va C cung lop.");
        }else System.out.println("Sinh vien A va C khac lop.");
        if(sinhVien.sameGroup(B, C)){
            System.out.println("Sinh vien B va C cung lop.");
        }else System.out.println("Sinh vien B va C khac lop.");
        
       
        
        sinhVien.arr[0] = new Student("ha", "112", "abc", "INT22041");
        sinhVien.arr[1] = new Student("anh", "123", "xyz", "INT22041");
        sinhVien.arr[2] = new Student("bao", "223", "abc1", "INT22042");
        sinhVien.arr[3] = new Student("hoa", "156", "ccb", "INT22043");
        sinhVien.arr[4] = new Student("anh", "121","ahh", "INT22043");
        sinhVien.studentsByGroup();
        sinhVien.removeStudent("123");
        System.out.println("    ********");
        sinhVien.studentsByGroup();
    }
    /*
    *kiem tra 2 sinh vien cung lop
    */
    public boolean sameGroup(Student s1, Student s2){
        if((s1.getGroup()).equals (s2.getGroup())) return true;
        else return false;
    }
    /*
    *in ra danh sach sinh vien theo lop
    */
    public void studentsByGroup(){
        for(int i=0; arr[i]!=null; i++){
            if(arr[i].check){
                
                System.out.println(arr[i].getGroup()+ ":");
                
                for(int j=i; arr[j]!=null; j++){
                   if(arr[j].getGroup().equals(arr[i].getGroup())){
                       System.out.println(arr[j].getInfo());
                       
                       arr[j].check = false;
                   }

                }System.out.println("________________________");
            }arr[i].check = true;       }
        
    }
    /*
    * xoa sinh vien có id cho truoc
    */
    public void removeStudent(String id){
        int n =0, c = 0;
        for(int i=0; arr[i]!=null; i++){
            n++;
        }
        for(int i=0; i<n; i++){
            if(!arr[i].getId().equals(id)){
                arr[c] = arr[i];
                c++;
            }
        }
        for(int i =c; i<n; i++){
            arr[i] = null;
        }
    }
}
