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
        int num = word.getnum();
        int incorectCounter = 0;
        String newWord = word.getWord(num);
        String hint = word.getHint(num);
        String newGame = "N";
        boolean won = false;
        
        System.out.println("guess the word it has " + newWord.length() + " letters");
        while(!won){
            String guess = k.nextLine();
            if(guess.equalsIgnoreCase(newWord)){
                System.out.println("you win!\nthe word was " + newWord);
                won = true;
                System.out.println("would you like to play agian y for yes n for no");
                newGame = k.nextLine();
            }
            else{
                System.out.println("guess agian the word still has " + newWord.length() + " letters");
                incorectCounter+=1;
                if(incorectCounter>10){
                    incorectCounter = 0;
                    System.out.println("would you like to play agian y for yes n for no");
                    newGame = k.nextLine();
                }
                else if(incorectCounter >= 3){
                    System.out.println("hint: " + hint);
                }
            }
            if(newGame.equalsIgnoreCase("y")){
                    incorectCounter = 0;
                    won = false;
                    num = word.getnum();
                    newWord = word.getWord(num);
                    hint = word.getWord(num);
                    System.out.println("guess the word it has " + newWord.length() + " letters");
                }
            
        }
        
    }
    
}
