package examples;

public class RemoveDupilcateString {


	public static void main(String[] args) {
String a = "abbccdd";

//StringBuffer ab= new StringBuffer(a);
//System.out.println(ab.reverse());
//		
	StringBuilder sb= new StringBuilder();
	//
	a.chars().distinct().forEach(c->sb.append((char)c));
	System.out.println(sb);
	}

}


