package com.sdk.BellmanFord;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vertex> vertices = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");

        edges.add(new Edge(6, a, b));
        edges.add(new Edge(4, a, c));
        edges.add(new Edge(5, a, d));
        edges.add(new Edge(-1, b, e));
        edges.add(new Edge(-2, c, b));
        edges.add(new Edge(3, c, e));
        edges.add(new Edge(-2, d, c));
        edges.add(new Edge(-1, d, f));
        edges.add(new Edge(3, e, f));

        vertices.add(a);
        vertices.add(b);
        vertices.add(c);
        vertices.add(d);
        vertices.add(e);
        vertices.add(f);

        BellmanFordAlgorithm bellmanFordAlgorithm = new BellmanFordAlgorithm(vertices, edges);
        bellmanFordAlgorithm.computeShortestPathFrom(a);
        bellmanFordAlgorithm.showShortestPathTo(f);
    }
}
