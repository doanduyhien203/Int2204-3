package week1;

public class Student {
	
    // TODO: khai báo các thuộc tính cho Student
	private
	String name;
	String id;
	String group;
	String emai;
    // TODO: khai báo các phương thức getter, setter cho Student
	public String getName(){
		return name;
	}
	public String getID(){
		return id;
	}
	public String getGroup(){
		return group;
	}
	public String getEmail(){
		return emai;
	}
	public void setName(String n){
		name = n;
	}
	public void setId(String n){
		id = n;
	}
	public void setGroup(String n){
		group = n;
	}
	public void setEmai(String n){
		emai = n;
	}
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
		name = "Student";
		id = "000";
		group = "INT22033";
		emai = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
		this.name = n;
		this.id = sid;
		this.emai = em;
		this.group ="INT22033";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
		name = s.name;
		id = s.id;
		group = s.group;
		emai = s.emai;
    }

    String getInfo() {
        // TODO
		System.out.println("Ho va ten :" + name);
		System.out.println("Ma sv :" + id);
		System.out.println("Lop :" + group);
		System.out.println("Email :" + emai);
        return null; // xóa dòng này sau khi cài đặt
    }
}
