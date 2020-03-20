package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			student s1=new student(211,"radha");
			FileOutputStream fout = new FileOutputStream("C:\\Radha\\batch3\\upasana.txt");
		    ObjectOutputStream out = new ObjectOutputStream(fout);
		    out.writeObject(s1);
		    out.flush();
		    
		    out.close();
		    System.out.println("success");
		    
		    
		    
		}catch(Exception e) {
		

	}

}
}
