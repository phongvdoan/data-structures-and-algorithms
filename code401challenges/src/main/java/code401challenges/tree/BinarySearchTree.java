package code401challenges.tree;

public class BinarySearchTree extends Tree {

    public void add(int value){
        root = add(root, value);
    }

    private Node add(Node node, int value) {
        if( node == null){
            return new Node(value);

        }
        if (value < node.value){
            node.leftNode = add(node.leftNode, value);
        } else if ( value > node.value){
            node.rightNode = add(node.rightNode, value);
        }
        return node;
    }

    public boolean contains(int value){
        return contains(root,value);
    }

    private boolean contains(Node node, int value){
        if(node == null){
            return false;
        }
        if(node.value == value){
            return true;
        }
        if(value > node.value){
            contains(node.rightNode, value);
        } else if(value < node.value){
            contains(node.leftNode, value);
        }
        return false;
    }

}
