package com.sdk.Dijkstra;

public class Edge {
    private Node startNode;
    private Node endNode;
    private int weight;

    public Edge(int weight, Node startNode, Node endNode) {
        this.weight = weight;
        this.startNode = startNode;
        this.endNode = endNode;
    }

    public Node getStartNode() {
        return startNode;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    public Node getEndNode() {
        return endNode;
    }

    public void setEndNode(Node endNode) {
        this.endNode = endNode;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
