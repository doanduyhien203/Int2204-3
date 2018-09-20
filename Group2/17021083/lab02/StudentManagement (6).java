import  java.util.*;
public class StudentManagement {

    public Student[] students = new Student[100];
    private int size = 0;

    // tao mang chua danh sach sinh vien
    public void addStudent(Student s) {
        students[size] = s;
        size++;
    }

    // kiem tra 2 sinh vien co cung lop hay khong
    public boolean sameGroup(Student s1, Student s2) {
        if(s1.getGroup().equals(s2.getGroup())) {
            return true;
        }
        return false;
    }

    // in ra danh sach sinh vien theo tung lop
    public void studentsByGroup() {
        int count = 0;
        String [] arr = new String[size];   // boolean kiemTra = true;
        for (int i = 0; i < size ; i++) {
            int j = 0;
            for (j = 0; j < count ; j++) {
                if (students[i].getGroup().equals(arr[j])) {   // kiemTra = false;
                    break;
                }
            }
            if (j == count){
                arr[count] = students[i].getGroup();
                count++;
            }
        }
        for ( int i = 0; i < count; i++) {
            System.out.println(arr[i]);
            for ( int j = 0 ; j < size ; j++){
                if (students[j].getGroup().equals(arr[i])) {
                    System.out.println(students[j].getInfo());
                }
            }
        }
    }
    // xoa sinh vien voi ma id trong danh sach
    public boolean removeStudent(String id) {
        int i;
        for(i = 0; i < size; i++){
            if(students[i].getId() == id) { // tim vi tri sinh vien trong mang
                break;
            }
        }
        if(i == size) { // khong tim thay ma sinh vien can xoa
            return false;
        }
        for(int j = i; j < size - 1; j++) { // cap nhat lai mang
            students[j] = students[j+1];
        }
        size--;
        return true;
    }

    public static void main(String[] args) {
        StudentManagement test = new StudentManagement();
        Student sv1 = new Student();
        sv1.setGroup("INT22041");
        //sv1.GetInfo();
        Student sv2 = new Student("trinh", "17021083", "trinh@vnu.edu.vn");
        sv2.setGroup("INT22042");
        //sv2.GetInfo();
        Student sv3 = new Student(sv1);
        sv3.setId("001");
        //sv3.GetInfo();
        // kiem tra 2 sinh vien cung lop hay khong
        //System.out.println(test.sameGroup(sv1 , sv3));

        test.addStudent(sv1);
        test.addStudent(sv2);
        test.addStudent(sv3);

        // test phuong thuc remove
        System.out.println(test.removeStudent("001"));

        // in ra danh sach sinh vien theo tung lop
        test.studentsByGroup();
    }
}
