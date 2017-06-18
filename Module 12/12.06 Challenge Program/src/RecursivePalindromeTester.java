/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
public class RecursivePalindromeTester {

    public static void main(String[] args)
    {
        //header
        System.out.printf("%31s%n", "Palindrome Test");
        System.out.printf("%10s%n", "Enter a word or phrase . Enter \'q\' to quit");
        System.out.println("*******************************************************-");
        System.out.println();

        //loop

        while(true)
        {

            RecursivePalindrome palindrome = new RecursivePalindrome();

            //get the user input
            String input = palindrome.getInput();

            //allow the user to exit
            if(input.equalsIgnoreCase("q"))
            {
                System.out.println("Hope to see you soon!");
                System.out.println();
                break;
            }

            palindrome = new RecursivePalindrome(input);
            //print
            palindrome.Print();
        }

    }


}
