package io.github.zhrsh.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {15, 17, 12, 4, 17, 9, 2, 20, 21, 27};
        for (int value : values) {
            bst.insert(value);
        }

        System.out.println("inorder traversal dari BST:");
        bst.inorder();
    }
}

