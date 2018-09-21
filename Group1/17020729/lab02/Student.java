package week1;
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;
    
    public void setName(String name1){
        this.name = name1;
    }
    public void setId(String mssv)
    {
        this.id = mssv;
    }
    public void setGroup(String lop)
    {
        this.group = lop;
    }
    public void setEmail( String mail){
        this.email = mail;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getGroup(){
        return group;
    }
    public String getEmail(){
        return email;
    }
    public String getInfo(){
        return name+" "+id+" "+group+" "+email;
    }
    public void Student(){
        name = "Student";
        id = "000";
        group = "int22041";
        email = "@uet.vnu.edu.vn";   
    }
    public void Student(String n, String sid, String em){
        this.name = n;
        this.id = sid;
        this.email = em;
    }
    public void Student(Student n){
        this.name = n.name;
        this.id = n.id;
        this.group = n.group;
        this.email = n.email;
    }
}
