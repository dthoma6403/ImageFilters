import java.awt.Color;
/**
 * This class applies a filter to invert the image
 * 
 * @author Dean Thomas 
 * @version 2015.12.7
 */
public class InvertFilter extends Filter
{
    /**
     * Constructor for InvertFilter objects using an input name for the filter
     * 
     * @param name  The name of the filter
     */
    public InvertFilter(String name)
    {
        super(name);
    }

    /**
     * Applies the invert filter to the current image by inverting the color of each pixel
     * 
     * @param image  The image to be inverted
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color invertPixel = new Color(255 - image.getPixel(x, y).getRed(),
                255 - image.getPixel(x, y).getGreen(), 255 - image.getPixel(x, y).getBlue());
                image.setPixel(x, y, invertPixel);
            }
        }
    }
}