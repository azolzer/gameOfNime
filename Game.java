import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private boolean playAgain;


public Game(){
player1 = new Player();
player2 = new Player();
playAgain = true;

}

public void play() {
    //running until saying to not play again
    while(playAgain == true)
    {
        //figuring out who is player one and who is player two
        Player starterPlayer;
        int currentPlayer = (int)(Math.random() + 1);
        if (currentPlayer == 1) 
        {
            starterPlayer = player1;
        } 
        else
        {
            starterPlayer = player2;
        }
        Scanner sc = new Scanner(System.in);
        // plays game until game ends
        while (Board.getNumPieces() > 1) 
        {
            
            System.out.println("There are " + Board.getNumPieces() + " in this round.");
            // checks if user input is valid
            System.out.println(starterPlayer.getName() + " How many pieces would you like to remove?");
                int num = sc.nextInt();
                
            while (num < 1 || num > Board.getNumPieces() / 2) 
            {
                System.out.println(starterPlayer.getName() + " How many pieces would you like to remove?");
                num = sc.nextInt();
            }
            Board.removePieces(num);
            // switch players
            if (currentPlayer == 1) 
            {
                currentPlayer = 2;
                starterPlayer = player2;
            } 
            else 
            {
                currentPlayer = 1;
                starterPlayer = player1;
            }
                
        } //end of while loop >1

        // increases the score
        if (currentPlayer == 1){ 
            player1.increaseScore();
        } else {
            player2.increaseScore();
        }
        System.out.println(starterPlayer.getName() + " has won the game! Congrats!");
        System.out.println(player1.getName() + " points: " + player1.getScore());
        System.out.println(player2.getName() + " points: " + player2.getScore());

        System.out.println("You want to play again, true or false");
            playAgain = sc.nextBoolean();

        if (playAgain == true){
        Board.populate();
        } else {
        playAgain = false; }
    } //end of playAgain while loop
} //end of play method
} //end of Game class
