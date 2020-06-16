package com.sdk.DepthFirstSearch;

public class DFSRecursive {
    public void depthFirstSearchRecursive(Node node) {
        if (!node.isVisited()) {
            node.setVisited(true);

            System.out.print(node);

            for (int i = 0; i < node.getNeighbors().size(); i++) {
                Node n = node.getNeighbors().get(i);

                depthFirstSearchRecursive(n);
            }
        }
    }
}
