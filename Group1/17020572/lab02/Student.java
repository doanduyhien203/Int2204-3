package com.company;

class Student{
    private String name;
    private String id;
    private String group;
    private String email;
    boolean check = true;
    public String  getName()
    {
        return name;
    }
    public void setName( String name)
    {
        this.name = name;
    }
    public String getId()
    {
        return id;
    }
    public void setId( String id)
    {
        this.id = id;
    }
    public String getGroup()
    {
        return group;
    }
    public void setGroup( String group)
    {
        this.group = group;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    String getInfo()
    {
        return "Name: " + this.name +"\nId: " + this.id+ "\nGroup: " + this.group + "\nEmail: "+ this.email;
    }
    Student()
    {
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }
    Student(String n, String sid, String em)
    {
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }
    Student(Student s)
    {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    Student(String n, String sid, String em, String grp)
    {
        name = n;
        id = sid;
        email = em;
        group = grp;
    }


}
