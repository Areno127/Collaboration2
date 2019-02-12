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
    private String[] wordArr = {"apple", "dragon",       "word",    "fun",      "run",    "winning",       "yeet",      "pickle",       "rick",          "ron",       "swonson",  "fruit",     "bannana", "papaya"};
    private String[] hintArr = {"fruit", "mythical creature", "___ game", "having ___", "exercise", "oppisite of losing", "dead meme", "rick was  a ___", "___ was  a pickle", "___ swonson", "ron ____",  "apple is a", "is a fruit", "another type of meme fruit"};

    public int getnum() {
        Random rand = new Random();
        return rand.nextInt(wordArr.length);
    }

    public String getWord(int num) {
        return wordArr[num];
    }

    public String getHint(int num) {
        return hintArr[num];
    }
    
    
}
