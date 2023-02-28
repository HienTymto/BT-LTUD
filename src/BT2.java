import java.util.Scanner;

public class BT2 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so nguyen thu 1: ");
		a=sc.nextInt();
		System.out.println("nhap so nguyen thu 2: ");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a + " > " +b);
		}else if(a<b) {
			System.out.println(a + " < " +b);
			}
		else {
			System.out.println(a + " = " +b);
		}
		
	}

}
