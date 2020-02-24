package code401challenges.RepeatedWord;

import code401challenges.hashtable.Hashtable;

public class RepeatedWord {

    public static String firstRepeatedWord(String lengthyString){
        String[] stringArr = lengthyString.split(",?\\s* ");
        Hashtable<String> stringHashTable = new Hashtable<>(stringArr.length);

        for(String initialWord : stringArr){
            String word = initialWord.toLowerCase();
            if(stringHashTable.contains(word)){
                return word;
            }
            stringHashTable.add(word, word);
        }
        return null;
    }

}
