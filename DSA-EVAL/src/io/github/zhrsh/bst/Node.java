package io.github.zhrsh.bst;

/**
 * kelas Node merepresentasikan sebuah node (elemen) dalam BST.
 * @author Zahra A. S.
 */
class Node {
    int data;
    int count; // untuk jumlah dari node (duplicate handling)
    Node left, right;

    /**
     * constructor untuk membuat node baru dengan data integer.
     *
     * @param data nilai integer yang akan disimpan dalam node.
     */
    public Node(int data) {
        this.data = data;
        this.count = 1; // init 1
        this.left = right = null;
    }
}
