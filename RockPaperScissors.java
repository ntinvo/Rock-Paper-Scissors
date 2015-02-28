/**
		Tin Vo
 **/

import java.util.Scanner;

public class RockPaperScissors 
{    
    public static void main(String[] args)   
    {   
        Scanner console = new Scanner(System.in);
        Player comp = new Player();      
        comptMove(comp); 
        round(console,comptMove(comp),comp);
    }
        
     public static void round(Scanner console,String computerChoice, RandomPlayer comp)
    {
        int playerScore=0,computerScore=0,draw=0;
            
        System.out.print("Welcome to Rock Paper Scissors. I, Computer, will be your opponent.\nPlease type in your name and press return: ");
        String name = console.nextLine();
        System.out.print("Welcome " + name + ".\nAll right " + name + ". How many rounds would you like to play? \nEnter the number of rounds you want to play and press return: ");
        int round = console.nextInt();
        System.out.println();
                
        for (int i=1; i<=round; i++)
        {   
            computerChoice=comptMove(comp);                                             //This is calling computer's Choice
            
            System.out.println("Round " +i);                                            //This is getting player's choice                                                       
            System.out.println(name + ", please enter your choice for this round.");
            System.out.print("1 for rock, 2 for paper, and 3 for scissors: ");
            int Choice = console.nextInt();
            String playerChoice;
            
            if (Choice == 1)
            {
                playerChoice = "rock";
            }
            
            else if (Choice == 2)
            {
                playerChoice = "paper";
            }
            else        
            {
                playerChoice = "scissors";
            }
                
            if(playerChoice == computerChoice)                                                                        //Rounds                  
            {
                System.out.println("Computer picked " + computerChoice+", " + name + " picked " + playerChoice+".");
                System.out.println();
                System.out.println("This round is draw.");
                draw++;    
            }                   
            else if (playerChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) 
            {
                System.out.println("Computer picked " + computerChoice+", " + name + " picked " + playerChoice+".");
                System.out.println();
                System.out.println("Paper cover Rock. You win.");
                playerScore++;
            }
            else if (playerChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper"))
           {
                System.out.println("Computer picked " + computerChoice+", " + name + " picked " + playerChoice+".");
                System.out.println();
                System.out.println("Scissors cut paper. You win.");
                playerScore++;
            }
            else if (playerChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors"))
            {
                System.out.println("Computer picked " + computerChoice+", " + name + " picked " + playerChoice+".");
                System.out.println();
                System.out.println("Rock breaks Scissors. You win.");
                playerScore++;
            }
            else if (playerChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("rock"))
            {
                System.out.println("Computer picked " + computerChoice+", " + name + " picked " + playerChoice+".");
                System.out.println();
                System.out.println("Rock breaks Scissors. I win.");
                computerScore++;
            }
            else if (playerChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("paper"))
            {
                System.out.println("Computer picked " + computerChoice+", " + name + " picked " + playerChoice+".");
                System.out.println();
                System.out.println("Paper covers Rock. I win.");
                computerScore++;
            }
            else
            {
                System.out.println("Computer picked " + computerChoice+", " + name + " picked " + playerChoice+".");
                System.out.println();
                System.out.println("Scissors cut Paper. I win.");
                computerScore++;
            }               
            System.out.println();
            System.out.println();
        }
            
        result(round,computerScore,playerScore,draw, name);                                                             //This is calling the result
    }
      
    public static String comptMove(RandomPlayer comp)                                                                   //This is getting the computer's choice
    {
        String computerChoice;
        int compChoice = comp.play(); 
       
        if(compChoice == 1)
        {
            computerChoice = "rock";
        }
        else if (compChoice == 2)
        {
            computerChoice = "paper";
        }
        else
        {
            computerChoice = "scissors";
        }
        return computerChoice;           
    }
        
    public static void result(int round, int computerScore, int playerScore, int draw, String name)                     //This is getting the result
    {
        System.out.println("Number of games of Rock Paper Scissors: " + round);
        System.out.println("Number of times Computer won: " + computerScore);
        System.out.println("Number of times " + name + " won : " + playerScore);
        System.out.println("Number of draws: " + draw);
        if (computerScore > playerScore)
        {
            System.out.println("I, Computer, am a master at Rock, Paper, Scissors.");
        }
        else if (computerScore < playerScore)       
        {
            System.out.println("You are a master at Rock, Paper, Scissors."); 
        }
        else
        {
            System.out.println("We are evenly matched at this game.");
        }
    }
}