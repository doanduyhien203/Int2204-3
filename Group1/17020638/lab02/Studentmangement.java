 public class Studentmangement{
	 public Student[] h=new Student[100];
	 public boolean sameGroup(Student s1, Student s2){
		if( s1.getGroup().equals(s2.getGroup())){
			return true;
		}
		else{
			return false;
		}
	 } 
	 
   public static void main(String args[]){
	   Student chau = new Student();
	   Studentmangement a = new Studentmangement();
	   chau.setName(" Nguyễn Thị Xuân Dung ");
	   chau.setid(" 17020638 ");
	   chau.setGroup(" k62c-d ");
	   chau.setEmail(" xuandung9799@gmail.com ");
	   System.out.println(chau.getName());
	   System.out.println(chau.getInfo());
	   
	   
	   Student hs1 = new Student();
	   Student hs2 = new Student();
	   Student hs3 = new Student();
	   hs1.setName("Nguyễn Văn A");
	   hs1.setid("12345");
	   hs1.setGroup("INT22041");
	   hs1.setEmail("abc@gmail.com");
	   hs2.setName("Nguyễn Văn B");
	   hs2.setid("67890");
	   hs2.setGroup("INT22041");
	   hs2.setEmail("def@gmail.com");
	   hs3.setName("Nguyễn Văn C");
	   hs3.setid("56478");
	   hs3.setGroup("INT22042");
	   hs3.setEmail("xyz@gmail.com");
	   
	   a.h[0] = new Student();
	   a.h[1] = new Student();
	   a.h[2] = new Student();
	   a.h[3] = new Student();
	   a.h[4] = new Student();
	   a.h[5] = new Student();
	   
	   a.h[0].setid("1");
	   a.h[1].setid("6");
	   a.h[2].setid("5");
	   a.h[3].setid("7");
	   a.h[4].setid("8");
	   a.h[5].setid("9");
	   
	   a.h[0].setGroup("IE3");
	   a.h[1].setGroup("IE3");
	   a.h[2].setGroup("IE1");
	   a.h[3].setGroup("IE6");
	   a.h[4].setGroup("IE2");
	   a.h[5].setGroup("IE5");
	   
	   
	   if(a.sameGroup(hs1,hs2)){
		   System.out.println(" cùng lớp ");
		
		a.removeStudent("6");
		a.StudentsByGroup();
		for(int i=0;a.h[i]!=null;i++) {
			System.out.println(i+a.h[i].getInfo());
		}
     }
   }
	 
	 public void StudentsByGroup(){
		Student t;
		for(int i=0;h[i]!=null;i++) {
			for(int j=0;h[j+1]!=null;j++) {
				if(h[j].getGroup().compareTo(h[j+1].getGroup())>0) {
					t=h[j];
					h[j]=h[j+1];
					h[j+1]=t;
					//sắp xếp lại danh sách theo lớp.
				}
			}
		}
	}
	
	 public void removeStudent(String id){
		for(int i=0; h[i]!=null;i++){
			if(h[i].getid().equals(id)){
				for(int j=i;h[j+1]!=null;j++){
					h[j]=h[j+1];
					h[j]=null;
					i--;
					//nếu học sinh có mã số là id thì cho nó thài (để thằng đứng sau nó thế chỗ nó)
				}
			}
			
		}
	 }
}
	 