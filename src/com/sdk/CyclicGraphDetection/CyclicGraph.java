package com.sdk.CyclicGraphDetection;

import java.util.List;

public class CyclicGraph {
    public void detectCyclicGraph(List<Node> graph) {
        for (Node n : graph) {
            if (!n.isVisited()) {
                depthFirstSearch(n);
            }
        }
    }

    private void depthFirstSearch(Node node) {
        node.setVisiting(true);

        for (Node n : node.getNeighbors()) {
            if (n.isVisiting()) {
                System.out.println("Cyclic Graph Detected!!! at node " + n);
                return;
            }

            if (!n.isVisited()) {
                depthFirstSearch(n);
            }
        }

        node.setVisiting(false);
        node.setVisited(true);
    }
}
