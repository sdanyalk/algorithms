package com.sdk.Dijkstra;

public class Main {
    public static void main(String[] args) {
        Node nA = new Node("A");
        Node nB = new Node("B");
        Node nC = new Node("C");
        Node nD = new Node("D");
        Node nE = new Node("E");
        Node nF = new Node("F");

        nA.addNeighbor(new Edge(7, nA, nB));
        nA.addNeighbor(new Edge(5, nA, nC));
        nA.addNeighbor(new Edge(2, nA, nD));

        nB.addNeighbor(new Edge(3, nB, nE));
        nB.addNeighbor(new Edge(8, nB, nF));

        nC.addNeighbor(new Edge(5, nC, nA));
        nC.addNeighbor(new Edge(10, nC, nD));
        nC.addNeighbor(new Edge(4, nC, nE));

        nD.addNeighbor(new Edge(2, nD, nA));
        nD.addNeighbor(new Edge(10, nD, nC));
        nD.addNeighbor(new Edge(2, nD, nF));

        nE.addNeighbor(new Edge(3, nE, nB));
        nE.addNeighbor(new Edge(4, nE, nC));
        nE.addNeighbor(new Edge(6, nE, nF));

        nF.addNeighbor(new Edge(8, nF, nB));
        nF.addNeighbor(new Edge(2, nF, nD));
        nF.addNeighbor(new Edge(6, nF, nE));

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        dijkstraAlgorithm.computeShortestPathFrom(nA);

        Path path;

        System.out.println("Shortest path from A -> F");
        path = dijkstraAlgorithm.getShortestPathTo(nF);
        System.out.println(path.getNodesPath() + " with distance: " + path.getDistance());

        System.out.println("Shortest path from A -> E");
        path = dijkstraAlgorithm.getShortestPathTo(nE);
        System.out.println(path.getNodesPath() + " with distance: " + path.getDistance());
    }
}
