/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: (Pratap, Ady)
 * Date: (10/29/2016)
 */
public class MeasurementConverter extends declaredVariables
{
        public void converter() {
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");
        System.out.println();


        //convert miles to feet
        miles = 6230;
        feet = miles/milesPerFeet;
        System.out.println(miles + " miles. = " + feet + " feet");
        System.out.println();

        
        
        // convert miles to kilometers
        miles = 6230;
        kilometers = miles/milesPerKilometer;
        System.out.println(miles + " miles = " + kilometers + " kilometers");
        System.out.println();

        
        
        // convert kilometers to miles
        kilometers = 6230;
        miles = kilometers/kilometersPerMiles;
        System.out.println(kilometers + " kilometers = " + miles + " miles");
        System.out.println();

        
        
        // convert pounds to kilograms
        pounds = 6230;
        kilograms = pounds/poundPerKilogram;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");
        System.out.println();

        
        
        // convert kilograms to pounds
        kilograms = 6230;
        pounds = kilograms/kilogramsPerPound;
        System.out.println(kilograms + " kilograms = " + pounds + " pounds");
        System.out.println();

        
        
        // convert gallons to liters
        gallons = 6230;
        liters = gallons/gallonsPerLiter;
        System.out.println(gallons + " gallons = " + liters + " liters");
        System.out.println();

        
        // convert liters to gallons
        liters = 6230;
        gallons = liters/litersPerGallon;
        System.out.println(liters + " liters = " + gallons + " gallons");
        System.out.println();
        
        
        // convert electronVolts to joules
        electronVolt = 6230;
        joule = electronVolt/electronVoltPerJoule;
        System.out.println(electronVolt + " electron volts = " + joule + " joules");
        System.out.println();
        
        
        
        // convert joules to electron volts
        joule = 6230;
        electronVolt = joule/joulePerElectronVolt;
        System.out.println(joule + " joules = " + electronVolt + " electron volts");
        System.out.println();

        
        
        
        
    
    
    
    
    
    
    
    
    
    
    }
    public static void main(String[] args) { 
             MeasurementConverter msrmcnvrtr = new MeasurementConverter();
             msrmcnvrtr.converter();
    }
}//end of class


