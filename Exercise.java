public class Exercise{
	public static boolean isAbecedarian(String s) {
		int index = 0;
		char c = 'a'; 
		while (index < s.length()) {
			if (c > s.charAt(index)) {
				return false;
			}
			c = s.charAt(index); 
			index = index + 1;
			
		}
		return true;
	}
}