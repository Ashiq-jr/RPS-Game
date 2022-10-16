import java.util.*; 
import java.lang.*; 

public class RPSGame
{
    public static void main (String args[])
    {
        int userchoise = GetInteger("Enter for Rock : 1" + "\nEnter For Paper : 2" + "\nEnter For Scissors : 3" + "\nEnter Your Choise : " );
        Random r = new Random();
        int computerchoise = r.nextInt(1, 4);
        if(IsRock(userchoise))
        {
            if(IsRock(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Rock).... The Computer's Choise is : %d (Rock).... Hence A draw !" , userchoise, computerchoise);
            }
            else if(IsPaper(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Rock).... The Computer's Choise is : %d (Paper).... Paper Wraps the Rock, Computer wins!" , userchoise, computerchoise);
            }
            else if(IsScissors(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Rock).... The Computer's Choise is : %d (Scissors).... Rock Blunts the Scissors, You win!" , userchoise, computerchoise);
            }
        }
        else if(IsPaper(userchoise))
        {
            if(IsRock(computerchoise)) 
            {
                System.out.printf("\nYour Choise Is : %d (Paper).... The Computer's Choise is : %d (Rock)....  Paper Wraps the Rock, You win!" , userchoise, computerchoise);
            }
            else if(IsPaper(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Paper).... The Computer's Choise is : %d (Paper).... Hence A Draw!" , userchoise, computerchoise);
            }
            else if(IsScissors(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Paper).... The Computer's Choise is : %d (Scissors).... Scissors Cuts The Paper, Computer wins!" , userchoise, computerchoise);
            }
        }
        else if(IsScissors(userchoise))
        {
            if(IsRock(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Scissors).... The Computer's Choise is : %d (Rock).... Rock Blunts the Scissors, Computer wins!" , userchoise, computerchoise);
            }
            else if(IsPaper(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Scissors).... The Computer's Choise is : %d (Paper).... Scissors Cuts The Paper, You win!!" , userchoise, computerchoise);
            }
            else if(IsScissors(computerchoise))
            {
                System.out.printf("\nYour Choise Is : %d (Scissors).... The Computer's Choise is : %d (Scissors).... Hence A Draw!" , userchoise, computerchoise);
            }
        }
        else if ( userchoise < 0 || userchoise >= 4)
        {
            System.out.println("\nInvalid Choise....");
        }
    }


    // To Get An Integer as the Input
    public static int GetInteger(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        return temp;
    }
     // If The User Input Is "Rock"  in Rock, Paper and Scissors.
    public static boolean IsRock(int choise)
    {
        return choise == 1;
    }
    // If The User Input Is "Paper"  in Rock, Paper and Scissors.
    public static boolean IsPaper(int choise)
    {
        return choise == 2;
    }
    // If The User Input Is "Scissors"  in Rock, Paper and Scissors.
    public static boolean IsScissors(int choise)
    {
        return choise == 3;
    }   
}   
