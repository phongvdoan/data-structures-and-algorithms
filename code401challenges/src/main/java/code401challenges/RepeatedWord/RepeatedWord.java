package code401challenges.RepeatedWord;

import code401challenges.hashtable.Hashtable;

import java.lang.reflect.Array;

public class RepeatedWord {

    public static String firstRepeatedWord(String lengthyString){
        String[] stringArr = lengthyString.split(",?\\s* ");
        Hashtable stringHashTable = new Hashtable(stringArr.length);

        for(String initialWord : stringArr){
            String word = initialWord.toLowerCase();
            if(!stringHashTable.contains(word)){
                stringHashTable.add(word, word);
            } else if(stringHashTable.contains(word)){
                return word;
            }

        }
        return null;
    }
}
