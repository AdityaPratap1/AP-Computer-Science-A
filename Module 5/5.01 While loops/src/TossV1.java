import java.util.Scanner;


public class TossV1{
  
static  int heads = 0;
  
static  int tails = 0;
  
static  int counter = 1;
  
static  double flips;
  
static double randomNumber = 0.0;;
  
static Scanner input = new Scanner(System.in);
  
  
	public static void method()	{
	  
	 
	   
	   
	   System.out.println("How many times do you want to flip the coin?(Fair version) ");
	   
	   flips = input.nextDouble();
	   
	   while(counter <= flips ) {
	     
	     randomNumber = Math.random();
	     
	     if (randomNumber < .5){
	       
	       
	       heads++;
	       
	       System.out.println(counter + "\t" + randomNumber + "\t heads" );
	       
	     }
	     
	     else if (randomNumber > .5){
	       
	       tails++;
	       
	       System.out.println(counter + "\t" + randomNumber + "\t tails" );
	       
	       
	     }
	     
	     counter++;
	     
	   }
	   
	   System.out.println(" ");
	   System.out.println(" Number of heads = " + heads);
	   System.out.println(" ");
	   System.out.println(" Number of tails = " + tails);

	   
	   
	}
}

