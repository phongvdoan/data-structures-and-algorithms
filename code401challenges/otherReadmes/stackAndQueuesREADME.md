# Stacks and Queues
<!-- Short summary or background information -->
[Code](/code401challenges/src/main/java/code401challenges/stacksandqueues/Stack.java)

Create a Node class, Stack class, and Queue class.
## Challenge
<!-- Description of the challenge -->

Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
Create a Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.
Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
Define a method called isEmpty that does not take an argument, and returns a boolean indicating whether or not the stack is empty.
Create a Queue class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to front when the queue is created.
Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
Define a method called isEmpty that does not take an argument, and returns a boolean indicating whether or not the queue is empty.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
 For the push, I viewed it as a LinkedList with inserts as the first value, so that I can take the head value out using pop(). For enqueue, it is like the LinkedList append where it inserts at the end so I can dequeue the first value that was inserted.

## API
<!-- Description of each method publicly available to your Stack and Queue-->

### Stack

push(Int value) - passes a value and inserts it at the top of stack

pop() - grabs the top value and returns it

peek() - looks at the top value

isEmpty()- returns true if stack is empty and false if it is not empty

### Queues

enqueue(int value) - passes a value and inserts it to the end of the queue

dequeue() - grabs the front value and returns it

peek() - looks at the front value

isEmpty() - returns true if queue is empty and false if it is not empty