package examples;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

System.out.println("Enter first number");
int a = sc.nextInt();

System.out.println("enter second number");
int b = sc.nextInt();

System.out.println("enter third number");
int c = sc.nextInt();

//int a= 10;
//int b= 20;
//int c= 30;

if(a>b && a>c) {
	System.out.println("a is the great number "+a);
}
else if(b>a && b>c) {
	System.out.println("b is the great number");
}
else {
	System.out.println("c is the great number");
}
	}

}
