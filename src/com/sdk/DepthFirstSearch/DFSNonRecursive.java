package com.sdk.DepthFirstSearch;

import java.util.Stack;

public class DFSNonRecursive {
    private Stack<Node> stack;

    public DFSNonRecursive() {
        stack = new Stack<>();
    }

    public void depthFirstSearch(Node root) {
        stack.add(root);

        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();
            currentNode.setVisited(true);
            System.out.print(currentNode);

            for (int i = 0; i < currentNode.getNeighbors().size(); i++) {
                Node n = currentNode.getNeighbors().get(i);

                if (!n.isVisited()) {
                    stack.push(n);
                }
            }
        }
    }
}
