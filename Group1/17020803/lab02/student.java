 package main;

 
 public class student {
        String name;
        String id;
        String group;
        String email;
         public void setName(String name){
             this.name = name;
        }
        String getName(){
            return name;
        }
         public void setid(String id)
        {
            this.id = id;
        }
        public String getid(){
            return id;
        }
         public void setgroup(String group){
            this.group = group;
        }
        public String getgroup(){
            return group;
        }
         public void setemail(String email){
            this.email = email;
        }
        public String getemail(){
            return email;
        }
         //Hiển thị thông tin sv
        public String getInfo(){
            return "Họ Tên: " + name + "\nMSSV: " + id + "\nLớp: " + group + "\nEmail: " + email;
        }
        
        student(){
            this.name = "Student";
            this.id = "000";
            this.group = "INT22041";
            this.email = "uet@vnu.edu.vn";
        }
        
        student(String n, String sid, String mail){
            this.name = n;
            this.id = sid;
            this.email = mail;
            this.group = "INT22042";
        }
        
        student(student sv){
            this.name = sv.name;
            this.id = sv.id;
            this.group = sv.group;
            this.email = sv.email;
        }
}