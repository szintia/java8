package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String... args) {
		System.out.println(hasUniqueCharacters("abc"));
		
		System.out.println(shiftingCharactersWithinString("abc"));
		
		System.out.println(convertCommaSeparatedStingToArrayList("abc, dde, ee"));
		
		List<String> list = Arrays.asList("a", "z", "xyc", "abc", "ab", "bc", "dz");
		System.out.println(insertBracklet(list));
	}
	
	private static boolean hasUniqueCharacters(String str) {
		//ASCII - unique: abcde, not unique: aabcd
		if(str.length() > 256) {
			return false;
		}
		
		boolean[] charContained = new boolean[256];
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			System.out.println(val);
			if(charContained[val]) {
				return false;
			}
			charContained[val] = true;
		}
		return true;
	}
	
	private static String shiftingCharactersWithinString(String str) {
		// abc --> cab
		char last = str.charAt(str.length()-1);
		System.out.println(last);
		String other = str.substring(0, str.length()-1);
		System.out.println(other);
		return last + other;
	}
	
	private static List<String> convertCommaSeparatedStingToArrayList(String str) {
		List<String> items = Arrays.asList(str.split(" , "));
		return items;
	}
	
	private static List<String> insertBracklet(List<String> list) {
		//With stream API: String[] elements = list.stream().toArray(String[]::new);
		String[] arrayElements = list.toArray(new String[list.size()]);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < list.size(); i=i+2) {
			sb.append("(").append(arrayElements[i]).append(", ").append(arrayElements[i+1]).append("), ");
		}
		List<String> listElements = new ArrayList<>(Arrays.asList(sb.toString()));
		return listElements;
	}
}
