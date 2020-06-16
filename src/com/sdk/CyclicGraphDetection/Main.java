package com.sdk.CyclicGraphDetection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Node> graph = new ArrayList<>();

        graph.add(new Node(0));
        graph.add(new Node(1));
        graph.add(new Node(2));
        graph.add(new Node(3));
        graph.add(new Node(4));
        graph.add(new Node(5));

        graph.get(0).addNeighbor(graph.get(1));
        graph.get(1).addNeighbor(graph.get(2));
        graph.get(2).addNeighbor(graph.get(0));
        graph.get(3).addNeighbor(graph.get(0));
        graph.get(3).addNeighbor(graph.get(4));
        graph.get(4).addNeighbor(graph.get(5));
        graph.get(5).addNeighbor(graph.get(3));

        CyclicGraph cyclicGraph = new CyclicGraph();
        cyclicGraph.detectCyclicGraph(graph);
    }
}
