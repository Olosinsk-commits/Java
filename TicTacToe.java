/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

import java.util.Scanner;

/**
 *
 * @author olga
 */
public class TicTacToe {

    /**
     * The board.
     */
    final static int boardSize = 4;
    /**
     * The Constant boardSize.
     */
    public static int[][] board = new int[boardSize][boardSize];
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
     * Prints the board.
     */
    public static void printBoard() {

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = cellStatus;
            }
        }
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(cells[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

    }

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
            char inputC = input.charAt(0);
            //String input = keybord.next().trim().charAt(0);
            if (input.length() > 1) {
                System.out.println("Incorrect length: " + input + " Try again!!!");
                break;

            }

            if (inputC == 'x' || inputC == 'o' || inputC != '1' && inputC != '2' && inputC != '3'
                    && inputC != '4' && inputC != '5' && inputC != '6' && inputC != '7'
                    && inputC != '8' && inputC != '9' && inputC != 'a' && inputC != 'b'
                    && inputC != 'c' && inputC != 'd' && inputC != 'e' && inputC != 'f'
                    && inputC != 'j') {

                System.out.println("Your enetred: " + input + " Incorect enter! Try again!!!");
                break;
            }

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
        }
    }

    public boolean analyzeBoard() {
        return true;
    }

    public boolean done() {
        return true;
    }

    public static void whoWon() {
    }
}
