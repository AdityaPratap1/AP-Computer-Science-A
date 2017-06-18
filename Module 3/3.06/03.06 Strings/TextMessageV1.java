/**
 * The purpose of this program is to demonstrate the use of several 
 * methods of the String class and their uses.
 * 
 * 
 * @author Pratap, Ady
 * @version 11/11/2016
 */

public class TextMessageV1 {
		public static void main(String[ ] args) {
		
		// Output 1
		
		String oldString = "Lord of the Rings";
		
		System.out.println("Original String: " + oldString);
		
		System.out.println();
		
		
		// String Length
		
		int stringLength = oldString.length();
		
		System.out.println("Length: " + stringLength);
		
		System.out.println();
		
		
		
		// Replace Characters
		
		String replaceCharacters = oldString.replace("what", "wut");
		
		replaceCharacters = replaceCharacters.replace("i dont know", "idk");
		
		replaceCharacters = replaceCharacters.replace("because", "cuz");
		
		replaceCharacters = replaceCharacters.replace("are", "r");
		
		replaceCharacters = replaceCharacters.replace("you", "u");
		
		replaceCharacters = replaceCharacters.replace("talking", "tlkng");
		
	    replaceCharacters = replaceCharacters.replace("about", "abt");
		
		System.out.println("Replace: " + replaceCharacters);
		
		int stringLength2 = replaceCharacters.length();
		
		System.out.println();
		
		System.out.println("Length of new string " + stringLength2);
		
		System.out.println();
		
		
		
		// Split String
		
		//int halfWay = stringLength / 2;
		
		String firstPart = oldString.substring(3);
		
		//String secondPart = oldString.substring(halfWay, stringLength);
		
		//String split = secondPart + "-" + firstPart; 
		
		//System.out.println("Split String:: " + split);
		
		System.out.println(firstPart);
		
		
		
		// Sub String
		
		//System.out.print("Sub String (first 1/6 of the new string): ");
		
		//ystem.out.println();
		
		//System.out.println(replaceCharacters.substring(0, 8));
		
		//System.out.println();
		
		//System.out.print("Sub String (last 1/6 of the new string): ");
				
		//System.out.println();
		
		//System.out.println(replaceCharacters.substring(45, 54));
		
		
		
		
		// Remove Vowels
		
		String removeVowels = oldString.replaceAll("[aeiou]", "");
		
		System.out.println();
		
		System.out.println("Replace All(no vowels): " + removeVowels);
		
		System.out.println();
		
		
		
		// Remove Consonants
		
		String removeConsonants = oldString.replaceAll("[bcdfghjklmnpqrstvwxyz]", "");
		
		System.out.println("Replace All(no constants): " + removeConsonants);
		
		System.out.println();
		
		
		
		// IndexOf
		
		System.out.print("Index Of \"w\": ");
		
		System.out.println();
		
		System.out.println(oldString.indexOf("United"));
		
		System.out.println();
		
		System.out.print("Index Of \"w\" after 12th character: ");
		
		System.out.println();
		
		System.out.println(oldString.indexOf('w', 12));
		
		System.out.println();
		
		
		
        // Replace
        
        System.out.print("Replace: ");
        
        System.out.println();

        System.out.println(oldString.replace(oldString, "You know what? I learnt JAVA and now, I understand everything! Honestly, it took me forEVER"));
        
        System.out.println();
	}
}
