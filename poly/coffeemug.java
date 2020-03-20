package poly;

public class coffeemug extends mug implements Washable,Paintable{
	public void addliquid(liquid l)
	{
		//l.swirl();
		
		if(l instanceof coffee ) {
			l.swirl();
			System.out.println("you got coffee this time");
		}
		else if (l instanceof tea)
		{
			l.swirl();
			System.out.println("you got tea this time");
		}
		else
		{
			System.out.println("you got some generic liquid");
		}
			
	}
	
	public void wash()
	{
		System.out.println("washing coffeemug");
	}
	
	public void paint()
	{
		System.out.println("painting coffeemug");
	}

}
