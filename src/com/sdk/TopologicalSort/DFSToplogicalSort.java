package com.sdk.TopologicalSort;

import java.util.List;
import java.util.Stack;

public class DFSToplogicalSort {
    private Stack<Node> stack;

    public DFSToplogicalSort() {
        this.stack = new Stack<>();
    }

    public Stack<Node> getStack() {
        return stack;
    }

    public void setStack(Stack<Node> stack) {
        this.stack = stack;
    }

    /*DFS topological sort is DFS + stack*/
    public void topologicalSort(List<Node> graph) {
        for (Node n : graph) {
            if (!n.isVisited()) {
                depthFirstSearch(n);
            }
        }
    }

    private void depthFirstSearch(Node node) {
        if (!node.isVisited()) {
            node.setVisited(true);

            for (Node n : node.getNeighbors()) {
                depthFirstSearch(n);
            }

            this.stack.push(node);
        }
    }
}
