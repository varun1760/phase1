package lab1.package1;

public class TypeCasting {

	public static void main(String[] args) {
		
		System.out.println("This is implicit coversion");
		char a = 'A';
		System.out.println("value of a " + a);

		int b = a;
		System.out.println("value of b " + b);

		float c = a;
		System.out.println("value of c " + c);

		double d = a;
		System.out.println("value of d " + d);
		
		System.out.println("This is explicit type casting");
		
		double p = 22.34;
		System.out.println("value of p " + p);

		int q = (int) p;
		System.out.println("value of q " + q);
		
		
		SpecificModifier specificModifier2 = new SpecificModifier();
		specificModifier2.display();
		
		AccessModifier access = new AccessModifier();
//		access.display();		// can't use without extend. i.e. making subclass
	}
}