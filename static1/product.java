package static1;

public class product {
	public String name;
	public int num=0;
	public static int counter=0;
	public static final String brandname="dabur";
	
	public product()
	{
		counter++;
		num++;
		
	}
	public static int statmethod()
	{
		counter=counter+2;
		return counter;
	}

}
