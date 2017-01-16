package com.thecodestress;

/**
 * Simple binary tree
 *
 * Created by RedDevil on 1/12/2017.
 */
public class BinaryTree {

    Node root;

    /**
     * Constructor sets the root node to null
     */

    public BinaryTree() {
        root = null;
    }

    /**
     * Functions to determine the height of binary tree
     */
    public int height() {
        return height(root);
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    /**
     * Function to count the number nodes in binary tree
     */
    public int numberOfNodes() {
        return numberOfNodes(root);
    }

    public int numberOfNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + numberOfNodes(node.left) + numberOfNodes(node.right);
    }

    /**
     * Function to determine if a binary tree is balanced
     */
    public boolean isBalanced() {
        return isBalanced(root);
    }

    public boolean isBalanced(Node node) {

        if (node == null) {
            return true;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int difference = Math.abs(leftHeight - rightHeight);

        if ((difference <= 1) && isBalanced(node.left) && isBalanced(node.right)) {
            return true;
        } else {
            return false;
        }
    }

}
