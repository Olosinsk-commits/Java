/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        boolean b = false;

        System.out.println("Welcome to TicTacToe game\n");
        do {
            
            TicTacToe.printBoard();//print board    
            try {           
                TicTacToe.input(true);
                TicTacToe.printBoard();
                TicTacToe.input(false);
            } catch (Exception e) // handle the exception below
            {
                System.out.print(e.getMessage());
            }
            b = true;//analyzeBoard=true
        } while (b);
    }

}
