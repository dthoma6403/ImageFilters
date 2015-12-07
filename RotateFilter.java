import java.awt.Color;
/**
 * This class applies a filter to invert the image
 * 
 * @author Dean Thomas 
 * @version 2015.12.7
 */
public class RotateFilter extends Filter
{
    
    public RotateFilter(String name)
    {
        super(name);
    }
    
     /**
     * Apply the Filter
     */
    
     public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        OFImage original = new OFImage(image);
        
        
        for(int y = 1; y < height; y++) {
            for(int x = 1; x < width; x++) {               
                image.setPixel(width-x, height-y, original.getPixel(x, y));
            }
        }
    }
}
    