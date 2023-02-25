package examples;

public class RemoveDuplicateString {

	public static void main(String[] args) {
String s = "aabbccddeeff";
StringBuilder sb= new StringBuilder();
s.chars().distinct().forEach(c->sb.append((char)c));

System.out.println(sb);
	}

}
