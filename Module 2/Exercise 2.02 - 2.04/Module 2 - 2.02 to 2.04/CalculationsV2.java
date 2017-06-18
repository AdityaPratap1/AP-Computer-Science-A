
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * FLVS 2007
 * @author Bill Jordan; A.Ross
 * @version 01/19/07; 06/24/12
 */
public class CalculationsV2
{
    public static void main(String[ ] args)
    {
        // Addition
        System.out.println("Addition");
        System.out.println("25 plus 9 equals " + 25 + 9 );
        System.out.println("43.21 plus 3.14 plus 5.0 equals " + 43.21 + 3.14 + 5.0 );
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println("16 minus 9 minus 25 equals " + (16-(9)-(25)));
        System.out.println("3.14 minus 5.0 equals " + (3.14 - 5.0 ));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println("25 times 9 = " + 25 * 9 ); 
        System.out.println("3.14 times 5.0 times 5.0 = " + 3.14 * 5.0 * 5.0 );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println("9 divided by 25 = " + 9 / 25 );
        System.out.println("43.21 divided by 5.0 = " + 43.21 / 5.0 );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println("The remainder when 16 divided by 9 is " + 16 % 9 );
        System.out.println("The remainder when 5.0 divided by 3.14 is "+ 5.0 % 3.14 );
        System.out.println();
        
        //2.02 lAB EQUATIONS
        
        System.out.println("2.02 Lab Equations ");
        
        System.out.println();
        
        //PROBLEM 1
        System.out.println("1) The question is 15 divided by 2.5 times -2 plus 10 / 5");
        // declared variables for the question
        int a = 15;
        double b = 2.5; 
        int c = -2;
        int d = 10;
        int e = 5;
        double answer = ((a/b)*(c))+(d/e);
        
        System.out.println(); // space between lines
        
        System.out.println("The answer is " + answer);
        
        System.out.println();
        
        //PROBLEM 2
        System.out.println("2) The question is 234 minus (234 divided by 6 modulus 12) + 3");
        
        System.out.println();
        
        System.out.println("The answer is " + (234-(234/6%12)+3));
        
        System.out.println();
        
        //PROBLEM 3
        
        System.out.println("3) The question is (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)");
        
        System.out.println();
        
        System.out.println("The answer is " + ((46.2 / 11)-3 + 24%(17-2*3)));
        
        System.out.println();
                
        //PROBLEM 4
        
        System.out.println("4) The question is 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8");
        
        System.out.println();
        
        System.out.println("The answer is " + (480/10/12+200*.5-20%8));
        
        System.out.println();        
        
        //2.03 Additional int Equations
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class
