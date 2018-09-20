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
public class Student{
	private String name, id, group, email;
	public void setName(String _name){
		name =_name;
	}
	public String getName(){
		return name;
	}
	public void setId(String _id){
		id =_id;
	}
	public String getId(){
		return id;
	}
	public void setGroup(String _group){
		group =_group;
	}
	public String getGroup(){
		return group;
	}
	public void setEmail(String _email){
		email =_email;
	}
	public String getEmail(){
		return email;
	}
	public String getInfo(){
		return(name + "\n" + id + "\n" + group + "\n" + email);
	}
	public Student(){
		name = "Student";
		id = "000";
		group = "K59CB";
		email = "uet@vnu.edu.vn";
	}
	public Student(String _name, String _id, String _email){
		name = _name;
		id = _id;
		email = _email;
		group = "K59CB";
	}
}