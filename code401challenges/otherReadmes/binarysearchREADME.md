# Challenge Summary
<!-- Short summary or background information -->
[Code](/code401challenges/src/main/java/code401challenges/BinarySearch.java)

 A binary search of a element within an array.

## Challenge Description
<!-- Description of the challenge -->
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
We set the right and left integers to the index of the first and last element within the array respectively. Then iterate in a loop to see if the search key is less than, greater than, or equal to the element at the mid point. If it is less than, then the right integer is assigned to the mid point. If it is greater than, then the left integer is assigned to the midpoint. if it is equals, then the midpoint is returned. If not found, then returns -1.

## Solution
<!-- Embedded whiteboard image -->
![](../assets/array-binary-search.jpg)



# Stacks and Queues

## Stack
-	A data structure that consists of nodes where each reference the next but not the previous.
-	Push 
    -	Nodes are added
-	Pop
    -	Nodes that are removed
-	Top
    -	Top of stack
-	Peek
    -	View the top node
-	Is First In Last Out (FILO)
-	Is Last In First Out (LIFO)
-	Pushing is     -(1)
-	Pop is     -(1)
-	Peek is     -(1)

## Queue
-	Enqueue (    -(1))
    -	Nodes that are added
-	Dequeue (    -(1))
    -	Nodes that are removed
-	Front
    -	First node
-	Rear
    -	Last node
-	Peek (    -(1))
    -	View the top node
-	First In First Out (FIFO)
-	Last In Last Out (LILO)

