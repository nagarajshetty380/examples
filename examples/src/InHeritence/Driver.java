package InHeritence;

public class Driver {
public static void main(String[] args) {
	Parent p= new Child(); 
	System.out.println(p.a);
	Child c= (Child) p;
	System.out.println(c.a);
	System.out.println(c.s);
}
}
