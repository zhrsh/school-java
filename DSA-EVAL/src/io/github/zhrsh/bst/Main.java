package io.github.zhrsh.bst;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * kelas Main adalah titik masuk untuk program yang mengimplementasikan
 * pohon pencarian biner atau BST (Binary Search Tree).
 * @author Zahra A. S.
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // insert integer sesuai permintaan
        int[] values = {15, 17, 12, 4, 17, 9, 2, 20, 21, 27};
        for (int value : values) {
            bst.insert(value);
        }

        // traversal inorder
        System.out.println("\ninorder traversal dari BST:");
        bst.inorder();

        // search
        System.out.print("\nsearch jumlah sebuah node dalam BST: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int intToSearch = scanner.nextInt();
            System.out.println("jumlah node " + intToSearch + ": " + bst.search(intToSearch));
        } catch (InputMismatchException e) {
            // error handling
            System.out.println("input tidak valid.");
        }

        scanner.close();
    }
}

