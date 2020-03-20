package methodreference;

public class InstanceMethodReference {

	public void saysomething() {
		System.out.println("Hello,this is non-static method");
	}
	public static void main(String[] args) {
		InstanceMethodReference methodReference = new InstanceMethodReference();//creating object
		//refering non static method using reference
		sayable sayable=methodReference::saysomething;
		
		
		//calling interface method
		sayable.say();
		
		//refering non static method using anaonymous object
		sayable sayable2 = new InstanceMethodReference()::saysomething;
		
		sayable2.say();
	}

}
