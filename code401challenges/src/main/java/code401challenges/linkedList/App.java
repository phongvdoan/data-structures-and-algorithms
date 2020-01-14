package code401challenges.linkedList;

import code401challenges.InvalidInputException;

public class App {
    public static void main(String[] args) throws InvalidInputException {
        LinkedList mylist = new LinkedList();
        mylist.insert(5);
        mylist.insert(6);
        mylist.insert(23);
        
        String results = mylist.toString();
        System.out.println("results = " + results);

        Boolean resultInclude = mylist.includes(10);
        System.out.println("resultInclude = " + resultInclude);

    }
}
