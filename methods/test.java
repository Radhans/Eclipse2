package methods;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodexample obj=new methodexample();
		obj.x=10;
		obj.y=20;
		
		obj.sum();
		System.out.println(obj.sum1()); 
		
		int result=obj.sum1();
		System.out.println(result);
		
		int result1=obj.sum3(100,200);
		System.out.println(result1);
		
		float result2=obj.sum4(100,56.5f);
		System.out.println(result2);

	}

}
