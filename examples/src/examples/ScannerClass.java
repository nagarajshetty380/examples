package examples;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter byte data"); 
		byte b1= sc.nextByte();
		//99 System.out.println(b1);
		System.out.println("enter your short"); 
		short s1= sc.nextShort(); 
		System.out.println(s1); 
		System.out.println("enter the int"); 
		int i1=sc.nextInt(); 
		System.out.println(i1); 
		System.out.println("enter the long"); 
		long l1= sc.nextLong(); 
		System.out.println(l1); 
		System.out.println("enter the float"); 
		Float f1=sc.nextFloat(); 
		System.out.println(f1);
		System.out.println("enter the char"); 
		char c1= sc.next().charAt(3); 
		System.out.println(c1);
		System.out.println("main ends");
	}

}
