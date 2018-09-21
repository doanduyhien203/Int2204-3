public class Student{
             private String name;
             private String id;
             private String group;
             private String email;
       public String Getname(){
                     return this.name;
}
       public String Getid(){
                     return this.id;
}
       public String Getgroup(){
                     return this.group;
}
       public String Getemail(){
                     return this.email;
}
       public void Setname(String name){
                   this.name=name;
}
       public void Setid(String id){
                   this.id=id; 
}
       public void Setgroup(String group){
                   this.group=group;
}
       public void Setemail(String email){
                   this.email=email;
}
       public String GetInfo(){
                     System.out.println(this.Getname());
                     System.out.println(this.Getid());
                     System.out.println(this.Getgroup());
                     System.out.println(this.Getemail());
              return " ";
}
       public Student(){
              name = "Student";
              id="000";
              group="K62CD";
              email="uet@vnu.edu.vn";                           
}
      public Student(String n, String sid, String em){
             this.name=n;
             this.id=sid;
             this.email=em;
             this.group="K62CD";

}
      public Student(Student s){

             this.name=s.name;
             this.id=s.id;
             this.group=s.group;
             this.email=s.email;
             
             

}


}