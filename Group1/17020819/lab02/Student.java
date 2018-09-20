public class Student {
    private String name, id, group, email;     //khai bao thuoc tinh cua doi tuong sinh vien


    /* Thêm phương thức getter/setter cho các thuộc tính*/
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    /**/
    public String getInfo() {
        return name + "\n" + id + "\n" + group + "\n" + email;
    }

    public Student()
    {
        name="Student";
        id="000";
        group="INT22041";
        email="uet@vnu.edu.vn";
    }
    public Student(String n,String sid,String em)
    {
        name=n;
        id=sid;
        email=em;
        group="INT22041";
    }
    public Student(Student s)
    {
        name=s.getName();
        id=s.getId();
        group=s.getGroup();
        email=s.getEmail();
    }
}
