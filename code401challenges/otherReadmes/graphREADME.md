# Graphs
<!-- Short summary or background information -->
[Code](/code401challenges/src/main/java/code401challenges/graph/Graph.java)

a non-linear data structure that can be looked at as a collection of vertices (or nodes) potentially connected by line segments named edges
## Challenge
<!-- Description of the challenge -->

Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

AddNode()
Adds a new node to the graph
Takes in the value of that node
Returns the added node

AddEdge()
Adds a new edge between two nodes in the graph
Include the ability to have a “weight”
Takes in the two nodes to be connected by the edge
Both nodes should already be in the Graph

GetNodes()
Returns all of the nodes in the graph as a collection (set, list, or similar)

GetNeighbors()
Returns a collection of nodes connected to the given node
Takes in a given node
Include the weight of the connection in the returned collection

Size()
Returns the total number of nodes in the graph
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
addNode : it just adds a new node given the value and adds it to the Graph Arraylist. O(1) insertion and O(n) for space since you are creating a new node in a memory location

addEdge : takes in a toNode and fromNode with a weight. It adds a new edge to the fromNode's list of edges with the toNode and the wieight. O(1) insertion and O(n) for space because a new memory location is added as an edge.

getNodes : just moves the Arraylist of Nodes to a LinkedList. O(n) space because it adds memory for the list and O(1) for time.

getNeighbors : just grabs the edges from an input node and returns the nodes that are connected with the weight. O(1) for grabbing and O(1) for space because its not creating memory.

getSize : returns the size of the ArrayList. O(1) for time and O(1) for space
## API
<!-- Description of each method publicly available in your Graph -->

addNode(E value) - creates a new Node with the value and adds to the Arraylist of the graph.

addEdge(Node toNode, Node fromNode, int weight) - adds the toNode to the edge property of the fromNode and gives the edge a weight.

getNodes() - Gets all the nodes within the the arraylist and adds it to a list to return

getNeighbor(Node node) - gets all the Nodes from the edge list of the node and returns the nodes that is connected to.

getSize() - returns the size of the arraylist