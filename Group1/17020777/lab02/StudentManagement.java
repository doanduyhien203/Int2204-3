/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author MANH HOANG
 */
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
	hoang.setName("VU MANH HOANG");
	hoang.setId("17020777");
	hoang.setGroup("INT 22041");
	hoang.setEmail("vumanhhoang140799@gmail.com");
	System.out.println(hoang.getName());
	hoang.getInfo();
        
        Student hs1 = new Student("abc", "1234", "abc@gmail.com");
        Student hs2 = new Student("xyz", "5678", "xyz@gmail.com");
        Student hs3 = new Student("abcxyz", "13579", "abcxyz@gmail.com");
        hs1.setGroup("INT22041");
        hs2.setGroup("INT22041");
        hs3.setGroup("INT22042");
        
        StudentManagement sinhVien = new StudentManagement();
        if(sinhVien.sameGroup(hs1,hs2)){
            System.out.println("cunglop");
        }else System.out.println("khaclop");
        if(sinhVien.sameGroup(hs1,hs3)){
            System.out.println("cunglop");
        }else System.out.println("khaclop");
        if(sinhVien.sameGroup(hs2,hs3)){
            System.out.println("cunglop");
        }else System.out.println("khaclop");
        
       
        
        
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
