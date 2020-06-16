package com.sdk.Dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node> {
    private String name;
    private boolean visited;
    private List<Edge> neighbors;
    private Node predecessor;
    private int distance;

    public Node(String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
        this.distance = Integer.MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Edge> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Edge> neighbors) {
        this.neighbors = neighbors;
    }

    public Node getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Node predecessor) {
        this.predecessor = predecessor;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void addNeighbor(Edge edge) {
        this.neighbors.add(edge);
    }

    @Override
    public int compareTo(Node otherNode) {
        return Integer.compare(this.distance, otherNode.getDistance());
    }

    @Override
    public String toString() {
        return this.name;
    }
}
