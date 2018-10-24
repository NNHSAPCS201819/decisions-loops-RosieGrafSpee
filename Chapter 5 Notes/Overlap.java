import java.util.Scanner;
import java.lang.Math;

/**
 * Write a description of class Overlap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Overlap
{
    // instance variables - replace the example below with your own
    private int x;
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      
      System.out.print("Input the x-coordinate of the first circle's center: ");
      double xcenter1 = in.nextDouble();
      System.out.print("Input the y-coordinate of the first circle's center: ");
      double ycenter1 = in.nextDouble();
      
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      
      System.out.print("Input the x-coordinate of the second circle's center: ");
      double xcenter2 = in.nextDouble(); 
      System.out.print("Input the y-coordinate of the second circle's center: ");
      double ycenter2 = in.nextDouble(); 
      
      String a = "no ";
      if (radius1 + radius2 > Math.sqrt((xcenter1 - xcenter2) * (xcenter1 - xcenter2) + (ycenter1 - ycenter2) * (ycenter1 - ycenter2)))
      {
          a = "";
          if (radius1 > Math.sqrt((xcenter1 - xcenter2) * (xcenter1 - xcenter2) + (ycenter1 - ycenter2) * (ycenter1 - ycenter2)) &
          radius2 > Math.sqrt((xcenter1 - xcenter2) * (xcenter1 - xcenter2) + (ycenter1 - ycenter2) * (ycenter1 - ycenter2)))
          {
              System.out.println("mutually contained");
              return;
          }
      }
      
      System.out.println(a + "overlap exists");
   }
}
