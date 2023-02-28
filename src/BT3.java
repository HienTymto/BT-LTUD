import java.util.Scanner;
public class BT3 {

	public static void main(String[] args) {
		int n,number;
		Scanner sc =new Scanner (System.in);
		
		System.out.println("nhap so nguyen: ");
		n = sc.nextInt();
		while(n<0) {
			System.out.println("nhap vao so nguyen lon hon 0: ");
			n = sc.nextInt();
		}
		System.out.println("so dao nguoc: ");
		while(n>0)
		{
			number = n%10;
			System.out.print(number);
			n/=10;
		}
	}

}
