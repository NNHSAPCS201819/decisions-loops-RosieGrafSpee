
/**
 * Write a description of class LeapYr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LeapYr
{
    // instance variables - replace the example below with your own //
    
    public boolean isLeap(int y)
    {
        // put your code here
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
        {
            return true; 
        }
        return false;
    }
}
