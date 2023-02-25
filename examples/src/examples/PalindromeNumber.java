package examples;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
//System.out.println("eneter the number");
//int num = sc.nextInt();
		int num=12345;
   //   int number= num;


StringBuffer sb= new StringBuffer(String.valueOf(num));
StringBuffer sb1 = sb.reverse();
System.out.println(sb1);

if() {
	System.out.println("this is palindrime number");
}
else {
	System.out.println("not a palindrome number");
}


	}

}
