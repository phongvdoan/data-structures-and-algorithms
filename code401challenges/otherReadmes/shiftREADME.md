# Challenge Summary
<!-- Short summary or background information -->
[Code](../src/main/java/code401challenges/ArrayShift.java)

Insert a number in the middle of a array
## Challenge Description
<!-- Description of the challenge -->
Write a function called insertShiftArray which takes in an array and the value to be added. Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Created a new array with a length of the input array + 1. And then iterated over the length of the new array. If the the current index is less than half of the length, the new values would be from the input array with the same index. if the current index is the same as half the length then the new value will be inserted. And if the current index is greater than half the length then then the data from the input array with index - 1.

## Solution
<!-- Embedded whiteboard image -->
![](/assets/array-shift.jpg)