import java.util.Scanner;

/**
 * Write a description of class Rps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class RockPaperScissors
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        do
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase(); 
        
        if (player1.equals(player2))
        {
            System.out.println("TIE!");
        }
        
        else if (player1.equals("rock") && player2.equals("scissors") || 
        player1.equals("scissors") && player2.equals("paper") 
        || player1.equals("paper") && player2.equals("rock")) 
        {
            System.out.println("Player 1 WINS!");
        }
        
        else if (player2.equals("rock") && player1.equals("scissors") || 
        player2.equals("scissors") && player1.equals("paper") 
        || player2.equals("paper") && player1.equals("rock"))
        {
            System.out.println("Player 2 WINS!");
        }
    }
}
