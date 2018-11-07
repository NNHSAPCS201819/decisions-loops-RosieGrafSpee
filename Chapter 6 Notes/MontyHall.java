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
        int doorNum = host.nextInt(3) + 1;
        
        System.out.println("There is a car behind one of the doors, but the others have goats");
        System.out.print("Please input the door you think has the car: ");
        
        Random user = new Random();
        int choice = user.nextInt(3) + 1;
        
        
    }
}
