/*
* The GambleBamble program implements an application that
* random number guessing game with the user which tells them how many guesses
* it took them to get it right.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-11-24 
*/

import java.util.Scanner;  // Import the Scanner class

public class GambleBamble {
  /**
   * This class is what plays the game.
   */
  public static void main(String[] args) {

    int attempts = 0;
    
    while (true) {
      try {
        // Create a Scanner object
        attempts = (attempts + 1);
        
        Scanner scan = new Scanner(System.in);

        int gameNumber = (int) (Math.random() * 5 + 1);

        System.out.println("A 6 sided dice has been rolled, guess the number:");
        int playerNumber = scan.nextInt();
        
        if (playerNumber == gameNumber) {
          break;
        } else {
          System.out.println();
          System.out.println("Wrong, try again!");
          System.out.println();
        }

      // Catches "an error" and tells you one occured.
      } catch (Exception e) {
        System.out.println();
        System.out.println("Wrong, try again!");
        System.out.println();
      }
    }

    // Ending statement.
    System.out.println();
    System.out.println("You guessed correctly!");
    System.out.println("It took you:");
    System.out.println(attempts + " attempts.");

  }
}
