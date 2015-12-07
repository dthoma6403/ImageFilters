import java.awt.Color;

/**
 * An image filter that applies the Grayscale effect
 * 
 * @author Dean Thomas
 * @version 2015.12.7
 */
public class Grayscale extends Filter
{
    /**
     * Constructor for objects of class Grayscale
     */
    
    public Grayscale(String name)
    {
      super(name);
    }
    
    /**
     * Apply the filter
     */
    public void apply(OFImage image)
    {
       int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                int average = (int)  ((float) (image.getPixel(x,y).getRed() +
                                              (image.getPixel(x,y).getGreen() +
                                              (image.getPixel(x,y).getBlue())/3)));
                image.setPixel (x,y, new Color(average, average, average));
            }
        }
    }
}
