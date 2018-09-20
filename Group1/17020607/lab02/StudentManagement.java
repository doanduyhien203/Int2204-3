package Student;

public class StudentManagement {
        public static void main(String[] args) {
            Student sv = new Student();  
            StudentManagement SV = new StudentManagement();
            //Tạo thông tin sinh viên
            sv.setName("Phạm Cơ Bình");
            sv.setid("17020607");
            sv.setgroup("INT22043");
            sv.setemail("theares654@gmail.com");

            System.out.println(sv.getInfo()); //In ra màn hình thông tin sinh viên
            System.out.println("###########");
            //câu 8
            Student sv1 = new Student(); 
            Student sv2 = new Student("Bình","17020607","theares654@gmail.com");
            Student sv3 = new Student(sv1); 

            System.out.println("Sinh Viên 1: \n" + sv1.getInfo());
            System.out.println("----------------");
            System.out.println("Sinh Viên 2: \n" + sv2.getInfo());
            System.out.println("----------------");
            System.out.println("Sinh viên 3: \n" + sv3.getInfo());
            System.out.println("----------------");

            if(SV.sameGroup(sv1, sv3)){
                System.out.println("Sinh viên 1 và sinh viên 3 cùng lớp");
            } else {
                System.out.println("Sinh viên 1 và sinh viên 3 khác lớp");
            }

            if(SV.sameGroup(sv1, sv2)){
                System.out.println("Sinh viên 1 và sinh viên 2 cùng lớp");
            } else {
                System.out.println("Sinh viên 1 và sinh viên 2 khác lớp");
            }


            SV.arr[0] = new Student("Hoa","17020753","duonghoa@gmail.com");
            SV.arr[1] = new Student("Bac","17020604","baccak@gmail.com");
            SV.arr[2] = new Student("Cuong","17020627","cuongoccho@gmail.com");
            SV.arr[3] = new Student("Dung", "17020639", "dungdang@gmail.com");
            SV.arr[3].setgroup("INT22043");
            System.out.println("------------------------");
            System.out.println("Danh sách sinh viên được tạo: \n");
            for(int i = 0; SV.arr[i] != null; i++){
                System.out.println(SV.arr[i].getInfo());
                System.out.println("             ");
            }

            SV.studentsByGroup();

            String k = "17020746";
            SV.removeStudents(k);
            
            System.out.println("Danh sách sinh viên sau khi xóa: ");
            for(int i = 0; SV.arr[i] != null; i++){
                System.out.println(SV.arr[i].getInfo());
                System.out.println("               ");
            }
        }

        Student[] arr = new Student[100];

       
        public boolean sameGroup(Student s1, Student s2){
            return (s1.getgroup().equals(s2.getgroup()));
        }

        
        public void studentsByGroup(){
            System.out.println("\n-------------------\n");
            System.out.println("Thông tin sinh viên");
            System.out.println("Lớp INT22043");
            System.out.println("-----------");
            for(int i = 0; arr[i] != null; i++){
                if(arr[i].getgroup().equals("INT22043")){
                    System.out.println(arr[i].getInfo());
                    System.out.println("------------");
                }
            }
            System.out.println("\nLớp INT220423\n");
            for(int i = 0; arr[i] != null; i++){
                if(arr[i].getgroup().equals("INT22043")){
                    System.out.println(arr[i].getInfo());
                    System.out.println("------------");
                }
            }
        }

 
        public void removeStudents(String k)
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

