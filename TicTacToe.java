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
public class TicTacToe {

    final static int BOARDSIZE = 4;

    public static int[][] board = new int[BOARDSIZE][BOARDSIZE];
    /**
     * The status. In the matrix, -1 is used to mark a empty position
     */
    public final static int cellStatus = -1;

    public static char[][] cells
            = {{'1', '2', '3', '4'},
            {'5', '6', '7', '8'},
            {'9', 'a', 'b', 'c'},
            {'d', 'e', 'f', 'g'}};

/**
 * 
 * @throws RuntimeException 
 */
    public static void printBoard() throws RuntimeException {

        for (int i = 0; i < BOARDSIZE; i++) {
            for (int j = 0; j < BOARDSIZE; j++) {
                board[i][j] = cellStatus;
            }
        }
        for (int i = 0; i < BOARDSIZE; i++) {
            for (int j = 0; j < BOARDSIZE; j++) {
                System.out.print(cells[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

    }
/**
 * 
 * @param flag 
 */
    public static void input(boolean flag) {

        Scanner keyboard = new Scanner(System.in);
        String player;
        while (true) {
            if (flag == true) {
                player = "Player 1";
            } else {
                player = "Player 2";
            }
            System.out.println(player + ", make your move: " + "\n=>");
            String input = keyboard.nextLine();
            input = input.trim();// remove any extra whitespace from sides
            char inputC = input.charAt(0);
            if (input.length() != 1) {
                System.out.println("Incorrect length: " + input + " Try again!!!\n");
                break;
            }
            if (inputC=='x'||inputC=='0') {
                System.out.println("Already taken! Try again!!!\n");
                break;
            }
            
            if (inputC == '1' || inputC == '2' || inputC == '3'
                    || inputC == '4' || inputC == '5' || inputC == '6' || inputC == '7'
                    || inputC == '8' || inputC == '9' || inputC == 'a' || inputC == 'b'
                    || inputC == 'c' || inputC == 'd' || inputC == 'e' || inputC == 'f'
                    || inputC == 'j') {
                for (int row = 0; row < cells.length; row++) {
                    for (int col = 0; col < cells[row].length; col++) {
                        if (cells[row][col] == inputC) {
                            char marker;
                            if (flag == true) {
                                marker = 'x';
                                cells[row][col] = marker;
                            } else {
                                marker = '0';
                                cells[row][col] = marker;
                            }
                        }
                    }
                }
                break;
            } else {
                throw new IllegalArgumentException("Incorrect enter\n");
            }
        }

    }
/**
 * 
 * @param n
 * @return
 * @throws RuntimeException 
 */
    static boolean analyzeBoard(int n) throws RuntimeException{
        return true;
    }
/**
 * 
 * @return
 * @throws RuntimeException 
 */
    public boolean done() throws RuntimeException{
        return true;
    }
/**
 * 
 * @throws RuntimeException 
 */
    public static void whoWon() throws RuntimeException{
    }
}
