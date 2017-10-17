
/**
 * Forest terrain.
 *
 * @author Aditya Pratap
 * @version 4/22/2017
 */
public class Forest extends Terrain
{
    private int trees;
    public Forest(int l, int w, int t)
    {
        super(l, w);
        trees = t;
    }
    
    public int getTrees()
    {
        return trees;
    }
}