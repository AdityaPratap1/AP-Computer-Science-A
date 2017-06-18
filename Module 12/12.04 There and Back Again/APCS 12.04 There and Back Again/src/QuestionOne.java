import java.util.Scanner;

/**
 * Created by Aditya Pratap on 6/17/2017.
 * <p>
 * The purpose of this program is to
 */
public class QuestionOne {


    public static void main(String args[]){

        System.out.println("Enter a number to be inputed for x");

        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();

        QuestionOne object = new QuestionOne();

        System.out.println(object.translatePieceWise(x));

    }

    public double translatePieceWise(double number){

        if(number<= 10){
            return -7;
        }

        else{

            return translatePieceWise(number - 4) + 2;
        }

    }
}
