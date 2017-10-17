
/**
 * Main Triangle superclass and constructor.
 *
 * @author Aditya Pratap
 * @version 4/22/2017
 */
public class Triangle
{
    // instance variables
    private double sideA, sideB, sideC;
    
    public Triangle(double sideA, double sideB, double sideC)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    
    public double getSideA()
    {
        return sideA;
    }
    
    public double getSideB()
    {
        return sideB;
    }
    
    public double getSideC()
    {
        return sideC;
    }
}