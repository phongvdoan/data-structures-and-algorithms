# Trees
<!-- Short summary or background information -->
[Code](/code401challenges/src/main/java/code401challenges/tree/BinarySearchTree.java)

Create a BinaryTree that can add values and traverse preorder, inorder, and postorder.
## Challenge
<!-- Description of the challenge -->

Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
Create a BinaryTree class
Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
Any exceptions or errors that come from your code should be semantic, capturable errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.

Create a BinarySearchTree class
Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

For the Node, it needed value, leftNode, and rightNode properties. The Tree extends to the BinarySearch tree because the Binary Search Tree is a tree underneath. So the tree class will have the root Node.
for the traversal methods, recursion seems it fits it well with a BigO time of O(N). The adding to the tree is also O(N), but the contains method is O(log(n))
## API
<!-- Description of each method publicly available in each of your trees -->

### Tree

preOrder() - returns an array with the values of the nodes in the order of preorder which is root >> left >> right.

inOrder() - returns an array with the values of the nodes in order of left >> root >> right.

postOrder() - returns an array with the values of the nodes in order of left >> right >> root.

### BinarySearchTree

add(int value) - adds a value to the tree by checking the conditions of either greater(right) or less than(left).

contains(int value) - checks to see if the value is in the tree and returns a boolean.
