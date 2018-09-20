package javaapplication1;
import java.util.Scanner;
public class StudentManagement {
    static int n=5;
    static Student[] std = new Student[100];
    static String gr[] = new String[100];
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {       
        String name,id,email;
        name ="sfsa";
        id="51131";
        email="dssa@gmail.com";
        Student s1 = new Student();
        s1.setName("Dang Anh Dung");
        s1.setId("17020639");
        s1.setGroup("INT22041");
        s1.setEmail("danganhdung1999hn@gmail.com");
        Student s1B = new Student();
        System.out.println(s1.getinfo());     
        System.out.println(s1B.getinfo());    
        Student s2 = new Student(name, id, email);
        s2.setGroup("INT22042");
        System.out.println(s2.getinfo());        
        Student s3 = new Student(s2);
        System.out.println(s3.getinfo());        
        System.out.println(sameGroup(s2, s3));
        
        std[0]=new Student("dung","17020639","dung@gmail.com");
        std[1]=new Student("bac","17020632","bac@gmail.com");
        std[2]=new Student("binh","17020631","binh@gmail.com");
        std[3]=new Student("cuong","1702063","cuong@gmail.com");
        std[4]=new Student("hoa","17020635","hoa@gmail.com");
        
        System.out.println("Danh sach sinh vien hien tai: ");
        studentByGroup();
        System.out.print("Moi ban nhap id cua sinh vien muon xoa: ");
        id = cin.nextLine();
        removeStudent(id);
        System.out.println("Danh sach sinh vien hien tai: ");
        studentByGroup();
    }
    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup() == s2.getGroup();
    }
    public static void studentByGroup(){
        gr[0] = std[0].getGroup();
        int k = 1;
        int count;
        for(int i = 0; i < n; ++i){
            count = 0;
            for(int j = 0; j < k; ++j){
                if(std[i].getGroup() != gr[j]) ++count;
                if(count == k){
                    gr[k] = std[i].getGroup();
                    ++k;
                }
            }
        }
        for(int i = 0; i < k; ++i){
            for(int j = 0; j < n; ++j){
                if(std[j].getGroup() != gr[i]) 
                    {
                    System.out.println(std[j].getinfo() + "\n");
                }
            }
        }
    }
    public static void removeStudent(String id){
        for(int i=0;i<n;i++){
            if((std[i].getId()).equals(id)){
                std[i].setName("");
                std[i].setId("");
                std[i].setGroup("");
                std[i].setEmail("");
            }
        }   
    }
}