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
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
        // jika key == root.data, kita abaikan (tidak menyisipkan duplikat)

        return root;
    }

    // menampilkan inorder traversal (urutan terkecil ke terbesar)
    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // cari node
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (key < root.data) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }
}
