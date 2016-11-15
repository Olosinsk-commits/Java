/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;



/**
 *
 * @author olga
 */
public class TicTacToeGame {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome to TicTacToe game\n");
        int x = 0;
        TicTacToe.printBoard();
        while(x<2){
        TicTacToe.input(true); 
        TicTacToe.input(false);
        //TicTacToe.input(); 
        TicTacToe.printBoard();
        // TODO code application logic here
        x++;
        }

        
        //System.out.println("Winner is: ");
        
        
    }
    
}
