package lab1.package2;

import lab1.package1.AccessModifier;

public class NewModifier {

	public static void main(String[] args) {
//		SpecificModifier specificModifier = new SpecificModifier();		// can't access default
																		// class in other package
		@SuppressWarnings("unused")
		AccessModifier access = new AccessModifier();		// can't use without importing package
//		access.display();		// can't access
		
//		SpecificModifier specific = new SpecificModifier();	// can't use default class in other
															// package
//		specific.display();
	}

}
