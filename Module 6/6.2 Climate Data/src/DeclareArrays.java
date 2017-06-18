/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Scanner;

import java.lang.Math;

public class DeclareArrays{


    static public double[] celsius = new double[12];

    static public double[] centimeter = new double[12];

    static public double[] temperature = new double[12];

    static public double[] precipitation = new double[12];

    static public String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};




    static public double[] temperature1 = new double[] {52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7, 79.1, 70.2, 62.0, 55.2};

    static public double[] precipitation1 = new double[] {4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5};




    static public double[] temperature2 = new double[] {58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8};

    static public double[] precipitation2 = new double[] {3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};




    static public double[] temperature3 = new double[] {64.9, 66.0, 69.9, 73.6, 78.8, 82.2, 83.0, 83.1, 82.1, 77.5, 71.1, 66.4};

    static public double[] precipitation3 = new double[] {2.2, 2.1, 2.7, 1.7, 3.4, 9.8, 9.0, 9.5, 7.9, 2.6, 1.7, 1.6};



    static public double[] temperature4 = new double[] {54.3, 57.0, 62.5, 67.6, 74.3, 79.2, 80.9, 80.4, 77.8, 70.1, 62.8, 56.3};

    static public double[] precipitation4 = new double[] {3.5, 3.4, 4.3, 2.9, 3.2, 6.8, 6.1, 6.6, 4.4, 2.5, 2.2, 2.6};




    static public double[] temperature5 = new double[] {53.1, 55.8, 61.6, 66.6, 73.4, 79.1, 81.6, 80.8, 77.8, 69.4, 61.7, 55.0};

    static public double[] precipitation5 = new double[] {3.7, 3.2, 3.9, 3.1, 3.5, 5.4, 6.0, 6.9, 7.9, 3.9, 2.3, 2.6};




    static public double[] temperature6 = new double[] {70.3, 70.8, 73.8, 77.0, 80.7, 83.4, 84.5, 84.4, 83.4, 80.2, 76.3, 72.0};

    static public double[] precipitation6 = new double[] {2.2, 1.5, 1.9, 2.1, 3.5, 4.6, 3.3, 5.4, 5.5, 4.3, 2.6, 2.1};



    static public double[] temperature7 = new double[] {68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9};

    static public double[] precipitation7 = new double[] {1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2};



    static public double[] temperature8 = new double[] {60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};

    static public double[] precipitation8 = new double[] {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};



    static public double[] temperature9 = new double[] {52.0, 54.9, 61.0, 66.9, 74.6, 80.6, 82.6, 82.2, 78.7, 69.5, 60.7, 54.1};

    static public double[] precipitation9 = new double[] {5.3, 4.7, 6.4, 3.9, 4.4, 6.4, 8.0, 6.9, 5.8, 4.1, 4.5, 4.0};



    static public double[] temperature10 = new double[] {51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7};

    static public double[] precipitation10 = new double[] {5.4, 4.6, 6.5, 5.0, 6.9, 8.0, 7.0, 5.0, 3.3, 3.9, 4.1};



    static public double[] temperature11 = new double[] {66.2, 67.2, 70.6, 73.8, 78.2, 81.2, 82.5, 82.8, 81.7, 78.1, 73.1, 68.3};

    static public double[] precipitation11 = new double[] {3.8, 2.6, 3.7, 3.6, 5.4, 7.6, 6.0, 6.7, 8.1, 5.5, 5.6, 3.1};


    static public double[] temperature12 = new double[] {63.0, 63.9, 67.7, 71.5, 76.2, 80.4, 81.7, 81.6, 80.7, 76.4, 70.5, 64.7};

    static public double[] precipitation12 = new double[] {2.9, 2.5, 4.2, 2.9, 3.8, 6.0, 6.5, 6.0, 6.8, 5.0, 3.0, 2.2};



    public static void conversion(){

        for(int i = 0; i<temperature.length; i++){

            celsius[i] =  Math.round(((temperature[i]-32)/1.8));

            centimeter[i] = Math.round(((precipitation[i])*2.54));

        }

    }

}