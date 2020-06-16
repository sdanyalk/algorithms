package com.sdk.DepthFirstSearch;

public class Main {
    public static void main(String[] args) {
        DFSNonRecursive dfsNonRecursive = new DFSNonRecursive();
        DFSRecursive dfsRecursive = new DFSRecursive();

        /*-----Initializing nodes-----*/
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        /*-----Initializing nodes-----*/

        /*-----Creating graph-----*/
        n1.addNeighbor(n2);
        n1.addNeighbor(n3);

        n2.addNeighbor(n4);

        n3.addNeighbor(n5);
        n3.addNeighbor(n6);

        n4.addNeighbor(n10);

        n5.addNeighbor(n7);

        n7.addNeighbor(n4);
        n7.addNeighbor(n8);
        n7.addNeighbor(n9);

        n9.addNeighbor(n10);
        /*-----Creating graph-----*/

        /*----Calling algorithm-----*/
        System.out.println("DFS non-recursive");

        dfsNonRecursive.depthFirstSearch(n1);
        System.out.println("end");
        /*----Calling algorithm-----*/

        /*----Reset the graph-----*/
        n1.setVisited(false);
        n2.setVisited(false);
        n3.setVisited(false);
        n4.setVisited(false);
        n5.setVisited(false);
        n6.setVisited(false);
        n7.setVisited(false);
        n8.setVisited(false);
        n9.setVisited(false);
        n10.setVisited(false);
        /*----Reset the graph-----*/

        /*----Calling recursive algorithm-----*/
        System.out.println("\nDFS recursive");

        dfsRecursive.depthFirstSearchRecursive(n1);
        System.out.println("end");
        /*----Calling recursive algorithm-----*/
    }
}
