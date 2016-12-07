/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

import java.util.Scanner;

/**
 *
 * @author olga.osinskaya
 */
//The class TicTacToe is handling user input/output and the
//logistics of the game.
public class TicTacToe {

    final static int BOARDSIZE = 4;// stores size of the array 
    final static int HOWMANYWINS = 3;//

    private boolean status = false;//Boolean status stores game status. There are 2 possibilities here – either still playing
    //or done (game came to an end, someone won)
    private char winner = 'T';//stores the info about winning/losing the game. There are 3 possible
//states here: X won, O won, tie
    private char whoseTurn = 'X';//stores who’s turn it is to play now

    private final static char[] codes = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g'};

    private char[][] board = new char[BOARDSIZE][BOARDSIZE];
    //The board a private two-dimensional array of size 4x4. The board is storing
    //characters. Initial look of the board is the following

    //constructor. Initilization of board 
    public TicTacToe() {
        for (int i = 0; i < BOARDSIZE; i++) {
            for (int j = 0; j < BOARDSIZE; j++) {
                board[i][j] = codes[i * BOARDSIZE + j];
            }
        }
    }

    /**
     * The metho printBoards prints the current board
     *
     * @throws RuntimeException
     */
    public void printBoard() throws RuntimeException {
        for (int i = 0; i < BOARDSIZE; i++) {
            for (int j = 0; j < BOARDSIZE; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * The input method provides the prompt and gathers input from the user. It
     * must prompt the correct player, who’s turn it is now to play, display the
     * board.
     */
    public void input() {

        Scanner keyboard = new Scanner(System.in);
        String player;
        //taking care of changing the value of field that tracks
//whose turn it is to play
        if (whoseTurn == 'X') {
            player = "Player 1";

        } else {
            player = "Player 2";

        }
        //Input validation
        while (true) {

            System.out.println(player + ", make your move: " + "\n=>");
            String input = keyboard.nextLine();
            input = input.trim();// remove any extra whitespace from sides
            if (input.length() > 1 || input.length() == 0) {
                System.out.println("Incorrect length: " + input + " Try again!!!\n");
                continue;
            }
            char inputC = input.charAt(0);

            int pos = 0;
            for (; pos < codes.length; pos++) {
                if (codes[pos] == inputC) {
                    break;
                }
            }

            if (pos == codes.length) {
                // symbol not found in alphabet, retry
                System.out.println("Incorrect symbol: " + inputC + " Try again!!!\n");
                continue;
            }

            int i = pos / BOARDSIZE;
            int j = pos % BOARDSIZE;

            if (board[i][j] == 'X' || board[i][j] == 'O') {
                System.out.println("Already taken! Try again!!!\n");
                continue;
            }

            board[i][j] = whoseTurn;
            whoseTurn = whoseTurn == 'X' ? 'O' : 'X';
            break;
        }

    }

    /**
     * The method analyzeBoard() – analyzes the current board and determines if
     * there is a winning position present or if it is a tie. If the state of
     * the game changes, the member variable that is tracking the game state
     * must be changing value, and the info about the winner must be recorded in
     * the field that stores that data.
     *
     * true - win position false - tie
     */
    public void analyzeBoard() {
        boolean freeCell = false;
        for (int i = 0; i < BOARDSIZE; i++) {
            for (int j = 0; j < BOARDSIZE; j++) {
                char c = board[i][j];
                if (c != 'X' && c != 'O') {
                    freeCell = true;
                    continue;
                }

                // go in 8 directions
                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        if (x == 0 && y == 0) { // not moving anywhere
                            continue;
                        }

                        int k = 1;
                        for (; k < HOWMANYWINS; k++) {
                            int i1 = i + x * k;
                            int j1 = j + y * k;
                            if (i1 < 0 || j1 < 0 || i1 >= BOARDSIZE || j1 >= BOARDSIZE || board[i1][j1] != c) {
                                break;
                            }
                        }

                        // loop was not interrupted = HOWMANYWINS chars in a row
                        if (k == HOWMANYWINS) {
                            status = true;
                            winner = c;
                            return;
                        }
                    }
                }
            }
        }

        // no more moves, end the game with a tie
        if (!freeCell) {
            status = true;
            winner = 'T';
        }
    }

    /**
     * The done method is an accessor for status field.
     *
     * @return true if the game came to the end.
     */
    public boolean done() {
        return status;
    }

    /**
     *
     * @return returns a character (X, O or T – for tie), a value of the winner
     * field
     */
    public char whoWon() {
        return winner;
    }

}
