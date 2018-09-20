/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author nguyen ngoc gioi
 */
class Student{
    boolean check = true;
    private String name;
    public String  getName(){
        return name;
    }
    public void setName( String name){
        this.name = name;
    }
    private String id;
    public String getId(){
        return id;
    }
    public void setId( String id){
        this.id = id;
    }
    private String group;
    public String getGroup(){
        return group;
    }
    public void setGroup( String group){
        this.group = group;
    }
    private String email;
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    String getInfo(){
        return "Name: " + this.name +"\nId: " + this.id
                + "\nGroup: " + this.group + "\nEmail: "
                + this.email;
    }
    Student(){
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }
    Student(String n, String sid, String em){
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }
    Student(Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
    Student(String n, String sid, String em, String gr){
        name = n;
        id = sid;
        email = em;
        group = gr;
    }
}
