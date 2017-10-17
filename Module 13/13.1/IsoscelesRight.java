
/**
 * Creates an Isosceles Triangle, using the Triangle Class.
 * 
 * @author Aditya Pratap
 * @version 4/22/2017
 */
public class IsoscelesRight extends Triangle
{
    public IsoscelesRight(double sides)
    {
        super(sides, sides, (sides * Math.sqrt(2)));
    }
}