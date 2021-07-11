package lab3.stringsprac;

public class StringsDemo {

	public static void main(String[] args) {
		String string1 = "Hey";
		String string2 = "Shalu";
		String string3 = string1 + " " + string2;
		System.out.println(string3);
		
		System.out.println(string1.concat(string2));
		
		System.out.println(string1.concat(" ").concat(string2));
		
		String name = new String("Varun");
		System.out.println("Name: " + name);
		System.out.println("Length of Name: " + name.length());
	}

}
