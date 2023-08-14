import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissors_game {
    public static void main(String[] args) {
        System.out.println("Hii there \nThis is a Rock Paper Scissor game \nMy name s Lyla\nI'm a bot who will be playing Rock Paper and Scissors with you\uD83E\uDD17 ");

//        #Bot input
        Random a = new Random();
        int bot = a.nextInt(3)+1;
//        System.out.println(bot);

        String botinput = "null";

        switch (bot){
            case 1 -> botinput = "Rock";
            case 2 -> botinput = "Paper";
            case 3 -> botinput = "Scissor";
        }
//        System.out.println(botinput);

//        User input
        Scanner b = new Scanner(System.in);
        System.out.println("Type your entry as Rock , Paper or Scissor \n(please write first letter in capital)");
        String user = b.next();

        System.out.println("Your input is: "+user+"  And mine is :"+botinput);

//        Draw
        if (botinput.equals(user)){
            System.out.println("Its a draw ;)");
        }

//        User wins
        if (botinput.equals("Rock") && Objects.equals(user, "Paper")){
            System.out.println("wow you won\uD83D\uDE2F \nCongratulations\uD83E\uDD73");
        }
        if (botinput.equals("Paper") && Objects.equals(user, "Scissor")){
            System.out.println("wow you won\uD83D\uDE2F \nCongratulations\uD83E\uDD73");
        }
        if (botinput.equals("Scissor") && Objects.equals(user, "Rock")){
            System.out.println("wow you won\uD83D\uDE2F \nCongratulations\uD83E\uDD73");
        }

//        Bot wins
        if (botinput.equals("Paper") && Objects.equals(user, "Rock")){
            System.out.println("oh no you lost  \nand i win\uD83D\uDE01");
        }
        if (botinput.equals("Rock") && Objects.equals(user, "Scissor")){
            System.out.println("oh no you lost  \nand i win\uD83D\uDE01");
        }
        if (botinput.equals("Scissor") && Objects.equals(user, "paper")) {
            System.out.println("oh no you lost and i win\uD83D\uDE01");
        }
//        else {
//            System.out.println("that not a right input\nPlease try again");
//        }
    }
}
