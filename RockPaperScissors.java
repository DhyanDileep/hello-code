//Rock, Paper, Scissors 
import java.io.*;
import java.util.Random;
class RockPaperScissors{
    public static void main(String args[]) throws IOException {
        
        String[] choice = {"rock","paper","scissors"};
        String compChoice;
        
        System.out.print("Enter your choice (rock, paper, scissors): ");
        
        DataInputStream obj = new DataInputStream(System.in);
        
       String playerChoice=obj.readLine().toLowerCase().trim();
       
       Random random = new Random();
       
       compChoice=choice[random.nextInt(3)];
       
       System.out.println("Your choice: "+playerChoice);
       
       System.out.println("Computer choice: "+compChoice);
       
       if(playerChoice.equals(compChoice)){
           
           System.out.println("DRAW");
           
       }
       else if(playerChoice.equals("rock") && compChoice.equals("scissors") || playerChoice.equals("paper") && compChoice.equals("rock") || playerChoice.equals("scissors") && compChoice.equals("paper")){
           
           System.out.println("You WIN");
           
       }
       else{
           
           System.out.println("You LOSE");
           
       }
    }
}
