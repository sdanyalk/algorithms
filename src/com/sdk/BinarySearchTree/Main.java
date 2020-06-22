package com.sdk.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        /*
         *              10
         *           /       \
         *          3         20
         *        /   \     /   \
         *       2     4   11    25
         *
         * */
        BST bst = new BST();

        bst.insert(10);
        bst.insert(3);
        bst.insert(20);
        bst.insert(2);
        bst.insert(4);
        bst.insert(11);
        bst.insert(25);

//        bst.insert(11);

        System.out.println("Breadth First Traversal");
        bst.traverseBreadthFirst();

        System.out.println("\nIn-Order Traversal");
        bst.traverse(Traversal.INORDER);

        System.out.println("\nPre-Order Traversal");
        bst.traverse(Traversal.PREORDER);

        System.out.println("\nPost-Order Traversal");
        bst.traverse(Traversal.POSTORDER);
    }
}
