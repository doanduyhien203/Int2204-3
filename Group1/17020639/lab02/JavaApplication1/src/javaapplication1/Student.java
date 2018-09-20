package javaapplication1;
public class Student {
    String name, id, group, email;

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

    public String getinfo() {
        return name+" "+id+" "+group+" "+email;
    }
     public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email="uet@vnu.edu.vn";
    }

    public Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group="INT22041";
    }
    public Student (Student s){
        this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group=s.group;
    }

    Object getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}