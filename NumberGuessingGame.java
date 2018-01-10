import java.util.Scanner;
public class GuessANumber {
    public static String[] notIt = {"No", "Wrong", "Nope", "Try again", "*shakes head sadly*", "*cries for you because no*",
            "definitely not", "Go fish", "Guess again", "ummmmm... no.", "Yes!!!! jk, that's not it. Try again.", 
            "pls try harder, that was wrong", "Nice try", "I'm not mad... I'm just disappointed."};

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String user; //users name. To taunt them and stuff lol.
        boolean playAgain = false; 
        
        do {
            //Level 1: range 1-10
            int tries = 1; //to hold how many tries it takes to guess the num
            double num = Math.floor(Math.random() * 10 + 1); // to generate the random num
        
            System.out.println("I've got a number in mind from 1 to 10, can you guess what it is?");
            double guess = scan.nextDouble();
            while (guess != num) {
                System.out.println(notIt[noRespNum()]);
                if (guess > 10 || guess < 1) {
                    System.out.println("That's not even a valid guess! Are you even TRYING????");
                }
                guess = scan.nextDouble();
                scan.nextLine();
                tries++;
            } 
            if (guess == num) {
                System.out.println("You guessed it!!! The number was " + num + "!!!!! Good job!!!");
                if (tries == 1) {
                    System.out.println("You got it on your first try!!!");
                } else {
                    System.out.println("It only took you " + tries + " guesses!");
                }
            }
        
            //Level 2: range 1-50
            num = Math.floor(Math.random() * 50 + 1);
            tries = 1; //reset tries for lv2
        
            System.out.println("I think it's time I knew my competition... what's your name?");
            user = scan.nextLine();
            System.out.println("Okay, " + user + ", you guessed my first number. But! Can you guess this one???");
            System.out.println("I'm thinking of a number 1 through 50...");      
            guess = scan.nextDouble();
            while (guess != num) {
                System.out.print(notIt[noRespNum()]);
                if (guess > 50 || guess < 1) {
                    System.out.println("That's not even in the range! YOU'RE NOT EVEN TRYING?!?");
                } else if (guess > num) {
                    System.out.println(" (lower....)");
                } else if (guess < num){
                    System.out.println(" (higher....)");
                }
                guess = scan.nextDouble();
                tries++;
            }
            if (guess == num) {
                System.out.println("You guessed it, " + user + "! (Yes, really) The number was " + num);
                if (tries == 1) {
                    System.out.println("You even guessed it on your FIRST try... that's just pure luck...");
                } else {
                    System.out.println("Good job! It only took you " + tries + " guesses!");
                }
            }
            
            //Level 3: range 1-100
            num = Math.floor(Math.random() * 100 + 1);
            tries = 1; //reset tries for lv3
            
            System.out.println("So, you're pretty good at this, I guess. But can you figure this one out???");
            System.out.println("My number is anywhere from 1 to 100. GO!");
            guess = scan.nextDouble();
            while (guess != num) {
                System.out.print(notIt[noRespNum()]);
                if (guess > 100 || guess < 1) {
                    System.out.println(" " + user + "......... THAT'S NOT AN OPTION AND YOU KNOW IT!!!!");
                } else if (guess > num) {
                    System.out.println(" (lower...)");
                } else if (guess < num){
                    System.out.println(" (higher...)");
                }
                guess = scan.nextDouble();
                tries++;
            }
            if (guess == num) {
                System.out.println("Hey, hey, hey!!! YOU DID IT!");
                if (tries == 1) {
                    System.out.println("On your FIRST TRY???? What even ARE you??? *cough* witchcraft *cough*");
                } else {
                    System.out.println("And it only took you " + tries + " tries! Although, I did give hints, so...");
                }
            }
            
            //Level 4: range 1-1000
            num = Math.floor(Math.random() * 1000 + 1);
            tries = 1; //reset tries for lv4
            
            System.out.println("Now for the reeeeeal challenge!");
            System.out.println("1-1000 >:) What's your first guess???");
            guess = scan.nextDouble();
            while (guess != num) {
                System.out.print(notIt[noRespNum()]);
                if (guess > 1000 || guess < 1) {
                    System.out.println(" " + user.toUpperCase() + " STOP GUESSING NUMBERS OUTSIDE THE RANGE!!!");
                } else if (guess > num) {
                    System.out.println(" (lower)");
                } else if (guess < num){
                    System.out.println(" (higher)");
                }
                guess = scan.nextDouble();
                tries++;
            }
            if (guess == num) {
                System.out.println("You're right! My number this time was " + num + ".");
                if (tries == 1) {
                    System.out.println("I can hardly believe that you actually got this on the first try! Do you read minds...?");
                } else {
                    System.out.print("Hey, you did it in " + tries + " guesses!");
                }
                if (tries <= 5) {
                    System.out.println(" Amazing!");
                } else if (tries > 5 && tries <= 10) {
                    System.out.println(" That's pretty good!!");
                } else if (tries > 10 && tries <= 20) {
                    System.out.println(" Not bad...");
                } else if (tries > 20 && tries <= 30) {
                    System.out.println(" It may have taken a while, but you got it! Yay!");
                } else {
                    System.out.print(" At least you finally got it..... :)");
                }
            }
        
            System.out.println("Good game, " + user + ".");
            System.out.println("Do you want to play again?");
            String play = scan.next();
            if (play.equals("Yes") || play.equals("yes") || play.equals("y") || play.equals("Y") || play.equals("okay") || play.equals("sure")) {
                System.out.println("Yay! Playing again!!! Back to square one, then! (With all new numbers*....)");
                System.out.println("(*Due to my method of choosing numbers, there is a SMALL chance the numbers could be repeated)");
                playAgain = true;
            }
        } while (playAgain == true);
        System.out.println("Okay, well, thanks for playing this far! You did well!");
        System.out.println("Bye bye, " + user + "!");
    }
    public static int noRespNum() {
        int no = (int) Math.floor(Math.random() * notIt.length); //Will pick a number for the index of a response from notIt
        return no;
    }
}
