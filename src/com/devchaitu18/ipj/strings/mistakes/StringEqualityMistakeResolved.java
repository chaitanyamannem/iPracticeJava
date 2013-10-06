package com.devchaitu18.ipj.strings.mistakes;

/**
 * When comparing for content equality you should use .(dot)equals instead of ==
 * 
 * If you want to determine whether two references refer to the same object, you
 * can compare them using == and !=. The equals method is concerned with value
 * equality. The default implementation of equals in Object assumes that an
 * object is equal only to itself, by testing if this == obj.
 * 
 * See the overided equals method of String class ->
 * https://gist.github.com/anonymous/6851196
 * 
 * @author devchaitu18
 * 
 */
public class StringEqualityMistakeResolved {

	public static String[] getMatchingProducts(String keyword) {
		String[] defaultList = { "a", "b", "c" };
		if (keyword.equals("tech")) {

			String[] techCompanies = { "apple", "google", "oracle" };
			return techCompanies;
		}
		if (keyword.equals("movies")) {
			String[] movies = { "AD", "Gladiator", "Tempest" };
			return movies;
		}
		if (keyword.equals("mobiles")) {
			String[] mobiles = { "iphone", "sx4", "desire" };
			return mobiles;
		}
		return defaultList;
	}

	public static void main(String[] args) {
		String keyword = new String("tech");
		/*If The below statement i.e String keyword = "tech" is given
		 * then the keyword == "tech" will give true because java has
		 * a concept of pooling String objects. 
		 * http://ilearncorejava.wordpress.com/2013/10/06/8/
		 * String a = "xyz";
		 * String b = "xyz";
		 * both a and b objects point to same object so the equals will
		 * return true.
		 * */
		//String keyword = "tech";  
		String[] displayResults = getMatchingProducts(keyword);
		System.out.println("The results are:");
		for (String result : displayResults) {
			System.out.println(result);
		}

	}

}
