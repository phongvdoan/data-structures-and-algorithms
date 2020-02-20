package code401challenges.hashtable;

public class Hashtable <E> {

    int size;
    Node<String>[] hashArr;

    public Hashtable(int size) {
        this.size = size;
        this.hashArr= new Node[size];
    }

    public void add(String key, E value) {

        int position = hash(key);

        if (this.hashArr[position] == null) {
            this.hashArr[position] = new Node(key,value,null);
        }
        Node<String> currentNode = this.hashArr[position];
        while(currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }
        currentNode.nextNode = new Node(key, value, null);


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

        if(this.hashArr[position] == null){
            return null;
        }
        Node<String> currentList = this.hashArr[position];
        while(!currentList.key.contains(key)) {
            currentList = currentList.nextNode;
        }
        return currentList.value;

    }

    public Boolean contains(String key) {
        int position = hash(key);
        if(this.hashArr[position] != null) {
            if (this.hashArr[position].key.contains(key)) {
                return true;
            }
        }

        Node<String> currentList = this.hashArr[position];
        while(currentList != null){
            if(currentList.key.contains(key)){
                return true;
            }
            currentList = currentList.nextNode;
        }
        return false;

    }
}
