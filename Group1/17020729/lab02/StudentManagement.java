package week1;
public class StudentManagement {
     Student [] stud = new Student[100];
 	public boolean sameGroup(Student s1, Student s2)
	{
        	System.out.println(s1.getGroup().equals(s2.getGroup()));
	}
           
	 public void studentsByGroup()
	{
        	int n = stud.length;
   
        	System.out.println("Danh sach sinh vien lop int22041:");
        	for(int i=0;i<n;i++)
        	{
            	if(stud[i].getGroup().equals("int22041"));
                	System.out.println(stud[i].getInfo());
        	}
	}
  
	public void removeStudent(String id)
	{
        	int n=stud.length;
        	for(int i=0;i<n;i++)
        	{
            	if(stud[i].getId().equals(id))
            	{
                	int newStudSize = n-1;
                	for(int j = i ;j < newStudSize +1 ;j++)
                	{
                    	stud[j] = stud[j+1];
                		}
                		n--;
            	}
        	}
    }
       
}