package Lb2;

public class Student {
        private String name;
        private String id;
        private String group;
        private String email;

        //Getter và Setter
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

            //Khởi tạo không tham số
        Student(){
            this.name = "Student";
            this.id = "000";
            this.group = "INT22041";
            this.email = "uet@vnu.edu.vn";
        }
            //Khởi tạo có tham số
        Student(String n, String sid, String em){
            this.name = n;
            this.id = sid;
            this.email = em;
            this.group = "INT22042";
        }
            //Khởi tao sao chép
        Student(Student s){
            this.name = s.name;
            this.id = s.id;
            this.group = s.group;
            this.email = s.email;
        }

}







