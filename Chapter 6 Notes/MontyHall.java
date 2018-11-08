import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class MontyHall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MontyHall
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main(String[] args)
    {
        Random host = new Random();
        Random user = new Random();
        int switWins = 0, stayWins = 0, switLoss = 0, stayLoss = 0;
        int numTimes = 10000000;
        
        while (numTimes-- != 0)
        {
            int carNum = host.nextInt(3) + 1;
            int choice = user.nextInt(3) + 1;
        
            if (carNum == choice)
            {
                if (user.nextInt(2) == 0)
                {
                    stayWins++;
                }
                else
                {
                    switLoss++;
                }
            }
            else
            {
                if (user.nextInt(2) == 0)
                {
                    stayLoss++;
                }
                else
                {
                    switWins++;
                }
            }
        }
        
        System.out.println("Wins while staying: " + stayWins + "\nLosses while staying: " + stayLoss + "\nWins while switching: " + switWins + "\nLosses while switching: " + switLoss);
    }
    
    int fib(int n)
    {
        int f1 = 1, f2 = 1, fn = f1 + f2;
        
        for (int i = 0; i < n - 2; i++)
        {
            
        }
        
        return fn;
    }
}
