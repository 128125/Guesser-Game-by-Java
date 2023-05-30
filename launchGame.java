import java.util.*;
class Guesser 
{
        int guessNum;

        int guessingNumber() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Guesser! Kindly Guess the Number");
            guessNum = scan.nextInt();
            return guessNum;
        }
}

class Player 
{
        int guessNum;

        int guessingNumber() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Player! Kindly Guess the Number");
            guessNum = scan.nextInt();
            return guessNum;
        }
}

class Umpire 
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectnumfromGuesser() {
        Guesser g=  new Guesser();
        numFromGuesser=g.guessingNumber();
    }

    void collectnumfromPlayers()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();
    }

    void compare()
    {
        if (numFromGuesser==numFromPlayer1) {
            if (numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
                System.out.println("All Player Answer is Correct");
            }
            else if (numFromGuesser==numFromPlayer2) {
                System.out.println("Player1 and Player2 won the Game");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player1 and Player3 won the Game");
            }
            else{
                System.out.println("Player1 won the Game");
            }
        }
        else if (numFromGuesser==numFromPlayer2) {
            if (numFromGuesser==numFromPlayer3) {
                System.out.println("Player2 and Player3 won the Game");
            }
            else{
                System.out.println("Player2 won the Game");
            }
        }
        else if (numFromGuesser==numFromPlayer3) {
            System.out.println("Player3 won the Game");
        }
        else
        {
            System.out.println("Number not Matched. Restart the Game");
        }
    }
}
public class launchGame {
    public static void main(String[] args) {
        System.out.println("Game Started");
        Umpire u=new Umpire();
        u.collectnumfromGuesser();
        u.collectnumfromPlayers();
        u.compare();
    }
}