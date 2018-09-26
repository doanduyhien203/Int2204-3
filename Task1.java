package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
       
        boolean check = true;
        while( check )
        {
            if(a==0)
            {
                System.out.println("UCLN: "+b);
                check = false;
            }
            else if(b==0)
            {
                System.out.println("UCLN "+a);
                check = false;
            }
            else if(a>b) a %= b;
            else b %= a;
        }
        return 0;
    }

    public static int fibonacci(int n) {
       
        int f = 0;
        int f0 = 0;
        int f1 = 1;
        int i = 0;
        while(i<=n)
        {
            switch (i) {
                case 0:
                    f = 0;
                    break;
                case 1:
                    f = 1;
                    break;
                default:
                    f = f0 + f1;
                    f0 = f1;
                    f1 = f;
                    break;
            }
           i++;    
        }
        System.out.println(f);
        return 0;
    }
}