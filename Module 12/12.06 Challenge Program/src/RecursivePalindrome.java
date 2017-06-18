import java.util.Scanner;

/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
public class RecursivePalindrome {

    private String userInput;
    private String inputString;
    private String reverseS;


    public String getInputString() {
        return inputString;
    }

    public void setString(String input) {
        inputString = input;
        reverseS = reverse(inputString);
    }

    public String getReverseString() {
        return reverseS;
    }

    public boolean isPalindrome;

    RecursivePalindrome() {
        inputString = "";
        reverseS = "";
    }

    RecursivePalindrome(String input) {

        userInput = input;

        inputString = input;

        inputString = cInput(inputString);

        reverseS = reverse(inputString);

        isPalindrome = inputString.equals(reverseS);

    }



    private String reverse(String inputString) {
        if (inputString.length() == 0) {

            return "";
        }

        String first = inputString.substring(0, 1);

        first = helperFunction(first);

        String restStringReverse = reverse(inputString.substring(1));

        String result = restStringReverse + first;

        return result;
    }

    public String cInput(String input){

        reverse(input);

        return reverse(input);
    }

    public String helperFunction(String chara){

        chara = chara.toLowerCase();

        char charFromString = chara.charAt(0);

        int value = (int) charFromString;

        boolean returnChar = (value>= 65 && value<=90 || (value>= 97 && value<= 122));

        if(returnChar){

            return  charFromString + "";
        }

        return "";
    }

    public void Print()
    {
        System.out.printf("Input: %s%n", userInput);
        System.out.printf("Reversed: %s%n", reverse(userInput));
        System.out.printf("Is a palindrome: %b%n", isPalindrome);
        System.out.println("============================================================");
    }

    //get user input
    public String getInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please Enter a word or phrase: ");

        String returnString = in.nextLine();

        System.out.println("============================================================");

        return returnString;
    }

}