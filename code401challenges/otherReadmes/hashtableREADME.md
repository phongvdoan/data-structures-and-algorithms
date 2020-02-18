# Stacks and Queues
<!-- Short summary or background information -->
[Code](/code401challenges/src/main/java/code401challenges/hashtable/HashTable.java)

Create a Hashtable that has a size and stores data within.
## Challenge
<!-- Description of the challenge -->

Implement a Hashtable with the following methods:

add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
get: takes in the key and returns the value from the table.
contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
hash: takes in an arbitrary key and returns an index in the collection.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
For hash, it takes in the key as a String and adds each character's ASCII values then multiplies by a prime number and returns the remainder from dividing by the size of the array. The BigO for time is O(n) for the size of the key and space of O(1).
For add, it takes in the key and value. Finds the hash value of the key and stores the key and value pairs within the array. The BigO for time is O(1) and space is O(1).
For gets, it takes in a key, and finds the position within the array using the hash value and then iterates over the linkedlist to find the value stores. The BigO for time is O(n) since it iterates over the linkedlist and for space is O(1).
For contains, it checks to see if the position of the array of the hash value of the key is null or not null. The BigO for time is O(1) and for space is O(1). 
 
## API
<!-- Description of each method publicly available to your hashtable-->

### HashTable

add(String key, E value) - takes the key and hashes it. Then it goes to the position of the array at the hash value. It appends the key value pair within the LinkedList.

gets(String key) - finds the position of the array using the hash value of the key. Then it finds the node that contains the key and outputs the value.

contains(String key) -  it checks to see if the position of the array of the hash value of the key is null or not null.