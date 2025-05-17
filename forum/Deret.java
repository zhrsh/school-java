package forum;

public class Deret {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("jumlah elemen dalam array: " + sumArray(a));
    }

    /**
     * @param a array of numbers
     * @return sum dari a
     */
    public static int sumArray(int[] a) {
        int n = a.length; // panjang array
        int sum = 0; // variabel untuk menyimpan hasil penjumlahan

        System.out.println("n = " + n + "\n");

        // hitung jumlah menggunakan loop
        // dimulai dari k = 1 hingga k <= n agar sesuai notasi
        for (int k = 1; k <= n; k++) {
            sum += a[k - 1];
            System.out.print("a" + k + " = " + a[k - 1]);
            if (k == 1) {
                System.out.println(", k = 1");
            } else if (k == n) {
                System.out.println(", k = n");
            } else {
                System.out.println(",");
            }
        }

        return sum;
    }
}
