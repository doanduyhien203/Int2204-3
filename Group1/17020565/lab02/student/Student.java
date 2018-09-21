package student;

public class Student implements Comparable<Student>{
    private String name;
    private String id;
    private String group;
    private String email;

    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "INT22041";
        this.email = email;
    }

    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public Student() {
        this.name = "";
        this.id = "";
        this.group = "";
        this.email = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getId() {
        return id;
    }

    public void setId(String newId) {
        id = newId;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String newGroup) {
        group = newGroup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public void getInfo() {
        System.out.println("Ten Sv: " + name);
        System.out.println("Ma Sv: " + id);
        System.out.println("Lop: " + group);
        System.out.println("Email Sv: " + email);
        System.out.println("========================>");
    }
    @Override
    public int compareTo(Student s) {
        return group.compareTo(s.getGroup());
    }
    
}