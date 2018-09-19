package Student;

/**
 *
 * @author duongvanhoa
 */
public class Studentmanagement {

    public Student[] arr = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public static void main() {
        Student sv = new Student();
        sv.name = (" Duong Van Hoa");
        sv.id = ("17020753");
        sv.group = ("INT22043");
        sv.email = ("duonghoa@gmail.com");

        System.out.println("Name:" + sv.getName());
        System.out.println("thông tin: " + sv.getInfo());
        // khai báo dữ liệu 3 sv.
        Student sv1 = new Student("Cuong", "17020627", "INT22041", "cuongve@gmail.com");
        Student sv2 = new Student("Binh", "17020607", "INT22041", "Binhlon@gmail.com");
        Student sv3 = new Student("Bac", "17020604", "INT22042", "Baccau@gmail.com");
        // sử dụng phương thức sao chép.
        Student sv4 = new Student(sv3);

        System.out.println("thông tin sv1: " + sv1.getInfo());
        System.out.println("thông tin sv2: " + sv2.getInfo());
        System.out.println("thông tin sv3: " + sv3.getInfo());

        Studentmanagement test = new Studentmanagement();

        //kiểm tra 2 sv cùng lớp hay ko .
        if (test.sameGroup(sv1, sv2) != true) {
            System.out.println("sv1 và sv2 ko cùng lớp.");
        } else {
            System.out.println("sv1 và sv2 cùng lớp.");
        }
    }

    public void removeStudent(String id) {

        int n = arr.length;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].getId().equals(id) == true) {
                x = i;
            }
        }
        for (int i = x; i < n - 1; i++) {
            arr[x] = arr[x + 1];

        }
    }
   
    public void StudentByGroup() {
         //khởi tạo dữ liệu mảng.
        arr[0] = new Student("Hoa", "17020753", "INT22043", "duonghoa@gmail.com");
        arr[1] = new Student("Binh", "17020773", "INT22041", "binh@gmail.com");
        arr[2] = new Student("Cuong", "17020627", "INT22042", "cuongve@gmail.com");
        arr[3] = new Student("Dung", "17020673", "INT22042", "dungdang@gmail.com");
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGroup().compareTo(arr[j].getGroup()) < 0) {
                    Student a = new Student();
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }

        String group = arr[0].group;
        int x = 0;
        while (x < arr.length) {
            if (arr[x].getGroup().equals(group) == true) {
                System.out.println(arr[x].getInfo());
            } else {
                System.out.println("-----------");
                System.out.println(arr[x].getInfo());
            }
            x++;
        }
    }
}
