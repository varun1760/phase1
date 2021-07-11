package lab4.stringsprac;

public class StringPract {

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
		
		// Comparison
		
		String str1 = new String ("Full Stack");
		String str2 = new String ("Full Stack");
		String str3 = str1;
		
		System.out.println();
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println();
		if(str1 == str2) {
			System.out.println("str1 and str2 are same object");
		}
		else {
			System.out.println("str1 and str2 are "
					+ "different object");	// result
		}
		
		if(str1 == str3) {
			System.out.println("str1 and str3"
					+ " are same object");	// result
		}
		else {
			System.out.println("str1 and str3 are "
					+ "different object");
		}
		// compareTo is predefined method
		// to compare string content
		if (str1.compareTo(str2) == 0) {
			System.out.println("Content of st1 is "
					+ "same as str2");
		}
		System.out.println();
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println("character at index 5 in str1: " + 
		str1.charAt(5));
		
		System.out.println("substring(3) of str1: " + 
				str1.substring(3));
		System.out.println("substring(3,7) of str1: " + 
				str1.substring(3,7));
		
		System.out.println();
		
		StringBuffer gf = new StringBuffer("Shalu");
		StringBuffer bf = new StringBuffer("Varun");
		System.out.println("gf: " + gf);
		System.out.println("bf: " + bf);
		gf.append(bf);
		System.out.println("after append bf to gf, gf: " + gf);
	}
}
