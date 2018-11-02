import java.util.Scanner;

/**
 * Write a description of class All here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class All
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class All
     */
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double RewriteLoops()
    {
        int s = 0;
        int i = 1;
        while (i <= 10)
        {
            s += i;
            i++;
        }
        
        System.out.println(s);
        
        Scanner in = new Scanner( System.in );
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        double x = 0;
        double t;
        do
        {
            t = 1.0 / (1 + n * n);
            n++;
            x = x + t;
        }
        while (t > 0.01);
        return x;
    }
}
