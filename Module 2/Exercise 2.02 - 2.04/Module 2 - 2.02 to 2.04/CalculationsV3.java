
/**
 * CalculationsV3 is a continuation of CalculationsV2 with 2.03 worksheet exercises.
 * This class along with other classes is in the same project.
 * 
 * @author (Pratap, Ady) 
 * @version (10/29/2016)
 */
public class CalculationsV3
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
        System.out.println();
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
        System.out.println();
        System.out.println();
        
        
        
        
        //2.03 LAB EXERCISES
        
        System.out.println("2.03 Lab Equations ");
        
        int num1 = 25;
        int num2 = 9;
        int num3 = 16;
        
         // Addition
        System.out.println("Addition");
       
        int sum = num1 + num2;
        
        System.out.println("25 plus 9 equals " + sum);
        System.out.println("43.21 plus 3.14 plus 5.0 equals " + 43.21 + 3.14 + 5.0 );
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
                
        int diff = (num3-(num2)-(num1));
        
        System.out.println("16 minus 9 minus 25 equals " + diff );
        System.out.println("3.14 minus 5.0 equals " + (3.14 - 5.0 ));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        
        int product = num1*num2;
        
        System.out.println("25 times 9 = " + product ); 
        System.out.println("3.14 times 5.0 times 5.0 = " + 3.14 * 5.0 * 5.0 );
        System.out.println();
        
        // Division
        System.out.println("Division");
        
        int quot = num2/num1;
        
        System.out.println("9 divided by 25 = " + quot );
        System.out.println("43.21 divided by 5.0 = " + 43.21 / 5.0 );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        
        int mod = num3%num2;
        
        System.out.println("The remainder when 16 divided by 9 is " + mod);
        System.out.println("The remainder when 5.0 divided by 3.14 is "+ 5.0 % 3.14 );
        System.out.println();
    
    }
}
