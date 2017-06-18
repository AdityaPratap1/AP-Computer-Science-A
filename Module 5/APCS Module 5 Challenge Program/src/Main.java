/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
class Main extends PasswordGenerator {

    static int generatePassword;

    public static void main(String[] args) {


        System.out.println("How many time do you want to generate passwords? ");

        generatePassword = input.nextInt();

        for(int k = 0; k < generatePassword; k++) {

            PasswordGenerator.generate();

        }


    }
}
