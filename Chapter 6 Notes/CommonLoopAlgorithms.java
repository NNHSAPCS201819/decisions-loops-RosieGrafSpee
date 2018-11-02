import java.util.Scanner;

public class CommonLoopAlgorithms
{
   public static int compareAdjacent()
   {
       int now = -1000000, prev;
       
       Scanner in = new Scanner(System.in);
       System.out.println("Input a series of numbers to find the first adjacent number. And please do it individually");
       
       while (in.hasNextInt())
       {
           prev = now;
           now = in.nextInt();
           
           if (prev == now)
           {
               return now;
           }
       }
       
       return 2000000;
   }
}