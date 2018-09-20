public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    // 7.a. phuong thuc khoi tao khong co tham so
    public Student() {
        name  = "Student";
        id    = "000";
        group = "INT22042";
        email = "uet@vnu.edu.vn";
    }
    // 7.b. phuong thuc khoi tao co tham so
    public Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.email = em;
        group = "INT22041";
    }

    // 7.c. phuong thuc khoi tao sao chep
    public Student(Student s) {
        this.name  = s.getName();
        this.id    = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

    public void setName(String name)   { this.name = name; }
    public void setId(String id)       { this.id = id; }
    public void setGroup(String group) { this.group = group; }
    public void setEmail(String email) { this.email = email; }

    public String getName()  { return name; }
    public String getId()    { return id; }
    public String getGroup() { return group; }
    public String getEmail() { return email; }

    public String getInfo() {
        return(name + " " + id + " " + group + " " + email);
    }
    // in ra man hinh ten sv, mssv, lop, email
    public void GetInfo() {
        System.out.println(getInfo());
    }

}