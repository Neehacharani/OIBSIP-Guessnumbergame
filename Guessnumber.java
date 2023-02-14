import java.util.*;
import java.util.Random;
public class Guessnumber
{
    static int number;
    static int randomnum;
    static int score=100;
    public static void guessNumber()
    {
        System.out.println("Welcome to Guessing number game:");
        System.out.println("**************************");
        System.out.println("To play this game the following rules must be followed:");
        System.out.println("**************************");
        System.out.println("You have only 10 chances to guess the number");
        System.out.println("For every wrong guess your score will be reduced by 10points in a whole of 100");
        System.out.println("     ");
        System.out.println("**************************");
        int min=1,max=100;
        Scanner sc=new Scanner(System.in);
        randomnum=(int)(Math.random()*(max-min))+min;
        int chances=10,i,j;
        for(i=1;i<=chances;i++)
        {
            System.out.println("Enter a number");
            number=sc.nextInt();
            if(randomnum==number)
            {
                System.out.println("Congrajulations!!!You won the game");
                System.out.println("You scored"+" "+score);
                System.out.println("                         ");
               System.out.println("Wanna play one more time?");
               System.out.println("1:Yes");
                System.out.println("2:No");
                System.out.println("Enter your choice:");
               j=sc.nextInt();
               if(j==1)
               {
                guessNumber();
               }
               else if(j==2)
               System.out.println("you are out of the game");
               break;
            }
            else if(number>randomnum&&i>0)
            {
                System.out.println("Number is greater than the expected. Please enter another number");
            }
            else if(number<randomnum&&i>0)
            {
                System.out.println("Number is lesser than the expected. Please enter another number");
            }
            score=score-10;
        }
        if(i>chances)
        {
             System.out.println("     ");
            System.out.println("Well tried champ!!!");
            System.out.println("********************");
            System.out.println("Number is"+" "+randomnum);
            System.out.println("Better luck next time!!");
             System.out.println("You scored"+" "+score+" "+"points");
            System.out.println("              ");
            System.out.println("************************");
             System.out.println("Wanna play one more time?");
               System.out.println("1:Yes");
                System.out.println("2:No");
                System.out.println("Enter your choice:");
               j=sc.nextInt();
               if(j==1)
               {
                guessNumber();
               }
               else if(j==2){
               System.out.println("you are out of the game");
               }
        }

    }
    public static void main(String args[])
    {
        //Scanner sc=new Scanner(System.in);
        guessNumber();
    }
}