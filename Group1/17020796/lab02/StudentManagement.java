import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class StudentManagement {

   // ham check 2 student xem cung nhom khong.
    public static void sameGroup (Student s1, Student s2){
        if(s1.getGroup().equals(s2.getGroup())==true) System.out.println(s1.getName() + " cung group voi "+s2.getName());
        else System.out.println(s1.getName() + " khong cung group voi "+s2.getName());
    }
    public ArrayList <Student> students = new ArrayList<>();
   // Ham check xem trong list cac group da co group day chua
    public boolean checkList(ArrayList<String> list, String n){
        for(int i=0; i<list.size(); i++) {
            if(n.equals(list.get(i))) return true;
        }
        return false;
    }
   // ham in ra stdent cung group
    public void studentsByGroup(StudentManagement n){
        ArrayList <String> List = new ArrayList<>();            // tao list group de thong ke cac group co trong array student

        for(int i=0; i<n.students.size(); i++){
            String temp = n.students.get(i).getGroup();                 // them group moi vao list group
            if(checkList(List, temp) == false) List.add(temp);
        }

       
        // in ra cac student cung group theo thu tu cac group trong list group
        for(int i=0; i<List.size(); i++) {
            System.out.println("Group " + List.get(i) + " gom nhung sinh vien:\n");
            for(int j=0; j<students.size(); j++) {
                if(List.get(i).equals(students.get(j).getGroup())) System.out.println(students.get(j).getInfor() + "\n");
            }
            System.out.println("\n");
        }
    }
    // ham xoa sinh vien
   public ArrayList<Student> RemoveStudent ( String n, ArrayList <Student> std){
        for (int i=0;i<std.size();i++){
            if(n.equals(std.get(i).getId()) == true) {
                std.remove(i);
            }
        }
        return std;
    }



    public static void main(String [] args)
    {
        // cau 6 ,7 ,8
        Student student = new Student("Dang Ba Huy","17020796", "dangbahuy99@gmail.com" );
        Student s1 = new Student();
        student.setGroup("K62CD");                                                         
        Student s2 = new Student(student);
        s1.getInfor();
        student.getInfor();
        s2.getInfor();                      


       //tao 3 sv voi 2 sv thuoc lop INT22041 va 1 sv thuoc INT22042
       Student s1 = new Student("Huy", "1111", "111@gmail.com");
       Student s2 = new Student("Hung", "2222" , "222@gmail.com");
       Student s3 = new Student ("Hoang", "3333" , "333@gmail.com");                          
       s1.setGroup("INT22041");
       s2.setGroup("INT22041");
       s3.setGroup("INT22042");
       sameGroup(s1,s2);
       sameGroup(s2,s3);



       //test ham 2 ham studentsByGroup va RemoveStudent
        System.out.println("------------------\nNhap so luong student: ");
        Scanner scan = new Scanner(System.in);

        int n;
        n = scan.nextInt();
        scan.nextLine();
        StudentManagement studentMana = new StudentManagement();
        String name = new String(), id = new String(), gr= new String(), email = new String();
        System.out.println("Nhap ten, id, group va email:");
        for(int i=0; i<n; i++) {
                Student hs = new Student();
                name = scan.nextLine();
                id = scan.nextLine();
                gr = scan.nextLine();
                email = scan.nextLine();
                hs.setStudent(name,id,gr,email);
                studentMana.students.add(hs);
        }
        // test sinh vien trung gr
        studentMana.studentsByGroup(studentMana); 
        //test xoa student
        System.out.println("Nhap id sinh vien can xoa:");

        String z = new String();
        z = scan.nextLine();
        System.out.println("Sinh vien sau khi xoa:");
        
        studentMana.RemoveStudent(z, studentMana.students);
        for(int i=0; i<n; i++) {
            studentMana.students.get(i).getInfor();
            System.out.println("\n----------------------\n");
        }
    }

}
