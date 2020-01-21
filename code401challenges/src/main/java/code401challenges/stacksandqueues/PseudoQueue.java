package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class PseudoQueue <E> {
    Stack <E> stackOne = new Stack<>();
    Stack <E> stackTwo = new Stack<>();

//    public PseudoQueue() {
//        this.stackOne = null;
//        this.stackTwo = null;
//    }

    public void enqueue(E value){
         while (!stackOne.isEmpty()){
             stackTwo.push(stackOne.pop());
         }
         stackOne.push(value);
         while(!stackTwo.isEmpty()){
             stackOne.push(stackTwo.pop());
         }
    }

    public E dequeue(){
        if(stackOne.isEmpty()){
            throw new NoSuchElementException();
        }
        return stackOne.pop();
    }

    public String toString() {
        StringJoiner result = new StringJoiner(" } -> { ", "{ ", " }");
        while(stackOne.top != null){
            result.add(String.valueOf(stackOne.top.value));
            stackOne.top = stackOne.top.next;

        }
        result.add("NULL");
        return result.toString();
    }
}
