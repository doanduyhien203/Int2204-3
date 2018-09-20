package com.company;

public class StudentManagement {

    Student[] arr = new Student[100];
    public static void main (String[] args){

        Student stu = new Student(); //tao 1 sinh vien
        stu.setName("LE TUAN ANH");
        stu.setId("17020572");
        stu.setGroup("INT22043");
        stu.setEmail("abcxyz030499@gmail.com");
        System.out.println("Name: " + stu.getName());//in ra ten
        System.out.println(stu.getInfo());//in ra thong tin

        Student sv1 = new Student();//tao sv1 bang Constructor mac dinh Student()
        Student sv2 = new Student("Gioi", "INT22043", "nguyenngocgioi127@gmail.com"); //tao sv2 bang Constructor tham so hoa
        Student sv3 = new Student(stu);// tao sv3 bang constructor sao chep du lieu stu
        sv1.setGroup("INT22041");
        sv2.setGroup("INT22041");
        sv3.setGroup("INT22042");
        StudentManagement sinhVien = new StudentManagement();
        if(sinhVien.sameGroup(sv1, sv2)) //ktra 2 sv co cung lop
            System.out.println("cung lop");
        else
            System.out.println("khac lop");







        sinhVien.arr[0] = new Student("tuananh","17020572","abcxyz030499","INT22043" );
        sinhVien.arr[1] = new Student("ngocgioi","17020708","nguyenngocgioi127","INT22043");
        sinhVien.arr[2] = new Student("vanA","17020001","ohyeah","INT22043");
        sinhVien.arr[3] = new Student("thiB","17020001","hihi","INT22045");
        sinhVien.arr[4] = new Student("chipheo","17020002","doiNo","INT22045");
        sinhVien.arr[5] = new Student("thino","17020004","babycute","INT22045");
        sinhVien.arr[6] = new Student("votong","17020005","danhHo","INT22046");
        sinhVien.arr[7] = new Student("lodittham","17020006","suUongRuou","INT22046");
        System.out.println("--------------------------");

        sinhVien.studentByGroup();

        sinhVien.removeStudent("17020001");
        System.out.println("--------------------------");
        sinhVien.studentByGroup();
    }
    public void studentByGroup()
    {
        int n = 0;
        for(int j=0;arr[j]!=null;j++) n++;
        //System.out.println(n+"here");
        for(int i=0;arr[i]!=null;i++)
        {
            System.out.println(arr[i].getGroup() + ":");

            for(int j=i;arr[j]!=null;j++)
            {
                if(sameGroup(arr[i], arr[j]) == true )
                {
                    arr[j].check = false;
                    System.out.println(arr[j].getInfo());
                    System.out.println("---------");
                }
            }
            
            arr[i].check=true;
        }

    }

    public boolean sameGroup(Student s1, Student s2)
    {
        if((s1.getGroup()).equals (s2.getGroup())) return true;
        else return false;
    }
    public void removeStudent(String id)
    {
        int c=0;
        int n=0;
        for(int j=0;arr[j]!=null;j++) n++;
        for(int i=0;i<n; i++) {
            if (!arr[i].getId().equals(id)) {
                arr[c] = arr[i];
                c++;
            }
        }
        for(int i=c;i<n;i++)
        {
            arr[i]=null;
        }
    }
}