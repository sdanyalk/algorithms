package com.sdk.BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private Queue<Node> queue;

    public BFS() {
        queue = new LinkedList<>();
    }

    public void breadthFirstSearch(Node root) {
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            currentNode.setVisited(true);
            System.out.println(currentNode);

            for (int i=0; i<currentNode.getNeighbors().size(); i++) {
                Node n = currentNode.getNeighbors().get(i);

                if(!n.isVisited()) {
                    queue.add(n);
                }
            }
        }
    }
}
