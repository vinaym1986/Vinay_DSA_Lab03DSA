package bst.pairfinder;

import java.util.Set;

import binarysearchtree.Node;

public interface NodeVisitationHandler {
    
    void handle(Node currentNode, Set<Integer> previousVisitedNodes);
}
