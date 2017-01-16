package com.thecodestress;

/**
 * Binary tree practice
 *
 * Goals:
 * + Build a simple binary tree
 * + Write function to determine height
 * + Write function to count the number of nodes
 * + Write function to test if tree is balanced
 *
 * Created by RedDevil on 1/12/2017.
 */

public class Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        System.out.println("Is tree balanced: " + tree.isBalanced());

        tree.root = new Node(0);
        tree.root.left = new Node(1);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.left.right.left = new Node(6);
        tree.root.left.right.left.right = new Node(7);

        System.out.println("Total number of nodes: " + tree.numberOfNodes());
        System.out.println("Height of root: " + tree.height());
        System.out.println("Height of left subtree: " + tree.height(tree.root.left));
        System.out.println("Height of right subtree: " + tree.height(tree.root.right));
        System.out.println("Is tree balanced: " + tree.isBalanced());
    }
}
