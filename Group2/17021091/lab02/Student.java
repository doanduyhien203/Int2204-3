public class Student {
    private String name, id, group, email;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getId(){
        return id;
    }
    public void setId(String i){
        id = i;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String g){
        group = g;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String e){
        email = e;
    }
    public Student(){
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }
    public Student(String n, String sid, String em){
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }
    public Student(Student s){
        name = s.getName();
        id = s.getId();
        group = s.getGroup();
        email = s.getEmail();
    }
    public String getInfo(){
        return (name + " " + id + " " + group + " " + email);
    }
}
