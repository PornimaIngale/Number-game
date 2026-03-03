
import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Random rand=new Random();
int randomNumber=rand.nextInt(100)+1;
int guess =0;
int attempts=0;
System.out.println("Guess a number between 1 and 100");
while(guess!=randomNumber)
{
System.out.print("Enter your guess");
guess=sc.nextInt();
attempts++;
if(guess==randomNumber)
{
System.out.println("correct you guessed it!"+attempts+"attempts");
}
else if(guess>randomNumber)
{
System.out.println("too high!");
}
else
{
System.out.println("to low!");
}
}
sc.close();
}
}