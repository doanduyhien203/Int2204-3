public class Student {
    private String name,id,group,email;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setID(String name) {
        this.id = name;
    }
    public void setGroup(String name) {
        this.group = name;
    }
    public void setemail(String name) {
        this.email = name;
    }
    public String getGroup() {
        return group;
    }
     public String getId(){
        return this.id;
     }

    public String getInfor(){
        System.out.println("---------------------\nName: " + this.name + "\nId: " + this.id + "\nGroup: "+ this.group
        + "\nEmail: " + this.email);
        return "";
    }
    public Student(){
        this.name = "Student";
        this.id = "000";
        this.group = "K59CD";
        this.email = "uet@vnu.edu.vn";
    }
    public Student(String n, String sid, String em){
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = "K59CD";
    }
    public Student(Student s){
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public Student setStudent ( String n, String id, String group, String email){
        this.name = n;
        this.id = id;
        this.group = group;
        this.email = email;
        return this;
    }
}


