/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;



 
public class Student{
	private String name;
	private String id;
	private String group;
	private String email;
	
	public void setName(String name){
     this.name = name;
   }
   public String getName(){
     return name;
   }
   public void setid(String id){
     this.id = id;
   }
   public String getid(){
     return id;
   }
   public void setGroup(String group){
     this.group = group;
   }
   public String getGroup(){
     return group;
   }
   public void setEmail(String email){
     this.email = email;
   }
   public String getEmail(){
     return email;
   }
  
	public String getInfo(){
	  return "Name: "+this.name+"\nId: "+this.id+"\nGroup "+this.group+"\nEmail: "+this.email;
	}
	Student(){
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}
	Student(String n,String sid,String em){
		this.name = n;
		this.id = sid;
		this.email = em;
		this.group = "INT22041";
	}
	Student (Student s){
		this.name = s.name;
		this.id = s.id;
		this.group = s.group;
		this.email = s.email;
	}
	
 }