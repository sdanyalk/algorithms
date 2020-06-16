package com.sdk.Dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    public void computeShortestPathFrom(Node startNode) {
        PriorityQueue<Node> queue = new PriorityQueue<>();

        startNode.setDistance(0);
        startNode.setVisited(true);
        queue.add(startNode);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            currentNode.setVisited(true);

            for (Edge edge : currentNode.getNeighbors()) {
                Node endNode = edge.getEndNode();

                if (!endNode.isVisited()) {
                    int newDistance = currentNode.getDistance() + edge.getWeight();

                    if (newDistance < endNode.getDistance()) {
                        queue.remove(endNode);
                        endNode.setDistance(newDistance);
                        endNode.setPredecessor(currentNode);
                        queue.add(endNode);
                    }
                }
            }
        }
    }

    public Path getShortestPathTo(Node targetNode) {
        Path path = new Path();

        List<Node> nodes = new ArrayList<>();

        for (Node n = targetNode; n != null; n = n.getPredecessor()) {
            nodes.add(n);
        }

        Collections.reverse(nodes);

        path.setNodesPath(nodes);
        path.setDistance(targetNode.getDistance());

        return path;
    }
}
