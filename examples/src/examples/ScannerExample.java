package examples;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("enter your first name");
String name = sc.next();

System.out.println("enter your second name");
String second = sc.next();
	
System.out.println("enter your age");
int age = sc.nextInt();

System.out.println("enter your locatin");
String loc = sc.next();

System.out.println(name);
System.out.println(second);
System.out.println(age);
System.out.println(loc);
}
	}


