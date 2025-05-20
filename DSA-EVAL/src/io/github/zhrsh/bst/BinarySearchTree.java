package io.github.zhrsh.bst;

public class BinarySearchTree {
    Node root;

    // menyisipkan node
    void insert(int key) {
        root = insertRec(root, key);
    }

    // fungsi rekursif untuk menyisipkan node baru
    Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key == root.data) {
            root.count++; // increment count jika key is a duplicate
        } else if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    // menampilkan inorder traversal
    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            if (root.count > 1) {
                System.out.print(root.data + "(" + root.count + ")" +" ");
            } else {
                System.out.print(root.data + " ");
            }
            inorderRec(root.right);
        }
    }

    // cari node
    int search(int key) {
        Node result = searchRec(root, key);
        if (result != null) {
            return result.count; // return count jika ditemukan
        } else {
            return 0; // return 0 jika tidak ditemukan
        }
    }
    
    Node searchRec(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data == key) {
            return root; // return node jika ditemukan
        }
        if (key < root.data) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }
}
