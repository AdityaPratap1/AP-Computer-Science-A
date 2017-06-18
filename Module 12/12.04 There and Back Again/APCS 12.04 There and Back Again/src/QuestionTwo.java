import java.util.Scanner;

/**
 * Created by Aditya Pratap on 6/17/2017.
 * <p>
 * The purpose of this program is to
 */
public class QuestionTwo {

    public static void main(String args[]){

        System.out.println("Enter a number to be inputed for x");

        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();

        QuestionTwo object = new QuestionTwo();

        System.out.println(object.translatePieceWise(x));

    }

    public double translatePieceWise(double number){

        if(number<= 25){
            return 20;
        }

        else{

            return translatePieceWise((number/12) + 5) - 3;
        }

    }
}


