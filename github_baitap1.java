
import java.until.Scanner;

public class Bai1 {
       public static void main(String[] args) {
                int a,b;
                Scanner sc = new Scanner(System.in);

                System.out.println("Nhap a : ");
                a = sc.nextInt();
                System.out.println("nhap b : ");
                b = sc.nextInt();

                System.out.println("Tong la " +(a+b));
                System.out.println("Hieu la " -(a-b));
                System.out.println("Tich la " *(a*b));
                System.out.println("Thuong la " /(a/b));
                System.out.println("Chia lay du" + a + " va " + b + " = " + (a%b));

                if(a>b) {
                        System.out.println(a +" > " + b);
                }else{
                        if(a<b)System.out.println(a + " < " + b );
                }
                if(a==b)System.out.println(a + " = " +b );
    


            }
}