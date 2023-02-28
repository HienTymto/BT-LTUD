import java.util.Scanner;
public class BT5 {
	static boolean searchArray(int[] a, int length, int x) { 
		for(int i=0;i<length;i++)
		{
			if(a[i]==x) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		int x;
		System.out.println("Nhap so nguyen ban muon kiem tra: ");
		x=sc.nextInt();
		
		if(searchArray(a,10,x)==true) {
			System.out.println("So nguyen ton tai trong day so");
		}
		else{
			System.out.println("so nguyen khong ton tai trong day so");
		}
	}

}
