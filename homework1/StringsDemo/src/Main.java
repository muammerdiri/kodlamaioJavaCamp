
public class Main {

	public static void main(String[] args) {

		String message = "Merhaba Millet Nasilsiniz.";
		
		/*
		 * System.out.println(message.charAt(8));
		 * System.out.println(message.concat(" İyiyiz Sen nasılsın"));
		 * System.out.println(message.indexOf("Millet"));
		 * System.out.println(message.lastIndexOf(5));
		 * System.out.println(message.endsWith("."));
		 * System.out.println(message.startsWith("M")); char [] characters = new
		 * char[12]; message.getChars(0, 12, characters,0);
		 * System.out.println(characters);
		 */
		
		String newMessageString = "Bu Bir Yeni Mesajdır.";
		System.out.println(newMessageString.replace(" ", "-"));
		System.out.println(newMessageString.substring(2,5));
		
		for(String word: newMessageString.split(" "))
			System.out.println(word);
	}

}
