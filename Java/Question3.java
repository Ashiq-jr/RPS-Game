import java.util.*;
import java.lang.*;

public class Question3
{
    public static void main(String args[])
    {
        // Question1
        // int n = GetInteger("Enter The Number Of Terms(N) :");
        // int i = 1;
        // System.out.printf("%n");
        // while(i<=n)
        // {
        //     System.out.println( i);
        //     i++;
        // }

        // Question2
        // int m = GetInteger("From Which Number Do You Want To Print (M) :");
        // int n = GetInteger("Upto Which Number Do You Want To Print (N) :");
        // int i = m;
        // System.out.printf("%n");
        // while(i<=n)
        // {
        //     System.out.println( i);
        //     i++;
        // }

        // Question 3
        // int n = GetInteger("Enter The Range(N) :");
        // int i = 2;
        // System.out.printf("%n");
        // while(i<=n)
        // {
        //     System.out.println( i);
        //     i = i+2;
        // }

        // Question 4
        // int n = GetInteger("Enter The Range(N) :");
        // int i = 1;
        // System.out.printf("%n");
        // while(i<=n)
        // {
        //     System.out.println( i);
        //     i = i+2;
        // }

        // Question 5
        // int m = GetInteger("From Which Number Do You Want To Print (M) :");
        // int n = GetInteger("Upto Which Number Do You Want To Print (N) :");
        // if(m % 2 != 0)
        // {
        //     m++;
        // }
        // int i = m;
        // System.out.printf("%n");
        // while(i<=n)
        // {
        //     System.out.println( i);
        //     i = i+2;
        // }

        // Question6
        // int m = GetInteger("From Which Number Do You Want To Print (M) :");
        // int n = GetInteger("Upto Which Number Do You Want To Print (N) :");
        // if ( m % 2 ==0)
        // {
        //     m++;
        // }
        // int i = m;
        // System.out.printf("%n");
        // while(i<=n)
        // {
        //     System.out.println( i);
        //     i = i+2;
        // }

        // Question7
        // int n = GetInteger("Enter The Value of N:");
        // int i = n;
        // System.out.printf("%n");
        // while(i <= 100)
        // {
        //     System.out.println(i);
        //     i=i+n;
        // }

        // Question8
        // int n = GetInteger("Enter The Table You Want(N) :");
        // int i = 1;
        // System.out.printf("%nThe Multiplication Table For Number %d is : %n" , n );
        // while(i<=20)
        // {
        //     int multiplication = i * n;
        //     System.out.println(i + " * " + n + " = " + multiplication);
        //     i++;
        // }

        // Question9
        // int table = 1;
        // while(table<=5)
        // {
        //     System.out.printf("Multiplication Table For Number %d Is : %n" , table);
        //     for(int i= 1; i<=20; i++){
        //     int multiplication = i * table ;
        //     System.out.println(table + " * " + i + " = " + multiplication);
        //     }
        //     System.out.printf("%n");
        //     table++;
        // }

        //Question10
        // int n = GetInteger("Enter The Value of N :");
        // int sum = 0;
        // for(int i=1; i<=n ; i++)
        // {
        //    sum += i;
        // }
        // System.out.println("The Sum Of All the Numbers From 1 To " + n + " is : " + sum);

        //Question11
        // int n = GetInteger("Enter The Value of N: ");
        // int i = 2;
        // int sum = 0;
        // do
        // {
        //     sum += i;
        //     i = i+2;
        // }while(i<=n);
        // System.out.println("The Sum Of All The Even Numbers From 1 To " + n + " is : " + sum);

        //Question12
        // int n = GetInteger("Enter The Value of N: ");
        // int i = 1;
        // int sum = 0;
        // do
        // {
        //     sum += i;
        //     i = i+2;
        // }while(i<=n);
        // System.out.println("The Sum Of All The Odd Numbers From 1 To " + n + " is : " + sum);

        //Question13
        // int n = GetInteger("Enter The Value Of N : ");
        // int k = GetInteger("The Multiples Of Which Number Do You Want (K) : ");
        // int sum = 0;
        // for(int i = k ; i<=n ; i=i+k)
        // {
        //     sum += i;
        // }
        // System.out.println("The Sum Of Numbers Which Are Multiples Of " + k + " From 1 To " + n + " is : " + sum);

        // Question14
        // int n = GetInteger("Enter The Range(N) : ");
        // int i = 1;
        // System.out.printf("%n");
        // while(i <= n)
        // {
        //     if(i%3==0 && i%5==0)
        //     {
        //         System.out.println("FizzBuzz");
        //     }
        //     else if(i%3==0)
        //     {
        //         System.out.println("Fizz");
        //     }
        //     else if(i%5==0)
        //     {
        //         System.out.println("Buzz");
        //     }
        //     else
        //     {
        //         System.out.println(i);
        //     }
        //     i++;
        // }
        
        // Question15
        // int n = GetInteger("Enter The Number : ");
        // int factorial = 1;
        // for(int i = 1; i<=n; i++)
        // {
        //     factorial *= i;
        // }
        // System.out.println(factorial);

        // Question16
        // int n = GetInteger("Enter The Number Of Subjects In The Current Semester : ");
        // System.out.printf("%n");
        // double total = 0;
        // int i = 1;
        // while(i<=n)
        // {
        //     double mark = GetDouble("Enter Mark " + i + " :");
        //     total += mark;
        //     i++;
        // }
        // double average = total / n;
        // System.out.printf("%nYour Total Marks is : %.0f" , total);
        // System.out.printf("%nYour Average Mark is : %.2f" , average);

        // Question17
        // int n = GetInteger("Enter The Number Of Rounds In The Match : ");
        // int totalpoints = 0;
        // int i = 1;
        // while(i<=n)
        // {
        //     int roundpoint = GetInteger("\n" + "Enter The Points You Obtained in Round " + i + " :");
        //     totalpoints += roundpoint;
        //     if(i < n){
        //     System.out.printf("%n** Points Obtained After Round %d is : %d ** %n" ,i ,totalpoints);
        //     }
        //     i++;
        // }
        // System.out.printf("%nThe Total Points You Accumulated In %d Rounds Is : %d " ,n ,totalpoints);
       
        // Question18
        // int result = 0;
        // String userinput = "";
        // do
        // {
        //     int number1 = GetInteger("Enter The First Number : ");
        //     int number2 = GetInteger("Enter The Second Number : ");
        //     int choise = GetInteger("\nPress 1 To Perform Addition." + "\nPress 2 To Perform Subtraction." + "\nPress 3 To Perform Multiplication." + "\nPress 4 To Perform Division." );
        //     if(choise == 1)
        //     {
        //         result = number1 + number2 ;
        //         System.out.println("The Sum Of " + number1 + " and " +  number2 + " is : " + result);
        //     }
        //     else if(choise == 2)
        //     {
        //         result = number1 - number2 ;
        //         System.out.println(number1 + " Minus " + number2 + " is : " + result);
        //     }
        //     else if(choise == 3)
        //     {
        //         result = number1 * number2 ;
        //         System.out.println("The Multiplication Of " + number1 + " and  " + number2 + " is : " + result);
        //      }
        //     else if(choise == 4)
        //     {
        //         result = number1 / number2 ;
        //         System.out.println("The Division Of " + number1 + " and " +  number2 + " is : " + result);
        //      }
        //     userinput = (Getstring("Press yes To Continue : ")).toLowerCase();
        //     System.out.printf("%n");

        //  }while(userinput.equals("yes"));

        // Question19
        // int n = GetInteger("Enter The Number Of Turns (3/5/7) : ");
        // int i = 1;
        // int useroverall = 0;
        // int aioverall = 0;
        // if(n==3 || n==5 || n==7)
        // {

        //     do
        //     {
        //         //Declaring The necessary Variables and Getting the User Input.
        //         System.out.printf("%nRound %d : ", i);
        //         System.out.printf("%n______________ %n");
        //         int userchoise = UserInput();
        //         int computerchoise = AiInput();
        //         int userround = 0;
        //         int airound = 0;

        //         if(IsRock(userchoise))
        //         {

        //             if(IsRock(computerchoise))
        //             {
        //                 System.out.printf("%nYour Choise Is : %d (Rock).... The Computer's Choise is : %d (Rock).... Hence A draw ! %n" , userchoise, computerchoise);
        //                 userround += 0;
        //                 airound += 0;
        //             }
        //             else if(IsPaper(computerchoise))
        //             {
        //                 System.out.printf("%nYour Choise Is : %d (Rock).... The Computer's Choise is : %d (Paper).... Paper Wraps the Rock, Computer wins! %n" , userchoise, computerchoise);
        //                 airound += 1;
        //             }
        //             else if(IsScissors(computerchoise))
        //             {
        //                 System.out.printf("%nYour Choise Is : %d (Rock).... The Computer's Choise is : %d (Scissors).... Rock Blunts the Scissors, You win! %n" , userchoise, computerchoise);
        //                 userround += 1;
        //             }
        //         } 

        //         else if(IsPaper(userchoise))
        //         {
        //             if(IsRock(computerchoise)) 
        //             {
        //                 System.out.printf("%nYour Choise Is : %d (Paper).... The Computer's Choise is : %d (Rock)....  Paper Wraps the Rock, You win! %n" , userchoise, computerchoise);
        //             userround += 1;
        //             }
        //             else if(IsPaper(computerchoise))
        //             {
        //                 System.out.printf("%nYour Choise Is : %d (Paper).... The Computer's Choise is : %d (Paper).... Hence A Draw! %n" ,   userchoise, computerchoise);
        //                 userround += 0;
        //                 airound += 0;
        //             }
        //             else if(IsScissors(computerchoise))
        //             {
        //                 System.out.printf("%nYour Choise Is : %d (Paper).... The Computer's Choise is : %d (Scissors).... Scissors Cuts The Paper, Computer wins! %n" , userchoise, computerchoise);
        //                 airound += 1;
        //             }
        //         }

        //         else if(IsScissors(userchoise))
        //         {
        //             if(IsRock(computerchoise))
        //             {
        //                 System.out.printf("%nYour Choise Is : %d (Scissors).... The Computer's Choise is : %d (Rock).... Rock Blunts the Scissors, Computer wins! %n" , userchoise, computerchoise);
        //              airound += 1;
        //             }
        //             else if(IsPaper(computerchoise))
        //             {
        //             System.out.printf("%nYour Choise Is : %d (Scissors).... The Computer's Choise is : %d (Paper).... Scissors Cuts The Paper, You win!! %n" , userchoise, computerchoise);
        //             userround += 1;
        //             }
        //             else if(IsScissors(computerchoise))
        //             {
        //                 System.out.printf("%nYour Choise Is : %d (Scissors).... The Computer's Choise is : %d (Scissors).... Hence A Draw! %n" , userchoise, computerchoise);
        //                 userround += 0;
        //                 airound += 0;
        //             }
        //         }

        //         else if ( userchoise < 0 || userchoise >= 4)
        //         {
        //             System.out.println("%nInvalid Choise....");
        //         }

        //         // collecting The points After Each Round To Print Overall Points

        //         useroverall += userround;
        //         aioverall += airound;
        //         System.out.println("\n****Score Card****");
        //         System.out.println("Your Score After Round " + i + " is => " + useroverall + " Points.");
        //         System.out.println("AI Score After Round " + i + " is => " + aioverall + " Points.");

        //         i++;

        //     } while(i<=n);
        //     System.out.printf("%n-----------------");
        //     System.out.printf("%n%s After %d Rounds. " ,OverallWinner(useroverall, aioverall) , n);
        //     System.out.printf("%n-----------------%n");
        // }

        // else
        // {
        //     System.out.println("Choose Between 3 / 5 / 7 Rounds Please.");
        // }

        // Question20
        // int i = 1;
        // Random r = new Random();
        // int magic = r.nextInt(1,21);
        // do
        // {
        //     int number = GetInteger("\n" + "TURN " + i + " => Enter a Number Between 1 and 20 :");
        //     if (magic==number)
        //     {
        //         System.out.printf("%n** You Won. You Took %d Turns To Guess The Number **" , i);
        //         break;
        //     }
        //     else if (magic > number)
        //     {
        //         System.out.printf("%n** Entered Number is Smaller Than The Magic Number **");
        //     }
        //     else if (magic < number)
        //     {
        //         System.out.printf("%n** Entered Number is Larger Than The Magic Number **");
        //     }
        //     i++;
        // } while(i<=100);


    }
    // To Get An Integer as the Input.
    public static int GetInteger(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        return temp;
    }
    // To Get A Long as the Input.
    public static long GetLong(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        long temp = sc.nextLong();
        return temp;
    }
    // To Get A Double as the Input.
    public static double GetDouble(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        return temp;
    }
    // To Get A Float as the Input.
    public static float GetFloat(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        return temp;
    }
    // To Get A Character as the Input.
    public static char GetChar(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        char temp = sc.next().charAt(0);
        return temp;
    }
    // To Get A String as the Input.
    public static String Getstring(String message)
    {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        return temp;
    }
    // To Get The AI Input in RPS Game.
    public static int AiInput()
    {
        Random r = new Random();
        int temp = r.nextInt(1,4);
        return temp;
    }
    // To Get The User Input in RPS Game.
    public static int UserInput()
    {
        int choise = 0;
        int i = 1;
        do
        {
            choise = GetInteger("\nEnter for Rock : 1" + "\nEnter For Paper : 2" + "\nEnter For Scissors : 3" + "\nEnter Your Choise : " );
            if(choise>3)
            {
               System.out.println("\n" + "** Error.. Please Enter A Value Between 1 and 3 **" + "\n");
            }
            else 
            {
                break;
            }
            i++;
        }while(i<=1000);
        return choise;
    }
    // To Check  If The User Input Is "Rock"  in RPS Game.
    public static boolean IsRock(int choise)
    {
        return choise == 1;
    }
    // To Check  If The User Input Is "Paper"  in RPS Game.
    public static boolean IsPaper(int choise)
    {
        return choise == 2;
    }
    // To Check If The User Input Is "Scissors"  in RPS Game.
    public static boolean IsScissors(int choise)
    {
        return choise == 3;
    }
    // To Declare The Overall Winner in RPS Game.
    public static String OverallWinner(int useroverall, int aioverall)
    {
        if(useroverall > aioverall)
        {
            return "User Won The Match";
        }
        else if(useroverall < aioverall)
        {
            return "AI Won The Match";
        }
        else if(useroverall == aioverall)
        {
            return "Its Still A Draw ";
        }
        else
        {
            return "error";
        }
    }

}