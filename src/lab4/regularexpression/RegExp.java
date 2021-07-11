package lab4.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
//		String expression = "[a-z]+";
//		String expression = "[A-Z]+";
		String expression = "[0-9]+";
		String string = "Lorem Ipsum is simply dummy text"
				+ " of the printing and typesetting industry."
				+ " Lorem Ipsum has been the industry's"
				+ " standard dummy text ever since the 1500s,"
				+ " when an unknown printer took a galley"
				+ " of type and scrambled it to make a type"
				+ " specimen book. It has survived not only"
				+ " five centuries, but also the leap into"
				+ " electronic typesetting, remaining"
				+ " essentially unchanged. It was popularised"
				+ " in the 1960s with the release of Letraset"
				+ " sheets containing Lorem Ipsum passages,"
				+ " and more recently with desktop publishing"
				+ " software like Aldus PageMaker including"
				+ " versions of Lorem Ipsum.";
		Pattern pattern = Pattern.compile(expression);
		Matcher matcher = pattern.matcher(string);
		
		while (matcher.find()) {
			System.out.println(string.substring
					(matcher.start(), matcher.end()));
		}
	}

}
