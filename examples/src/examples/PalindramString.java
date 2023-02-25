package examples;

import java.util.Scanner;

public class PalindramString {

	public static void main(String[] args) {
//Scanner sc= new Scanner(System.in);
//System.out.println("enter string");
// String num = sc.next();
String num= "madama";
String rev = num;
int len = rev.length();
System.out.println(len);

StringBuffer sb= new StringBuffer(num);
StringBuffer print = sb.reverse();
System.out.println(print);

if(rev.equals(print)){
	System.out.println("it is polidram ");
}
else
{
System.out.println( "it is not polidram");
	}

}}
