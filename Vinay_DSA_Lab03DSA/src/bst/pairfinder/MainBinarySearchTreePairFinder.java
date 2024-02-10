package bst.pairfinder;

import binarysearchtree.BinarySearchTree;
import binarysearchtree.SampleBinarySearchTrees;

public class MainBinarySearchTreePairFinder {

    public static void main(String[] args) {

        Integer sum = 130;

        BinarySearchTree tree =
                SampleBinarySearchTrees.sampleBST_01();

        BinarySearchTreePairFinder finder
                = new BinarySearchTreePairFinder(tree, sum);

        Result result = finder.findPair();
        
        if(result.getPairs().isEmpty()){
            System.out.println("Nodes not found");
        }else {
            System.out.println(result.getPairs());
        }
    }
}
