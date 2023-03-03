package nogurssinggame;
import java.util.*;

public class guessingGame {
	public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      Random rand = new Random();
      int guess = -1;
      
      try {
         System.out.println("Would you like to play a game? y/n");
         String response = in.nextLine();

         while (response.equals("y"))
         {
            System.out.println("Great!\nI will choose a number which is smaller than 100, and you want to guess it.");
            int randNum = rand.nextInt(100);
            System.out.println("...\n\nOkay! I am ready. Guess!");
            
            while (guess != randNum)
            {
               guess = in.nextInt();

               if (guess > randNum)
               {
                  System.out.println("No! I think that is very high. Please try again.");
               }
               else if (guess < randNum)
               {
                  System.out.println("No that is wrong. this is very low. Please Guess again!");
               }
               else
               {
                  System.out.println("Wow:) Amazing that is right you have choosen!");
               }
            }

            response = in.nextLine();
         }

         System.out.println("Its nice to play with you");
      } finally {
         in.close();
      }
   }
}