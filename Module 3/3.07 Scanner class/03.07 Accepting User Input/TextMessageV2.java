
 

import java.util.Scanner;

public class TextMessageV2 {
	
  public static void main(String[ ] args){
        	
        	String newWord = "";
        	String oldWord= "";
        	String newWord2= "";
        	String oldWord2= "";
        	String replaceCharacters;	
		// Output 1
				
  		Scanner message = new Scanner(System.in); // new scanner object to enter a phrase/sentence
		
		System.out.println("Print a message to be converted");
		
		String oldString = message.nextLine();
		
		System.out.println("Original String: " + oldString);
		
		System.out.println();
		
		
		// String Length
		
		int stringLength = oldString.length(); // gets the length of the old string phrase/sentence
		
		System.out.println("Length: " + stringLength);
		
		System.out.println();
		
		
		
		
		// Replace Characters
		
		
		System.out.println("Enter a word from your original message to be replaced");
		
	    oldWord = message.nextLine(); // stores the input in variable oldWorld // Scanner object that asks user to enter a word from the old string
		
		   
	  if (oldString.contains(oldWord))// This if statement checks if the user entered word that is to be replaced(oldWord) is in the entered statement (OldString) 
			   {
			   
			   	System.out.println("Enter a word to replace " + oldWord + " with");
				
				newWord = message.nextLine(); // stores input in newWord
				
				System.out.println("Enter another word from your original message to be replaced");
				
			    oldWord2 = message.nextLine();
				
		if (oldString.contains(oldWord2)){ // if the first if statement is true then, this if statement checks if the second word entered is contained in the original message itself
		
				System.out.println("Enter a word to replace " + oldWord2 + " with");
				
				 newWord2 = message.nextLine(); // This allows the user to enter a new word to replace the second word with
				 
				 replaceCharacters = oldString.replace(oldWord, newWord); // replaces oldWord with newWord
			      
				 replaceCharacters = replaceCharacters.replace(oldWord2, newWord2); // replaces second old word with another new word
					
				 System.out.println("Replace: " + replaceCharacters);
			   
				 }
				 
		else { // if the second word is not contained in the original message, then executes this code
					 
			 do { // loop allows user to enter the correct word number of times if fails
		          
		          System.out.println("Sorry Word not found! Try again");

		          System.out.println("Enter a word from your original message to be replaced");

		          oldWord2 = message.nextLine(); // stores the input in variable oldWorld
		          
		          
			 } while(! oldString.contains(oldWord2)); // if the user entered word is not in oldString (original message), then ask again and again until the right word is entered
			 
			 
		          System.out.println("Enter a word to replace " + oldWord2 + " with"); // loop breaks when user entered word is in the original string
					
			      newWord2 = message.nextLine(); // stores input in newWord
			       
		          
		
		  			
			   replaceCharacters = oldString.replace(oldWord, newWord); // replaces oldWord with newWord
		      
			   replaceCharacters = replaceCharacters.replace(oldWord2, newWord2); // replaces second old word with another new word
				
			   System.out.println("Replace: " + replaceCharacters);
					
		}
		   }
		   
		   
		   				  
 else {// If the first word that the user entered is not in the OldString then do this:
	 
	 do { 
	          
	          System.out.println("Sorry Word not found! Try again");
	
	          System.out.println("Enter a word from your original message to be replaced");
	
	          oldWord = message.nextLine(); // stores the input in variable oldWorld
	          
	         	      
	          
	 } while (! oldString.contains(oldWord));  
	 
	          System.out.println("Enter a word to replace " + oldWord + " with");
		
              newWord = message.nextLine(); // stores input in newWord
	          
	          System.out.println("Enter another word from your original message to be replaced");
				
			  oldWord2 = message.nextLine();
			
			  if (oldString.contains(oldWord2)){ // This if staetement checks if the second old word in int hte original message
					
					
					System.out.println("Enter a word to replace " + oldWord2 + " with");
					
				    newWord2 = message.nextLine();
				
				    replaceCharacters = oldString.replace(oldWord, newWord); // replaces oldWord with newWord
				      
				    replaceCharacters = replaceCharacters.replace(oldWord2, newWord2); // replaces second old word with another new word
							
				    System.out.println("Replace: " + replaceCharacters);
				    
					 }
					 
			else {
						 
				 do { 
			          
			          System.out.println("Sorry Word not found! Try again");

			          System.out.println("Enter a word from your original message to be replaced");

			          oldWord2 = message.nextLine(); // stores the input in variable
			          
				 } while(! oldString.contains(oldWord2)); // if the user entered word is not in oldString, then ask again and again until the right word is entered
				 
			          System.out.println("Enter a word to replace " + oldWord2 + " with");
						
					  newWord2 = message.nextLine();
					
					  replaceCharacters = oldString.replace(oldWord, newWord); // replaces oldWord with newWord
					      
					  replaceCharacters = replaceCharacters.replace(oldWord2, newWord2); // replaces second old word with another new word
								
					  System.out.println("Replace: " + replaceCharacters);
					  
					  replaceCharacters = oldString.replace(oldWord, newWord); // replaces oldWord with newWord
				    				    
					  replaceCharacters = replaceCharacters.replace(oldWord2, newWord2); // replaces second old word with another new word
											    
					  System.out.println(" new message: " + replaceCharacters);  
					

			     
		}
	
       
       }
	  
	  
	   int stringLength2 = replaceCharacters.length(); // gets the length of the old string phrase/sentence
		
	   System.out.println("Length: " + stringLength2 );
		
	   System.out.println();
	  
	  
	  
	  
	  System.out.println();
	 		
	  
	// Split String
		System.out.println("Split string of old message");
		
		int halfWay = stringLength / 2;
		
		String firstPart = oldString.substring(0, halfWay);
		
		String secondPart = oldString.substring(halfWay, stringLength);
		
		String split = secondPart + "-" + firstPart; 
		
		System.out.println("Split String:: " + split);
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Split string of new (replaced) message");
	
	    halfWay = stringLength2 / 2;
	    
        firstPart = replaceCharacters.substring(0, halfWay);
		
		secondPart = replaceCharacters.substring(halfWay, stringLength2);
		
		split = secondPart + "-" + firstPart; 
		
		System.out.println("Split String:: " + split);
		
		System.out.println();
		
		// Remove Vowels
		
		System.out.println("Remove all vowels from original message");
		
		String removeVowels = oldString.replaceAll("[aeiou]", "");
		
		System.out.println();
		
		System.out.println("Replace All(no vowels of original message): " + removeVowels);
		
		System.out.println();
		
		System.out.println();
		
        System.out.println("Remove all vowels from new message");
		
	    removeVowels = replaceCharacters.replaceAll("[aeiou]", "");
		
		System.out.println();
		
		System.out.println("Replace All(no vowels of new message): " + removeVowels);
		
		System.out.println();
		
			
		
		
		// Remove Consonants
		
		String removeConsonants = oldString.replaceAll("[bcdfghjklmnpqrstvwxyz]", "");
		
		System.out.println("Replace All(no constants): " + removeConsonants);
		
		System.out.println();
		
        removeConsonants = replaceCharacters.replaceAll("[bcdfghjklmnpqrstvwxyz]", "");
		
		System.out.println("Replace All(no constants): " + removeConsonants);
		
		System.out.println();
		
		
		
		// IndexOf
		
		Scanner indexWord = new Scanner(System.in);
		
		System.out.println("Enter a letter you want to find the index of from original message ");
		
		String indexOf = indexWord.nextLine();
		
		System.out.print("Index Of " + indexOf + ": ");
		
		System.out.println();
		
		System.out.println(oldString.indexOf(indexOf));
		
		System.out.println();
		

		System.out.println("Enter a letter you want to find the index of from new message");
		
		indexOf = indexWord.nextLine();
		
		System.out.print("Index Of " + indexOf + ": ");
		
		System.out.println();
		
		System.out.println(replaceCharacters.indexOf(indexOf));
		
       
        	
        	
  }// end of main method
} // end of class



