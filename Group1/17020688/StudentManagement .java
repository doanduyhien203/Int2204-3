package Student;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




public class StudentManagement{

   Student[] arr=new Student[100];
    public boolean sameGroup(Student s1,Student s2)
        {
             if((s1.getGroup()).equals (s2.getGroup())) return true;
        else return false;
    }  
    public static void main(String[] args) {
        Student d ;
       d = new Student();
        Student u;
       u = new Student();
        Student c;
       c = new Student();
        Student sinhvien=new Student();
        sinhvien.setName("bui huynh duc");
        sinhvien.setId("17020688");
        sinhvien.setGroup("int2204 3");
        sinhvien.setEmail("huynhduc01693495928@gmail.com");
        System.out.println("name :"+sinhvien.getName());
        System.out.println("thong tin :"+sinhvien.getInfo());
        d.setGroup("INT22041");
        u.setGroup("INT22041");
        c.setGroup("INT22042");
        
    /**
     
     * @param s1
     * @param s2
     * @return
     */
    StudentManagement sv = new StudentManagement();
    if(sv.sameGroup(d, c))
        System.out.println("c,d cung lop");
    else
        System.out.println("d,c khac lop");
    if(sv.sameGroup(u,c))
            System.out.println("u,c cung lop");
     else
            System.out.println("u,c khac lop");
    if(sv.sameGroup(u,d))
            System.out.println("u,d cung lop");
     else
            System.out.println("u,d khac lop");
    }
     public void studentsByGroup()
     {
        
        
        
        
        for(int i=0;arr[i]!=null;i++)
        {
            
         for(int j=0;arr[j]!=null;j++)
            {
                if(arr[j].getGroup().equals(arr[i].getGroup()))
                    arr[j].getInfo();
            }
        }
    }
    
    public void removeStudent(String id){
   for(int i=0; arr[i]!=null;i++){
			if(arr[i].getId().equals(id)){
				for(int j=i;arr[j+1]!=null;j++){
					arr[j]=arr[j+1];
					arr[j]=null;
					i--;
				}
			}
			
		}
	 }
    
    
    
}
       
    
                
               
    
        
        
         
        
        
    
    



