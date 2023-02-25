package examples;

public class Laptop {
	int noofkeys= 26;
	String color= "Grey";
	String brand="asus";
	
	public void java()
	{
		System.out.println("Executing");
	}
	{
		System.out.println("executing 1");
	}

	public static void main(String[] args) {
		 Laptop l=new Laptop();
		 l.java();
		 System.out.println(l.color);
		 System.out.println(l.noofkeys);
		 System.out.println(l.brand);


	}

}
