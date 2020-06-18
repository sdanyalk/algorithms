package com.sdk.BellmanFord;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vertex> vertices = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();

        Vertex vA = new Vertex("A");
        Vertex vB = new Vertex("B");

        Edge aTob = new Edge(1, vA, vB);

        BellmanFordAlgorithm bellmanFordAlgorithm = new BellmanFordAlgorithm(vertices, edges);
    }
}
