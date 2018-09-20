
package Student;

public class Student {
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
        
        Student(){
            this.name = "Student";
            this.id = "000";
            this.group = "INT22041";
            this.email = "uet@vnu.edu.vn";
        }
        
        Student(String n, String sid, String mail){
            this.name = n;
            this.id = sid;
            this.email = mail;
            this.group = "INT22042";
        }
        
        Student(Student sv){
            this.name = sv.name;
            this.id = sv.id;
            this.group = sv.group;
            this.email = sv.email;
        }
}
