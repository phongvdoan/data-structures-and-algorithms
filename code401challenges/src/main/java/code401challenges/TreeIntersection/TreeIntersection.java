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

        for(int i = 0; i < firstTreeArr.length; i++) {
            String conversion = firstTreeArr[i].toString();
            integerHashtable.add(conversion, 0);
        }
        for(int i = 0; i < secTreeArr.length; i++) {
            String valToLookFor = secTreeArr[i].toString();
            if(integerHashtable.contains(valToLookFor)){
                resultArr.add(secTreeArr[i]);
            }

        }
        return  resultArr.toArray(new Integer[resultArr.size()]);
    }


}
