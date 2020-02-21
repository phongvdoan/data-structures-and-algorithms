# Challenge Summary
<!-- Short summary or background information -->
[Code](/code401challenges/src/main/java/code401challenges/RepeatedWord/RepeatedWord.java)

Find the first word that is repeated within a sentence.
## Challenge Description
<!-- Description of the challenge -->

Write a function that accepts a lengthy string parameter.
Without utilizing any of the built-in library methods available to your language, return the first word to occur more than once in that provided string.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

I split the long string into a string array with each word in an index. Then I iterated using a foreach loop to check to see if it is contained in a hastable, if it is not then the word is placed in the hashtable as a key. If it finds it again then the word is returned. The BigO of time is O(n) and space is O(n).
## Solution
<!-- Embedded whiteboard image -->
![](../assets/repeatedWord.jpg)
