package com.sdk.BellmanFord;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private int distance;
    private List<Edge> adjacentEdges;
    private Vertex predecessor;

    public Vertex(String name) {
        this.name = name;
        this.adjacentEdges = new ArrayList<>();
        this.distance = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public List<Edge> getAdjacentEdges() {
        return adjacentEdges;
    }

    public void setAdjacentEdges(List<Edge> adjacentEdges) {
        this.adjacentEdges = adjacentEdges;
    }

    public void addAdjacentEdge(Edge edge) {
        this.adjacentEdges.add(edge);
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public String toString() {
        return this.name + " -> ";
    }
}
