
/**
 * Write a description of class StrCompare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StrCompare
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StrCompare
     */
    public StrCompare()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        if (word1.compareTo("aaa") > 0)
        {
            System.out.println("condition #n is true");
        }
        
        if (word1.compareTo(word2) == 0)
        {
            System.out.println("condition #n is true");
        }
        
        if (word1.compareTo(word2) < 0)
        {
            System.out.println("condition #n is true");
        }
        
        if (word1.substring(0, 3).compareTo(word2) == 0)
        {
            System.out.println("condition #n is true");
        }
    }
}
