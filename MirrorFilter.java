import java.awt.Color;
/**
 * This class applies a filter to mirror the image
 * 
 * @author Dean Thomas 
 * @version 2015.12.7
 */
   public class MirrorFilter extends Filter
{
    /**
     * Constructor for MirrorFilter objects using an input name for the filter
     * 
     * @param name  The name of the filter
     */
    public MirrorFilter(String name)
    {
        super(name);
    }

    /**
     * Applies the mirror filter to the current image by swapping the pixels horizontally
     * 
     * @param image  The image to be mirrored
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        Color tempPixel;
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width/2; x++) {
                tempPixel = image.getPixel(x, y);
                image.setPixel(x, y, image.getPixel(width - 1 - x, y));
                image.setPixel(width - 1 - x, y, tempPixel);
            }
        }
    }
}

