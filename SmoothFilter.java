import java.awt.Color;
/**
 * This class applies a filter to invert the image
 * 
 * @author Dean Thomas 
 * @version 2015.12.7
 */
public class SmoothFilter extends Filter
{
  /**
     * Constructor for objects of class LighterFilter.
     * @param name The name of the filter.
     */
    public SmoothFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
        }
    }
}