package test;
import java.util.Scanner;

public class Acceptvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("enter your name ");
		String name=scn.next();
		System.out.println("enter your age ");
		int age=scn.nextInt();
		System.out.println("enter your gpa ");
		float gpa=scn.nextFloat();
		System.out.println("I met with "+name+" who is "+age+" got gpa of "+gpa);
		

	}

}
