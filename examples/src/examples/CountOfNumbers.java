package examples;

public class CountOfNumbers {

	public static void main(String[] args) {
		int name = 123458;

		int count = 0;
		
			while(name>0) {
				name=name/10;
				count++;
			}
		System.out.println(count);

	}

}
