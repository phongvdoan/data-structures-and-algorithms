# Challenge Summary
[Code](/code401challenges/src/main/java/code401challenges/tree/Tree.java)
<!-- Short summary or background information -->
Breadth First traversal that return a list in order.
## Challenge Description
<!-- Description of the challenge -->

Write a breadth first traversal method which takes a Binary Tree as its unique input. Without utilizing any of the built-in methods available to your language, traverse the input tree using a Breadth-first approach, and return a list of the values in the tree in the order they were encountered.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I utilized the Queue class that I created and initially added the first element from the Tree into the Queue. Then I iterated over the Queue.
During the iteration the first element in the Queue is added to the Array and then the right Node and the left Node is added to the Queue if null.
The Big O is O(n) for time and O(n) for space
## Solution
<!-- Embedded whiteboard image -->
![](../assets/breadth-first.jpg)