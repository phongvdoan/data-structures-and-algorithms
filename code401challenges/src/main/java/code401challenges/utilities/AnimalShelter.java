package code401challenges.utilities;

import code401challenges.stacksandqueues.Queue;

public class AnimalShelter {
    Queue<String> dogQueue;
    Queue<String> catQueue;

    public AnimalShelter() {
        dogQueue = new Queue<>();
        catQueue = new Queue<>();
    }

    public void enqueue(String animal) {
        animal = animal.toLowerCase();

        if (animal.equals("cat")){
            this.catQueue.enqueue(animal);
        } else if (animal.equals("dog")){
            this.dogQueue.enqueue(animal);
        } else {
            throw new IllegalArgumentException("Choices: Cat or Dog");
        }
    }

    public String dequeue(String pref){
        pref = pref.toLowerCase();

        if (pref.equals("dog")){
            if(!dogQueue.isEmpty()) {
                 return dogQueue.dequeue();
            }
        }
        if (pref.equals("cat")){
            if(!catQueue.isEmpty()) {
                return catQueue.dequeue();
            }
        }
        System.out.println("You did not choose a cat or dog.");
        return null;
    }
}
