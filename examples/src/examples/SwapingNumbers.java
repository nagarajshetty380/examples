package examples;

public class SwapingNumbers {

	public static void main(String[] args) {
    int a= 20;
    int b= 10;
     
    System.out.println("before swaping the number"+a+" "+b);
    
//    int c=a;
//     a = b;
//     b=c;
//      a =a+b;
//      b= a-b;
//      a=a-b;

    a=a*b;
    b=a/b;
    a=a/b;
     System.out.println("after swaping the number   "  +a+"  "+b);
	}

}
