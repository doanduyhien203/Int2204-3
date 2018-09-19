/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Admin
 */
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId(){
        return name;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getInfor(){
        return "Name:" + name + "\nID:" + id +
                "\nGroup:" + group + "\nEmail:" + email; 
    }
    
    public Student(){
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";
    }
    
    public Student(String n, String sid, String em){
        this.name = n;
        this.id = sid;
        this.group = "INT22041";
        this.email = em;
    }
    
    public Student(Student s){
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
}
