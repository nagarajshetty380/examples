package examples;

public class This{
	
	 This()
	{
		System.out.println("print me");
	}
	public 
	This(int a) 
	{
		this();
		System.out.println("print first one");
		}
 public This(int a , double b) 
 {
	this(5);
	System.out.println("print 2 one");
}
	public static void main(String[] args) 
	{
		// new This(6, 98.66);

		System.out.println("Started");
		new This(6, 98.66);

	}

}
