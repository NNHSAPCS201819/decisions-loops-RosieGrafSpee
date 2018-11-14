import java.util.Random;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ColorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ColorTest
{   
    public void testGray()
    {
        Random gen = new Random();
        Picture testPic = new Picture("AlhambraLandscape.jpg");
        
        ColorManipulator thing = new ColorManipulator(testPic);
        
        int width = testPic.getWidth();
        int height = testPic.getHeight();
        int x, y;
        for (int i = 0; i < 12; i++)
        {
            x = gen.nextInt(width / 2);
            y = gen.nextInt(height / 2);

            Pixel pix = testPic.getPixel(x, y);
            int sum = pix.getRed() + pix.getGreen() + pix.getBlue();
            
            thing.grayscale();
            Picture grayPic = new Picture(thing.getPic());
            Pixel grayPix = grayPic.getPixel(x, y);
            
            assertEquals("Hi", grayPix.getRed(), sum / 3);
            assertEquals("Hi", grayPix.getBlue(), sum / 3);
            assertEquals("Hi", grayPix.getGreen(), sum / 3);
        }
    }
}
