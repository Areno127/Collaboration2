/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerguessgame;

import java.util.Random;

/**
 *
 * @author Owner
 */
public class Words {
    private String[] wordArr = {"apple", "dragon", "word", "fun", "run", "winning", "yeet", "pickle", "rick", "ron", "swonson", "fruit", "bannana", "papaya"};

    public String getWord() {
        Random rand = new Random();
        int randNum = rand.nextInt(wordArr.length);
        return wordArr[randNum];
    }
    
    
}
