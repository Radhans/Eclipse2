package poly;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		liquid l=new liquid();
		coffee c= new coffee();
		tea t=new tea();
		coffeemug cm=new coffeemug();
		cm.addliquid(c);
		
		
		cm.wash();
		cm.paint();

	}

}
