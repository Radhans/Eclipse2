package lambda;

public class Multipleparameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multiple parameters in lambda expression
		Addable ad1 = (a,b) -> (a+b);
		System.out.println(ad1.add(10, 20));
		
		//multiple parameters with data type in lambda expression
		Addable ad2 = (int a,int b) ->(a+b);
		System.out.println(ad2.add(100, 200));
		
		sayable person = (message) ->{
			String str1 = "i would like to say, ";
			String str2 = str1 + message;
			return str2;
		};
		System.out.println(person.say("time is precious"));

	}

}
