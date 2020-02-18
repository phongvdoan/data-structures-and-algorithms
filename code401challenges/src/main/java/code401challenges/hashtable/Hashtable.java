package code401challenges.hashtable;


import code401challenges.linkedList.LinkedList;

import java.util.List;

public class Hashtable <E> {

    int size;
    LinkedList<String>[] hashtable;

    public Hashtable(int size) {
        this.size = size;
        this.hashtable= new LinkedList[size];
    }

    public void add(String key, E value) {

        int position = hash(key);

        if (this.hashtable[position] == null) {
            this.hashtable[position] = new LinkedList<>();
        }

        this.hashtable[position].append((key+ ": " + value));


    }

    public int hash(String key) {
        int totalSum = 0;
        for(int i = 0; i < key.length(); i ++){
            totalSum += key.codePointAt(i);
        }

        return totalSum * 599 % this.size;
    }

    public String get(String key){

        int position = hash(key);

        if(this.hashtable[position] == null){
            return null;
        }
        LinkedList<String> currentList = this.hashtable[position];
        while(!currentList.head.value.contains(key)) {
            currentList.head = currentList.head.next;
        }
        String valueOfNode = currentList.head.value;
        String result = valueOfNode.substring(valueOfNode.indexOf(" ")).trim();

        return result;

    }

    public Boolean contains(String key) {
        int position = hash(key);
        if(this.hashtable[position] == null){
            return false;
        } else {
            return true;
        }
    }
}
