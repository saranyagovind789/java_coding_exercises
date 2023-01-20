package com.techreturners.exercise005;

import java.util.HashSet;

public class Exercise005 {

    public boolean isPangram(String input) {
        //throw new UnsupportedOperationException("You can delete this statement and add your code here.");
        HashSet<Character> allAlphabets = new HashSet<>();
        input = input.replaceAll("[-+_ ! #$&0-9]*", "").toLowerCase();
        for(int i =0; i < input.length(); i++){
            char inputCharacter = input.charAt(i);
            allAlphabets.add(inputCharacter);
            if(allAlphabets.size() == 26){
                return true;
            }
        }
        return false;
    }

}
