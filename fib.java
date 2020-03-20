
public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int sum;
		System.out.println(first+" "+second);
		
		for(int i=2;i<=10;i++) {
			sum=first+second;
			System.out.println(" "+sum);
			first=second;
			second=sum;
			
	
		}
		

	}

}
