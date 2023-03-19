package javacoban;
import java.util.Scanner;
public class baitap5 {
	

	
		public static void main(String[] args) {
			Scanner inp = new Scanner(System.in);
			int n;
			int tong = 0;
			do {
				System.out.println("Nhap vao so nguyen: ");
				n = inp.nextInt();
				tong += n;
			} while (tong <= 100);
			System.out.println("Tong cac so nguyen da nhap la: " + tong);
		}
	
}
