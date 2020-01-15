# Singly Linked List
<!-- Short summary or background information -->
[Code](/code401challenges/src/main/java/code401challenges/linkedList/LinkedList.java)

Create Linked List Class that can be accessed and instantiation with the first null value.

## Challenge
<!-- Description of the challenge -->
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.
Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
Define a method called toString (or __str__ in Python) which takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL"
Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I created a Node class for each node with the properties of value and the next node location. Then in the bigger picture class aka the LinkedList class, I initialized with a value of null for the head in an empty LinkedList. Then the insert had to be O(1) so I would have to add nodes to the beginning since the head was the reference. For includes method I would have to iterate over the linkedList and look for the certain value. For the toString method, just iterate over the list and concatenate on the result String.
## API
<!-- Description of each method publicly available to your Linked List -->
`linkedList.insert(Integer value);`

Then the insert had to be O(1) so I would have to add nodes to the beginning since the head was the reference. 

`linkedList.includes(Integer value);`

For includes method I would have to iterate over the linkedList and look for the certain value. 

`linkedList.toString();`

For the toString method, just iterate over the list and concatenate on the result String.