package com.devchaitu18.ipj.strings.mistakes;

/**
 * Find the common mistake in this program.
 * 
 * @author devchaitu18
 * 
 */
public class StringEqualityMistakeUnresolved {

	/**
	 * Returns a list based on the matching keyword. If no keyword is matching
	 * it gives default list.
	 * 
	 * @param keyword
	 * @return
	 */
	public static String[] getMatchingProducts(String keyword) {
		String[] defaultList = { "a", "b", "c" };
		if (keyword == "tech") {

			String[] techCompanies = { "apple", "google", "oracle" };
			return techCompanies;
		}
		if (keyword == "movies") {
			String[] movies = { "AD", "Gladiator", "Tempest" };
			return movies;
		}
		if (keyword == "mobiles") {
			String[] mobiles = { "iphone", "sx4", "desire" };
			return mobiles;
		}
		return defaultList;
	}

	public static void main(String[] args) {
		String keyword = new String("tech");
		String[] displayResults = getMatchingProducts(keyword);
		System.out.println("The results are:");
		for (String result : displayResults) {
			System.out.println(result);
		}

	}

}
