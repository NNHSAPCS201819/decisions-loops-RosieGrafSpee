import java.awt.Color;

/**
 * Transforms a picture by applying a Shepard Fairey-inspired effect.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShepardFairey
{
    private ColorManipulator manipulator;

    private static final Color OFF_WHITE = new Color( 248, 229, 175 );
    private static final Color LIGHT_BLUE = new Color( 121, 149, 159 );
    private static final Color RED = new Color( 198, 50, 45 );
    private static final Color DARK_BLUE = new Color( 16, 48, 77 );
    
    public static final Color off_white = OFF_WHITE;
    public static final Color light_blue = LIGHT_BLUE;
    public static final Color red = RED;
    public static final Color dark_blue = DARK_BLUE;
    

    public ShepardFairey( Picture newPicture )
    {
        this.manipulator = new ColorManipulator( newPicture );
    }

    /**
     * Transforms the picture by applying a Shepard Fairey-inspired effect.
     *
     */
    public void transform()
    {
        this.manipulator.colorize();
    }
    
    public void transform2()
    {
        this.manipulator.colorize2();
    }

    public static void main(String args[])
    {
        // create a new picture object based on the original selfie
        //  (the selfie image must be in the Shepard Fairey folder)
        Picture selfie = new Picture( "Port.jpg" );

        // create a ShepardFairey object to transform the selfie picture
        ShepardFairey fairey = new ShepardFairey( selfie );

        // display the original selfie picture
        selfie.explore();

        // transform the selfie picture by applying a Shepard Fairey-inspired effect
        fairey.transform();

        // save the transformed selfie picture
        
        /* This code doesn't work for some students for unknown reasons.
         * You may need to specify an absolute path. For example:
         *  finalPic.write("C:\\Users\\gschmit\\GitHub\\decisions-loops-gcschmit\\Shepard Fairey\\MrSchmitPortrait.jpg");
         */
        selfie.write( "C:\\Users\\zjliu\\Documents\\GitHub\\decisions-loops-RosieGrafSpee\\Shepard Fairey\\P.png" );
        
        // repeat the steps for the selfie in landscape orientation
        selfie = new Picture( "Land.png" );
        fairey = new ShepardFairey( selfie );
        selfie.explore();
        fairey.transform();
        selfie.write( "C:\\Users\\zjliu\\Documents\\GitHub\\decisions-loops-RosieGrafSpee\\Shepard Fairey\\L.png" );

        selfie = new Picture( "C:\\Users\\zjliu\\Pictures\\Camera Roll\\Untitled.png" );
        fairey = new ShepardFairey( selfie );
        selfie.explore();
        fairey.transform2();
        selfie.write("C:\\Users\\zjilu\\Pictures\\Camera Roll\\Capture2.png");
        
        // display the transformed selfie picture
        selfie.explore();
    }
}