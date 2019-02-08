/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerguessgame;

import java.util.Scanner;

/**
 *
 * @author sethd
 */
public class ComputerGuessGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Words word = new Words();
        String newWord = word.getWord();
        boolean won = false;
        System.out.println("guess the word it has " + newWord.length() + " letters");
        while(!won){
            String guess = k.nextLine();
            if(guess.equalsIgnoreCase(newWord)){
                System.out.println("you win!\nthe word was " + newWord);
                won = true;
                System.out.println("would you like to play agian y for yes n for no");
                if(k.nextLine().equalsIgnoreCase("y")){
                    won = false;
                    newWord = word.getWord();
                    System.out.println("guess the word it has " + newWord.length() + " letters");
                }
            }
            else{
                System.out.println("guess agian the word still has " + newWord.length() + " letters");
            }
            
        }
        
    }
    
}
