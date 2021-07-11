package lab4.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpPract {

	public static void main(String[] args) {
//		String expression = "[^abc]+";
//		String expression = "[abc]+";
//		String expression = "[0-9]+";
		String expression = "is";
		
		String string = "The standard chunk of Lorem Ipsum"
				+ " used since the 1500s is reproduced below"
				+ " for those interested. Sections 1.10.32"
				+ " and 1.10.33 from \"de Finibus Bonorum"
				+ " et Malorum\" by Cicero are also reproduced"
				+ " in their exact original form, accompanied"
				+ " by English versions from the 1914"
				+ " translation by H. Rackham.";
		
		Pattern pattern = Pattern.compile(expression);
		Matcher matcher = pattern.matcher(string);
		
		while (matcher.find()) {
			System.out.println(string.substring
					(matcher.start(), matcher.end()));
		}
	}

}
