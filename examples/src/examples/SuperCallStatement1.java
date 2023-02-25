package examples;

import org.openqa.selenium.chrome.ChromeDriver;

//public class traial {
//
//	public static void main(String[] args) {
//		String key ="webdriver.chrome.driver";
//		String value ="./drivers/chromedriver.exe";
//		System.setProperty(key, value);
//		ChromeDriver driver= new ChromeDriver();
//
//	}
//
//}


public class SuperCallStatement1{
	 public static void main(String[]args) {
		
		 new Suma();
		 	System.out.println("completed");
	 }
	}

 class Nanu
{
	Nanu(){
		System.out.println("hii");
	}
}
  class Banu extends Nanu
  {
	  Banu(){
	 
	System.out.println("hello");
	
	  }
} 
  class Suma extends Banu
  {
	Suma()
	  {
	 System.out.println("bye");
 }
  }
  
 

