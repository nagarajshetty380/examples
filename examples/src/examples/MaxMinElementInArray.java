package examples;

public class MaxMinElementInArray {

	public static void main(String[] args) {
   /* int a[]= {10,20,30,40,50};
   int max=a[0];
   
   for(int i=1; i<a.length;i++) {
	   if(a[i]>max) {
		   max=a[i];
	   }
   }
   System.out.println(max);
	}*/
	 int a[]= {10,20,30,40,50};
	 int min=a[0];
	 
	 for(int i=1; i<a.length;i++) {
		 if(a[i]<min) {
			 min=a[i];
			 
		 }
	 }
	 System.out.println(min);
}
}