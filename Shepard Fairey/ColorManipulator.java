import java.awt.Color;

/**
 * Class that manipulates the colors in a specified picture
 *
 * @author gcschmit
 * @version 5 June 2017
 */
public class ColorManipulator
{
    private Picture picture;

    private Color trueGreen = new Color(126, 255, 27);
    private Color trueBlue = new Color(36, 200, 255);
    private Color trueYellow = new Color(255, 248, 27);
    private Color trueMagenta = new Color(255, 27, 93);
    
    
    /**
     * Constructs a new ColorManipulator object with the specified picture
     *
     * @param  newPicture  the picture to manipulate
     */
    public ColorManipulator( Picture newPicture )
    {
        this.picture = newPicture;
    }

    /**
     * Sets the blue component of the color of every pixel in the picture to the maximum value
     *
     *      An example of manipulating one component of the color of a pixel.
     */
    public void maxBlue()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setBlue( 255 );
            }
        }
    }
    
    public void maxGreen()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setGreen( 255 );
            }
        }
    }
    
    public void maxRed()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setRed( 255 );
            }
        }
    }

    /**
     * Negates the color of every pixel in the picture
     *
     *      An example of manipulating the color of a pixel using a Color object
     */
    public void negate()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                
                int negatedRed = 255 - color.getRed();
                int negatedBlue = 255 - color.getBlue();
                int negatedGreen = 255 - color.getGreen();
                
                Color negated = new Color( negatedRed, negatedBlue, negatedGreen );
                pixel.setColor( negated );
            }
        }
    }

    public void grayscale()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                
                int avg = (color.getRed() + color.getBlue() + color.getGreen()) / 3;
                
                Color grayed = new Color( avg, avg, avg );
                pixel.setColor( grayed );
            }
        }
    }
    
    public void colorize()
    {
        this.grayscale();
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();
        
        int min = 255, max = 0;
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                Pixel pixel = this.picture.getPixel( x, y );
                min = min > pixel.getRed() ? pixel.getRed() : min;
                max = max < pixel.getRed() ? pixel.getRed() : max;
            }
        }
        
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                Pixel pixel = this.picture.getPixel( x, y );
                
                switch (4 * (pixel.getRed() - min + 1) / (max - min + 2))
                {
                    case 0:
                    {
                        pixel.setColor(ShepardFairey.red);
                        break;
                    }
                    
                    case 1:
                    {
                        pixel.setColor(ShepardFairey.light_blue);
                        break;
                    }
                    
                    case 2:
                    {
                        pixel.setColor(ShepardFairey.dark_blue);
                        break;
                    }
                    
                    case 3:
                    {
                        pixel.setColor(ShepardFairey.off_white);
                        break;
                    }
                    
                    default:
                    {
                        return;
                    }
                }
            }
        }
    }
    
    public void colorize2()
    {
        this.grayscale();
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();
        
        int min = 255, max = 0;
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                Pixel pixel = this.picture.getPixel( x, y );
                min = min > pixel.getRed() ? pixel.getRed() : min;
                max = max < pixel.getRed() ? pixel.getRed() : max;
            }
        }
        
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                Pixel pixel = this.picture.getPixel( x, y );
                
                switch (3 * (pixel.getRed() - min + 1) / (max - min + 2))
                {
                    case 0:
                    {
                        pixel.setColor(trueGreen);
                        break;
                    }
                    
                    case 1:
                    {
                        pixel.setColor(trueBlue);
                        break;
                    }
                    
                    case 2:
                    {
                        pixel.setColor(trueMagenta);
                        break;
                    }
                    
                    case 3:
                    {
                        pixel.setColor(trueYellow);
                    }
                    
                    default:
                    {
                        return;
                    }
                }
            }
        }
    }
    
    public Picture getPic()
    {
        return this.picture;
    }
    
    public static void main(String args[])
    {
        // the selfie image must be in the Shepard Fairey folder
        Picture picture= new Picture( "selfiePortrait.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        picture.explore();
        manipulator.colorize();
        picture.explore();
    }
}
