import java.util.*;

import student.*;

public class StudentManagement {
    private List<Student> listStudent;
    private static final int MAX_STUDENT = 100;
    public static void main(String[] args) {
        //#region 1-7
        
        // Student student = new Student("AnhDH", "17020565", "INT2204 1", "17020565@vnu.edu.vn");
        // student.getInfo();
        // Student student1 = new Student("Student", "000", "INT2204 1", "uet@vnu.edu.vn");
        // student1.getInfo();
        // Student student2 = new Student("Student", "000", "uet@vnu.edu.vn");
        // student2.getInfo();
        // Student student3 = new Student(student2);
        // student3.getInfo();
        // System.out.println("<<<<<<<<<<<<<<<<<<End 1-9");
        //#endregion
        
        //#region 10
        Student student4 = new Student("Student1", "1", "K59CLC", "1@uet.vnu.edu.vn");
        Student student5 = new Student("Student2", "2", "K59CLC", "2@uet.vnu.edu.vn");
        Student student6 = new Student("Student2", "3", "K59CB", "3@uet.vnu.edu.vn");
        StudentManagement studentManagement = new StudentManagement();
        System.out.println(studentManagement.sameGroup(student4, student5));
        System.out.println("<<<<<<<<<<<<<<<<<<<End 10");
        //#endregion

        //#region 11 - 13
        studentManagement.listStudent = new ArrayList<Student>();
        studentManagement.listStudent.add(student4);
        studentManagement.listStudent.add(student5);
        studentManagement.listStudent.add(student6);

        studentManagement.studentsByGroup();
        System.out.println();
        studentManagement.removeStudent("1");
        studentManagement.studentsByGroup();
        //#endregion
    }

    public boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }

    public void studentsByGroup(){
        Collections.sort(listStudent);
        String currentGroup = "";

        for (Student student : listStudent) {
            if(student.getGroup() != currentGroup){
                System.out.println("Nhom: " + student.getGroup());
                currentGroup = student.getGroup();
            }
            student.getInfo();
        }
    }

    public List<String> getGroups(){
        List<String> listGroup = new ArrayList<String>();
        for (Student student : listStudent) {
            if(listGroup.indexOf(student.getGroup()) == -1){
                listGroup.add(student.getGroup());
            }
        }
        return listGroup;
    }

    public void removeStudent(String id){
        for (Student student : listStudent) {
            if(student.getId() == id){
                listStudent.remove(student);
                break;
            }
        }
    }
}
