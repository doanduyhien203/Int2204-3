package Lb2;

public class StudentManagement {
        public static void main(String[] args) {
            Student sv = new Student();  //Tạo mới 1 sinh viên
            StudentManagement SV = new StudentManagement();
            //Tạo thông tin sinh viên
            sv.setName("Nguyen Minh Hieu");
            sv.setid("1702076");
            sv.setgroup("INT22042");
            sv.setemail("nobi.nobita.nb@gmail.com");

            System.out.println(sv.getInfo()); //In ra màn hình thông tin sinh viên
            System.out.println("---------");
            //câu 8
            Student sv1 = new Student(); //Khởi tạo không tham số
            Student sv2 = new Student("Hieu","17020746","nb@gmail.com"); //Khởi tạo có tham số
            Student sv3 = new Student(sv1); //Khởi tao sao chép

            System.out.println("Sinh Viên 1: \n" + sv1.getInfo());
            System.out.println("----------");
            System.out.println("Sinh Viên 2: \n" + sv2.getInfo());
            System.out.println("----------");
            System.out.println("Sinh viên 3: \n" + sv3.getInfo());
            System.out.println("----------");

            //So sánh 2 sinh viên cùng lớp hay khác lớp
            if(SV.sameGroup(sv1, sv3)){
                System.out.println("Sv1 và Sv3 Cùng Lớp");
            } else {
                System.out.println("Sv1 và Sv3 Khác Lớp");
            }

            if(SV.sameGroup(sv1, sv2)){
                System.out.println("Sv1 và Sv2 Cùng Lớp");
            } else {
                System.out.println("Sv1 và Sv2 Khác Lớp");
            }


            //Tạo mảng chứa các sinh viên
            SV.arr[0] = new Student("Hieu","17020745","nb@gmail.com");
            SV.arr[1] = new Student("Mai","17020747","nb@gmail.com");
            SV.arr[2] = new Student("Hoa","17020746","nb@gmail.com");
            SV.arr[3] = new Student("Ngan", "17020747", "nbc@gmail.com");
            SV.arr[3].setgroup("INT22041");
            System.out.println("-------------");
            System.out.println("Danh sách sinh viên được tạo: \n");
            for(int i = 0; SV.arr[i] != null; i++){
                System.out.println(SV.arr[i].getInfo());
                System.out.println("*********");
            }

            SV.studentsbyGroup(); //Gọi phương thức xuất ra tên sv theo lớp

            String k = "17020746";
            SV.removestudents(k); //Gọi phương thức xóa sinh viên theo mssv
            //Xuat danh sach sau khi xoa
            System.out.println("Danh sách sinh viên sau khi xóa: ");
            for(int i = 0; SV.arr[i] != null; i++){
                System.out.println(SV.arr[i].getInfo());
                System.out.println("*********");
            }
        }

        Student[] arr = new Student[100]; //Mảng chứa sinh viên

        //Hàm kiểm tra 2 sinh viên có cùng lớp không
        public boolean sameGroup(Student s1, Student s2){
            return (s1.getgroup().equals(s2.getgroup()));
        }

        //Xuất sinh viên theo lớp
        public void studentsbyGroup(){
            System.out.println("\n-------------------\n");
            System.out.println("Thông tin sinh viên");
            System.out.println("\nLớp INT22041\n");
            for(int i = 0; arr[i] != null; i++){
                if(arr[i].getgroup().equals("INT22041")){
                    System.out.println(arr[i].getInfo());
                    System.out.println("------------");
                }
            }
            System.out.println("\nLớp INT22042\n");
            for(int i = 0; arr[i] != null; i++){
                if(arr[i].getgroup().equals("INT22042")){
                    System.out.println(arr[i].getInfo());
                    System.out.println("------------");
                }
            }
        }

        //Xóa sinh viên theo mssv
        public void removestudents(String k)
        {
            for(int i = 0; arr[i] != null; i++)
            {
                if(arr[i].getid().equals(k))
                {
                    for(int j = i; arr[j] != null; j++)
                    {
                        arr[j] = arr[j+1];
                        i--;
                    }
                }
            }
        }
    }

