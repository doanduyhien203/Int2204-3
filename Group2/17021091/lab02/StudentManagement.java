import java.util.Vector;

public class StudentManagement {

    private Vector <Student> students = new Vector();
    public void studentsByGroup(){
        Vector <String> gr = new Vector();
        for(int i = 0;i < students.size();i ++){
            boolean yes = false;
            for(int j = 0;j < gr.size();j ++)
                if(students.get(i).getGroup().equals(gr.get(j))){
                    yes = true;
                    break;
                }
            if(!yes)
                gr.add(students.get(i).getGroup());
        }
        for(int i = 0;i < gr.size();i ++){
            System.out.println("Lop " + gr.get(i) + ": ");
            for(int j = 0;j < students.size();j ++)
                if(students.get(j).getGroup().equals(gr.get(i)))
                    System.out.println(students.get(j).getInfo());
        }
    }
    public void removeStudent(String id){
        for(int i = 0;i < students.size();i ++)
            if(students.get(i).getId().equals(id)){
                students.remove(i);
                i --;
        }
    }
    public boolean sameGroup(Student s1, Student s2){
        return (s1.getGroup().equals(s2.getGroup()));
}
    public static void main(String[] args) {
        //cau2
        Student hs1 = new Student();
        Student hs2 = new Student();
        //c6
        Student my = new Student();
        my.setName("Nguyen Van Truong");
        my.setId("17021091");
        my.setGroup("INT22043");
        my.setEmail("tdtctf1999@gmail.com");
        System.out.println(my.getInfo());
        //c8
        Student hs3 = new Student();
        Student hs4 = new Student("Tran Anh Vu", "17021000", "trananhvu@gmail.com");
        Student hs5 = new Student(hs4);
        System.out.println(hs3.getInfo());
        System.out.println(hs4.getInfo());
        System.out.println(hs5.getInfo());
        //c10
        StudentManagement t;
        t = new StudentManagement();
        Student hs6 = new Student();
        Student hs7 = new Student();
        Student hs8 = new Student();
        hs6.setGroup("INT22041");
        hs7.setGroup("INT22041");
        hs8.setGroup("INT22042");
        System.out.println(t.sameGroup(hs6, hs7));
        System.out.println(t.sameGroup(hs6, hs8));
        //c12
        t.students.add(hs1);
        t.students.add(hs2);
        t.students.add(hs3);
        t.students.add(hs4);
        t.students.add(hs5);
        t.students.add(hs6);
        t.students.add(hs7);
        t.students.add(hs8);
        t.studentsByGroup();
        //c13
        t.removeStudent("17021000");
        t.studentsByGroup();
    }
}    