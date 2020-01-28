package code401challenges.utilities;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {
        LinkedList<Character> openingBrackets = new LinkedList<>();
        if(input == "" || input == null) {
            throw new IllegalArgumentException();
        }

        for(int i = 0; i< input.length(); i++){
            char character = input.charAt(i);
            System.out.println(character);
            if (character == '{' || character == '[' || character == '(' ) {
                System.out.println("character = " + character);
                openingBrackets.addFirst(character);
            } else if (character == '}' && openingBrackets.isEmpty()
                    || character == ']' && openingBrackets.isEmpty()
                    || character == ')' &&  openingBrackets.isEmpty() ){
                return false;
            } else if (character == '}' && openingBrackets.peekFirst() == '{'
                    || character == ']' && openingBrackets.peekFirst() == '['
                    || character == ')' &&  openingBrackets.peekFirst() == '(' ) {

                System.out.println(openingBrackets.pollFirst());

            }
        }
        return openingBrackets.isEmpty();
    }
//Romell's Idea, not going to work with the task
    public static boolean multiBracketValidationTw(String input) {
        int counter = 0;
        if(input == "" || input == null) {
            throw new IllegalArgumentException();
        }

        for(int i = 0; i< input.length(); i++){
            char character = input.charAt(i);
            if (character == '{' || character == '[' || character == '(' ) {
                counter += 1;
            } else if (character == '}' || character == ']' || character == ')' ) {
                counter += -1;
            }
        }
        System.out.println(counter);
        return counter == 0;
    }
}
