package io.github.zhrsh.bst;

/**
 * kelas ini merepresentasikan struktur data BST (Binary Search Tree).
 * tree ini memungkinkan penyisipan, pencarian, dan traversal elemen dengan efisien.
 * @author Zahra A. S.
 */
public class BinarySearchTree {
    Node root;

    /**
     * menyisipkan key baru ke dalam tree.
     *
     * @param key key yang akan disisipkan ke dalam tree.
     */
    void insert(int key) {
        root = insertRec(root, key);
    }

    /**
     * fungsi rekursif untuk menyisipkan key baru ke dalam tree.
     *
     * @param root node saat ini yang sedang diperiksa.
     * @param key key yang akan disisipkan.
     * @return node yang telah diperbarui.
     */
    Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key == root.data) {
            root.count++; // increment count jika key duplicate
        } else if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    /**
     * menampilkan elemen-elemen tree dalam urutan inorder.
     */
    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    /**
     * fungsi rekursif untuk melakukan traversal inorder pada tree.
     *
     * @param root node saat ini yang sedang diperiksa.
     */
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            if (root.count > 1) {
                System.out.print(root.data + "(" + root.count + ")" + " ");
            } else {
                System.out.print(root.data + " ");
            }
            inorderRec(root.right);
        }
    }

    /**
     * mencari key dalam tree dan mengembalikan jumlah kemunculannya.
     *
     * @param key key yang akan dicari.
     * @return jumlah kemunculan key dalam tree, atau 0 jika tidak ditemukan.
     */
    int search(int key) {
        Node result = searchRec(root, key);
        if (result != null) {
            return result.count; // return count jika ditemukan
        } else {
            return 0; // return 0 jika tidak ditemukan
        }
    }

    /**
     * fungsi rekursif untuk mencari key dalam tree.
     *
     * @param root node saat ini yang sedang diperiksa.
     * @param key key yang akan dicari.
     * @return node yang ditemukan, atau null jika tidak ditemukan.
     */
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
