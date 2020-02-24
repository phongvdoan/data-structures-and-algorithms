package code401challenges.TreeIntersection;

import code401challenges.hashtable.Hashtable;
import code401challenges.tree.Tree;

import java.util.ArrayList;

public class TreeIntersection {

    public static Integer[] tree_intersection(Tree<Integer> firstTree, Tree<Integer> secondTree){
        Integer[] firstTreeArr = firstTree.preOrder();
        Integer[] secTreeArr = secondTree.preOrder();
        Hashtable<Integer> integerHashtable = new Hashtable<>(firstTreeArr.length);
        ArrayList<Integer> resultArr = new ArrayList<>();

        for (Integer integer : firstTreeArr) {
            String conversion = integer.toString();
            integerHashtable.add(conversion, 0);
        }
        for (Integer integer : secTreeArr) {
            String valToLookFor = integer.toString();
            if (integerHashtable.contains(valToLookFor)) {
                resultArr.add(integer);
            }

        }
        return  resultArr.toArray(new Integer[0]);
    }


}
