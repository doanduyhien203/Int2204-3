/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;


public class StudentManagement {
    
    public Student[] hs = new Student[100];
    
    public boolean sameGroup(Student s1, Student s2){
	if( s1.getGroup().equals(s2.getGroup())){
            return true;
        }
	else{
            return false;
	}
    }
    
    public static void main(String args[]){
        
        Student a =new Student();
        Student b =new Student();
        
        Student hoang = new Student();
	hoang.setName("NGUYEN THAI DUONG");
	hoang.setId("17020656");
	hoang.setGroup("INT 22043");
	hoang.setEmail("thaiduong101999@gmail.com");
	System.out.println(hoang.getName());
	hoang.getInfo();
        
        Student hs1 = new Student("abc", "1234", "abc@gmail.com");
        Student hs2 = new Student("xyz", "5678", "xyz@gmail.com");
        Student hs3 = new Student("abcxyz", "13579", "abcxyz@gmail.com");
        hs1.setGroup("INT22041");
        hs2.setGroup("INT22043");
        hs3.setGroup("INT22043");
        
        StudentManagement sinhVien = new StudentManagement();
    public boolean sameGroup(Student s1, Student s2)
    {
        return s1.getGroup().equals(s2.getGroup());
    } 
    
    public void studentsByGroup(){
        int i,j;
        
        
        
        for(i=0;hs[i]!=null;i++)
        {
            
            for(j=0;hs[j]!=null;j++)
            {
                if(hs[j].getGroup().equals(hs[i].getGroup()))
                    hs[j].getInfo();
            }
        }
    }
    
    public void removeStudent(String id){
		for(int i=0; hs[i]!=null;i++){
			if(hs[i].getId().equals(id)){
				for(int j=i;hs[j+1]!=null;j++){
					hs[j]=hs[j+1];
					hs[j]=null;
					i--;
				}
			}
			
		}
	 }
    
    
    
}
