package com.thecodestress;

/**
 * Created by RedDevil on 1/12/2017.
 */

public class BinaryTree {

    Node root;

    /**
     * Function to determine the height of binary tree
     *
     */
    public int height(){
        return heightUtil(root);
    }

    private int heightUtil(Node node){

        if (node == null){
            return 0;
        }

        return 1 + Math.max(heightUtil(node.left), heightUtil(node.right));
    }

    /**
     * Function to count the number nodes in binary tree
     *
     */
    public int numberOfNodes(){
        return numberOfNodesUtil(root);
    }

    private int numberOfNodesUtil(Node node){

        if (node == null){
            return 0;
        }

        return 1 + numberOfNodesUtil(node.left) + numberOfNodesUtil(node.right);
    }

    /**
     * Function to determine if a binary tree is balanced
     *
     */
    //public boolean isBalanced(){}

}
