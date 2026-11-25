package importantprograms;

public class AllCharacterCount {

	public static void main(String[] args) {

		String str = "Google";
		String done = "";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			int count = 0;

			// Agar character pehle hi count ho chuka hai
			// to is character ko skip karo
			if (done.contains("" + ch)) {
				continue;
			}

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(j) == ch) {
					count++;
				}
			}
			done = done + ch;

			System.out.println(ch + "char COunt" + count);
		}
	}
}