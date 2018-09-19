package Student;


public class Student {

    String name;
    String id;
    String group;
    String email;

    

  


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return "Name:" + this.name + "\n Id:" + this.id + "\n group:" + this.group + "\n email:" + this.email;
    }

    Student() {
        this.name = "student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";
    }

    Student(String n, String sid , String g, String em) {
        this.name = n;
        this.id = sid;
        this.group = "INT22041";
        this.email = em;
    }

    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
}
