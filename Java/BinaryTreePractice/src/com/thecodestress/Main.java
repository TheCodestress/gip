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
        tree.root = new Node(0);
        tree.root.left = new Node(1);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);

        System.out.println(tree.numberOfNodes());
    }
}
