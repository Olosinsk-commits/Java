
package tictactoegame;

/**
 *
 * @author olga.osinskaya
 */
public class TicTacToeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe game\n");
        TicTacToe game = new TicTacToe();//Create an object of class TicTacToe
        //In a loop a game start playing 
        //calling printBoard(),input(),analyzeBoard()until done() returns true.
        while (!game.done()) {

            game.printBoard();//print board 
            game.input();//call input 
            game.analyzeBoard();// call analyzeBoard
        }
        //display board for the last time and announce who is the winner.
        System.out.println("Winner is " + game.whoWon());
    }

}
