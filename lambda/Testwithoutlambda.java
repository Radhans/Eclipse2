package lambda;

public class Testwithoutlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width = 10;
		/*drawable d = new drawable() {
			public void draw() {
				System.out.println("drawing "+width);
			}
		};
		d.draw();*/
		 drawable d2=()->{
			 System.out.println("drawing "+width);
			
		};
		d2.draw();
			 
		 }

	}


