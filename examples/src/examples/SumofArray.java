package examples;

public class SumofArray {

	public static void main(String[] args) {
     int a[]= {1,2,3,4,5,6};
     int sum=a[0];
    
     for(int i=1;i<=a.length -1;i++) {
    	
    		 sum=sum+a[i];
    		 
    	 
    		 
     }
     System.out.println(sum);
	}
/*for(int value:a) {
	sum=sum+value;
}
System.out.println(sum);
}*/
}