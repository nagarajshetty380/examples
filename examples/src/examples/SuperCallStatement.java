package examples;

public class SuperCallStatement
{
	public void SuperCallStatement()
	{
		System.out.println("hii");
	}
}
  class Two extends SuperCallStatement
  {
	 public void Two()
	 {
	System.out.println("hello");
	  }
} 
  class Three extends Two
  {
	public void Three()
	  {
	 System.out.println("bye");
 }
  }
 class Ten
 {
 public static void main(String[]args) 
 {
	 new Three();
	 //System.out.println("completed");
 }
}

