package com.sdk.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    private Node root;

    public void traverseBreadthFirst() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node currNode = queue.poll();
            System.out.print(currNode);

            if (currNode.left != null) {
                queue.add(currNode.left);
            }

            if (currNode.right != null) {
                queue.add(currNode.right);
            }
        }
    }

    public void traverse(Traversal traversal) {
        switch (traversal) {
            case INORDER:
                traverseInOrder(root);
                break;
            case PREORDER:
                traversePreOrder(root);
                break;
            case POSTORDER:
                traversePostOrder(root);
                break;
        }
    }

    /*
     * Traversing In Order - Left -> Root -> Right
     * */
    private void traverseInOrder(Node currNode) {
        if (currNode == null) {
            return;
        }

        traverseInOrder(currNode.left);
        System.out.print(currNode);
        traverseInOrder(currNode.right);
    }

    /*
     * Traversing Pre Order - Root -> Left -> Right
     * */
    private void traversePreOrder(Node currNode) {
        if (currNode == null) {
            return;
        }

        System.out.print(currNode);
        traversePreOrder(currNode.left);
        traversePreOrder(currNode.right);
    }

    /*
     * Traversing Post Order - Left -> Right -> Root
     * */
    private void traversePostOrder(Node currNode) {
        if (currNode == null) {
            return;
        }

        traversePostOrder(currNode.left);
        traversePostOrder(currNode.right);
        System.out.print(currNode);
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }

        if (value > currentNode.value) {
            currentNode.right = insertRecursive(currentNode.right, value);
        } else if (value < currentNode.value) {
            currentNode.left = insertRecursive(currentNode.left, value);
        } else {
            throw new RuntimeException("Value already exists in the BST");
        }

        return currentNode;
    }
}
