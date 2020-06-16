package com.sdk.TopologicalSort;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int data;
    private boolean visited;
    private List<Node> neighbors;

    public Node(int data) {
        this.data = data;
        this.visited = false;
        this.neighbors = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }

    public void addNeighbor(Node node) {
        this.neighbors.add(node);
    }

    @Override
    public String toString() {
        return data + " -> ";
    }
}
