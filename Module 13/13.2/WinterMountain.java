
/**
 * Winter Mountain terrain.
 *
 * @author Aditya Pratap
 * @version 4/22/2017
 */
public class WinterMountain extends Mountain
{
    private double temperature;
    public WinterMountain(int l, int w, int m, double temp)
    {
        super(l, w, m);
        temperature = temp;
    }
    
    public double getTemp()
    {
        return temperature;
    }
}