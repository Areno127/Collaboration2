/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerguessgame;

import java.util.Random;
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
        int num;
        String[] sixPass = new String[6];
        String[] sixHint = new String[6];
        for(int i = 0; i < sixPass.length; i++){
            // IM HERE THIS IS THE 6 NUMBER GENERATED ARRAY
            num = word.getnum();
            sixPass[i] = word.getWord(num);
            sixHint[i] = word.getWord(num);
        }
        num = randomInt();
        int incorectCounter = 0;
        String newWord = sixPass[num];
        String hint = sixHint[num];
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
                if(incorectCounter > 10){
                    System.out.println("You have failed. The word was " + newWord);
                    System.out.println("would you like to play agian y for yes n for no");
                    newGame = k.nextLine();
                    won = true;
                }
                else if(incorectCounter >= 3){
                    System.out.println("hint: " + hint);
                }
            }
            if(newGame.equalsIgnoreCase("y")){
                    incorectCounter = 0;
                    won = false;
                    num = randomInt();
                    newWord = sixPass[num];
                    hint = sixHint[num];
                    System.out.println("guess the word it has " + newWord.length() + " letters");
                }
            
        }
        
    }
    public static int randomInt(){
        Random rand = new Random();
        return rand.nextInt(6);
    }
    
}
