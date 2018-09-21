 public class StudentManagement {
   private Student[] Students = new Student[3];
	static public void main(String[] args){
		Student a = new Student();
		//a.getInfor();
	 
		Student b = new Student("diep", "17020633", "yenquangdiep@gmail.com");
		//b.getInfor();
		 
		Student c = new Student();
		//c.getInfor();
		 
		
		
		
		StudentManagement abc = new StudentManagement();
		abc.Students[0] = a;
		abc.Students[1] = b;
		abc.Students[2] = c;
		String lop = "INT22041";
		
		 
		abc.studentsByGroup();
		if(abc.sameGroup(a,b)){
			System.out.println("cung lop!");
		}
		else{
			System.out.println("khac lop!");
		}
	}
	
	public boolean sameGroup(Student s1, Student s2){
		if(s1.getGroup().equals(s2.getGroup())){
			return true;
		}
		else{
			return false;
		}	
	}
	
	public void studentsByGroup(){
		String[] classes = new String[100];
		int size=0, sizeClass=0, length=0;
		for(int i=0;i<this.Students.length;i++){
			if(this.Students!=null){
				size++;
			}
			else{
				break;
			}
		}
		for(int i=0;i<classes.length;i++){
			if(classes[i]!=null){
				sizeClass++;
			}
			else{
				break;
			}
		}
		int check = 0;
		for(int i=0;i<size;i++){
			for(int j=0; j<sizeClass; j++){
				if(classes[j].equals(this.Students[i].getGroup())){
					check=1;
				}
			}
			if(check!=1){
				classes[length] = this.Students[i].getGroup();
				sizeClass++;
				length++;
			}
		}
		
		for( String e: classes){
			if(e!=null){
				System.out.println(e);
				for(Student ele: Students){
					if(ele!=null){
						if(ele.getGroup().equals(e)){
							ele.getInfo();
						}
					}
				}
			}
			else{
				break;
			}
		}
		
		for(String e: classes){
			if(e!=null){
				System.out.println(e);
			}
			else{
				break;
			}
		}
	}
	
	public void removeStudent(String mssv){
		int size=0;
		for(int i=0;i<this.Students.length;i++){
			if(this.Students!=null){
				size++;
			}
		}
		for(int i=0; i<this.Students.length;i++){
			if(this.Students[i]!=null){
				if(this.Students[i].getId().equals(mssv)){
						for(int k=i; k<this.Students.length; k++){
							if(this.Students[k]!=null && k!=size-1){
								this.Students[k] = this.Students[k+1];
							}
							else{
								this.Students[size-1] = null;
								break;
							}
							
						}
					break;
				}
			}
		}
	}
}
