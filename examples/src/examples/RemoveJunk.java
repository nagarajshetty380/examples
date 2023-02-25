package examples;

public class RemoveJunk {

	public static void main(String[] args) {
String s= "abcded 26/01/2023";
s=s.replaceAll("[^a-zA-z]","");

System.out.println(s);
	}

}
