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

    public void enqueueTwo(E value) {
        stackOne.push(value);
    }

    public E dequeue(){
        if(stackOne.isEmpty()){
            throw new NoSuchElementException();
        }
        return stackOne.pop();
    }

    public E dequeueTwo() {
        if(stackOne.isEmpty() && stackTwo.isEmpty()) {
            throw new NoSuchElementException();
        }
        if( stackTwo.isEmpty()){
            while(!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
        }
        return stackTwo.pop();
    }

    public String toString() {
        StringJoiner result = new StringJoiner(" } -> { ", "{ ", " }");
        Stack<E> stringStack = stackOne;
        while(stringStack.top != null){
            result.add(String.valueOf(stringStack.top.value));
            stringStack.top = stringStack.top.next;

        }
        result.add("NULL");
        return result.toString();
    }
}
