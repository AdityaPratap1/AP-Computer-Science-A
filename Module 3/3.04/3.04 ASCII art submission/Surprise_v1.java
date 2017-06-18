
/**
 * The purpose of this program is to show ASCII art using escape sequences.
 *
 * @author Pratap, Ady
 * @version 11/10/2016
 */
public class Surprise_v1
{
    public static void main(String [ ] args)
    {
        //local variables
        String row1 =( "\n _");
        String row2 =("\n(  \\");
        String row3 =( "\n )  )");
        String row4 =( "\n(  ( .-****-.   A.-.A");
        String row5 =("\n \\ \\/        \\/ , ,  \\"); 
        String row6 =("\n  \\  \\      =;   t   /=");
        String row7 =("\n   \\  |**** _  * ,--*"); 
        String row8 =("\n  // //      | ||");
        String row9 =("\n //_))       |_,))                ||||||||||||  ");
        String row10=("\n-----------------------||||||||||||");
        
        //print ASCII art
        System.out.print(row1);

        System.out.print(row2);
        System.out.print(row3);
        System.out.print(row4);
        System.out.print(row5);
        System.out.print(row6);
        System.out.print(row7);
        System.out.print(row8);
        System.out.print(row9);
        System.out.print(row10);
        
    }
} 
