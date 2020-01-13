package code401challenges;

//https://alvinalexander.com/java/java-custom-exception-create-throw-exception

public class InvalidInputException extends Exception {
    public InvalidInputException(String message){
//        https://www.geeksforgeeks.org/super-keyword/
        super(message);
    }
}
