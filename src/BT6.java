
public class BT6 {

	public static void main(String[] args) {
		int i,n,num,total=0;
		System.out.println("So Armstrong trong khoang tu 1 den 1000: ");
		
		for( i=1;i<1000;i++) 
		{
			n=i;
			while(n!=0) {
				num=n%10;
				total += num*num*num;
				n/=10;
			}
			if(total==i) {
				System.out.println(i);
			}
			total = 0;
		}
	}
}
