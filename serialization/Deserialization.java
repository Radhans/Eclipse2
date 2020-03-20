package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Radha\\batch3\\upasana.txt"));
		student s= (student)in.readObject();
		System.out.println(s.id+" "+s.name);
		in.close();
		}	catch(Exception e) {
			 System.out.println("e");
		}
	}

}
