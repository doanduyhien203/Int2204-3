    public class StudentManagement {
        private Student[] students = new Student[100];

        public boolean sameGroup(Student s1, Student s2)
        {
            return s1.getGroup().equals(s2.getGroup());
        }

        public void studentsByGroup()
        {
            int dem = 0,j;
            for(i=0;students[i]!=null;i++)
            {
                dem++;
                students[i]=false;
            }
        
            for(int i=0;students[i]!=null;i++)
            {
                System.out.println("Danh sach sinh vien lop "+students[i].getGroup() + ":");

                for(int j=i;students[j]!=null;j++)
                {
                    if(sameGroup(students[i], students[j]) == true && students[i]==false)
                    {
                    
                    System.out.println(students[j].getInfo());
                    System.out.println("======================");
                    students[j]=true;
                    }
                }     
            }
        }

        public void removeStudent(String id) {
            int i,j;
            int s=students.length;

            for(i = 0; i < s && students[i]!=null; ++i) {
                if (this.students[i].getId().equals(id))
                {
                    for(j = i; j < s- 1; ++j) {
                        this.students[j] = this.students[j + 1];
                    }

                    s--;
                }
            }

        }


        public static void main(String[] args) {
            Student st1 = new Student();
            st1.setName("Do Thi Huong");
            st1.setId("17020819");
            st1.setGroup("QH2017-I/CQ-C-D");
            st1.setEmail("abcd.@uet.vnu.com");

            System.out.println("Ho Ten: " + st1.getName());
            System.out.println("Thong tin: " + st1.getInfo());


            Student st2 = new Student("Do Thi Huong", "17020818", "abcd.@uet.vnu.com");
            System.out.println("==========================\nSinh vien 2:\n"+st2.getInfo()+"\n==========================");
            Student st3 = new Student();
            System.out.println("Sinh vien 3:\n"+st3.getInfo()+"\n==========================");
            Student st4 = new Student();
            System.out.println("Sinh vien 4:\n"+st4.getInfo()+"\n==========================");

            StudentManagement st123 = new StudentManagement();
            st123.sameGroup(st2,st3);
            st123.removeStudent("17020818");
            st123.studentsByGroup();
        }
    }
