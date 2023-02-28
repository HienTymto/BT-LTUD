
import java.util.Scanner;
public class BT1 {

	public static void main(String[] args) {
		int a,b,c,tong,tich;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nhap so nguyen thu 1: ");
		a = sc.nextInt() ;
		System.out.println("nhap so nguyen thu 2: ");
		b= sc.nextInt() ;
		System.out.println("nhap so nguyen thu 3: ");
		c = sc.nextInt() ;
		tong = a+b+c;
		tich = a*b*c ; 
		System.out.println("tong cua ba so nguyen la: " + tong);
		System.out.println("tich cua ba so nguyen la: " + tich );
		
	}

}

