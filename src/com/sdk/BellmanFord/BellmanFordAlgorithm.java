package com.sdk.BellmanFord;

import java.util.List;

public class BellmanFordAlgorithm {
    private List<Vertex> vertices;
    private List<Edge> edges;

    public BellmanFordAlgorithm(List<Vertex> vertices, List<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    public void computePath(Vertex sourceVertex) {
        sourceVertex.setDistance(0);

        for (int i = 0; i < vertices.size() - 1; i++) {
            for (Edge edge : edges) {
                Vertex startVertex = edge.getStartVertex();
                Vertex endVertex = edge.getEndVertex();

                if (startVertex.getDistance() == Integer.MAX_VALUE) {
                    continue;
                }

                int newDistance = startVertex.getDistance() + edge.getWeight();

                if (newDistance < endVertex.getDistance()) {
                    endVertex.setDistance(newDistance);
                    endVertex.setPredecessor(startVertex);
                }
            }
        }

        for (Edge edge : edges) {
            if (edge.getStartVertex().getDistance() != Integer.MAX_VALUE) {
                if (hasCycle(edge)) {
                    System.out.println("Negative cycle detected");
                    return;
                }
            }
        }
    }

    public void shortestPathTo(Vertex targetVertex) {
        if (targetVertex.getDistance() == Integer.MAX_VALUE) {
            System.out.println("There is no path from the source vertex to target vertex: " + targetVertex);
        }

        while (targetVertex.getPredecessor() != null) {
            System.out.println(targetVertex);
            targetVertex = targetVertex.getPredecessor();
        }
    }

    private boolean hasCycle(Edge edge) {
        return edge.getWeight() + edge.getStartVertex().getDistance() < edge.getEndVertex().getDistance();
    }
}
