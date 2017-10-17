
/**
 * Mountainous terrain.
 *
 * @author Aditya Pratap
 * @version 4/22/2017
 */
public class Mountain extends Terrain
{
    private int mountains;
    public Mountain(int l, int w, int m)
    {
        super(l, w);
        mountains = m;
    }
    
    public int getMountains()
    {
        return mountains;
    }
}