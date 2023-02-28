
import java.util.Scanner;
public class BT4 {

	public static void main(String[] args) {
		int n,number,ketQua = 0;
		Scanner sc =new Scanner (System.in);
		
		System.out.println("nhap so nguyen: ");
		n = sc.nextInt();
		while(n<0) {
			System.out.println("nhap vao so nguyen lon hon 0: ");
			n = sc.nextInt();
		}
		
		while(n>0)
		{
			number = n%10;
			ketQua += number;
			n/= 10;
		}
		System.out.println("tong cac ki so: "+ketQua);
	}

}