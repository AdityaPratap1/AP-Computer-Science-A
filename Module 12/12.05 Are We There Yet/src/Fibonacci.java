/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */

import java.util.Scanner;
import java.util.Arrays;

public class Fibonacci {

        public static void main(String args[]) {

            System.out.println("The nth term of the sequence");
            System.out.println("If you choose to quit, enter \"q\"");

            while (true) {

                System.out.println(" Enter the nth term of the sequence or \"q\" to quit");


                Scanner input = new Scanner(System.in);


                int num = -1;

                String in = input.next();

                if (in.equalsIgnoreCase("q")) {

                    break;
                }

                try {

                    num = Integer.parseInt(in);

                    if (num < 0) {

                        System.out.println("Enter a valid non - neg integer");


                    }


                } catch (Exception e) {

                    System.out.println("Enter a valid non - neg integer");
                }

                if (num >= 0) {

                    System.out.println("Fibonacci number " + num + " = " + getFibonacci(num));

                }

            }

        }

            public static int getFibonacci(int f){


                if(f == 0){

                    return 0;
                }

                if(f == 1){
                    return 1;
                }

                else {

                    return getFibonacci(f -1 ) + getFibonacci(f - 2);
                }
    }

    }



