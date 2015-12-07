import java.awt.Color;

/**
 * An image filter that applies the Grayscale effect
 * 
 * @author Dean Thomas
 * @version 2015.12.7
 */
public class Grayscale extends Filter
{
    //constants
    private final static int SCALE = 20;

    /**
     * Constructor for objects of class Grayscale
     */
    public GrayscaleFilter(String name)
    {
      super(name);
    }

}