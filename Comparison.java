import java.util.Random;

public class Comparison {
    /**
     * Metode main/utama
     * 
     * hanya 1 command line argument yg akan digunakan
     * 
     * @param args untuk memilih size array/arraylist yang akan diuji 
     */
    public static void main(String[] args) {

        // jika jumlah command line argument tidak sesuai
        if (args.length != 1) {
            System.out.println("usage: java Comparison <ARRAY_SIZE>");
        // jika sesuai (hanya 1)
        } else {
            // ukuran data uji
            int size = Integer.parseInt(args[0]); // convert args pertama dari string ke int
            int[] testData = generateTestData(size); // memanggil method untuk generate random test data
            
            /*****************************
             * ArrayOperations
             *****************************/
    
            ArrayOperations arrayOps = new ArrayOperations(testData.clone());
            long startTime, endTime;
    
            // traversal
            startTime = System.nanoTime();
            arrayOps.traversal();
            endTime = System.nanoTime();
            double arrayTraversalTime = (endTime - startTime) / 1e6; // convert ke ms
    
            // pencarian
            int searchValue = 30; // nilai yang dicari
            startTime = System.nanoTime();
            arrayOps.pencarianLinear(searchValue, true);
            endTime = System.nanoTime();
            double arraySearchTime = (endTime - startTime) / 1e6;
    
            // penyisipan
            int insertValue = 25;
            startTime = System.nanoTime();
            arrayOps.insert(2, insertValue); // menyisipkan di index 2
            endTime = System.nanoTime();
            double arrayInsertTime = (endTime - startTime) / 1e6;

            // traversal setelah penyisipan
            arrayOps.traversal();
    
            // penghapusan
            startTime = System.nanoTime();
            arrayOps.delete(insertValue);
            endTime = System.nanoTime();
            double arrayDeleteTime = (endTime - startTime) / 1e6;

            // traversal setelah penghapusan
            arrayOps.traversal();
    
            /*****************************
             * ArrayListOperations
             *****************************/
    
            ArrayListOperations arrayListOps = new ArrayListOperations();
            arrayListOps.add(false, testData); // menambahkan semua nilai ke ArrayList
    
            // traversal
            startTime = System.nanoTime();
            arrayListOps.traversal();
            endTime = System.nanoTime();
            double arrayListTraversalTime = (endTime - startTime) / 1e6;
    
            // pencarian
            startTime = System.nanoTime();
            arrayListOps.pencarianLinear(searchValue);
            endTime = System.nanoTime();
            double arrayListSearchTime = (endTime - startTime) / 1e6;
    
            // penyisipan
            startTime = System.nanoTime();
            arrayListOps.add(true, insertValue); // menyisipkan nilai
            endTime = System.nanoTime();
            double arrayListInsertTime = (endTime - startTime) / 1e6;

            // traversal setelah penyisipan
            arrayListOps.traversal();
    
            // penghapusan
            startTime = System.nanoTime();
            arrayListOps.delete(insertValue);
            endTime = System.nanoTime();
            double arrayListDeleteTime = (endTime - startTime) / 1e6;

            // traversal setelah penghapusan
            arrayListOps.traversal();
    
            /*****************************
             * hasil perbandingan (grafik)
             *****************************/
            
            System.out.println("\n----- GRAFIK HASIL PERBANDINGAN -----");
            printGraph("Operasi", "Array (ms)", "ArrayList (ms)");
            printGraph("Traversal", arrayTraversalTime, arrayListTraversalTime);
            printGraph("Pencarian", arraySearchTime, arrayListSearchTime);
            printGraph("Penyisipan", arrayInsertTime, arrayListInsertTime);
            printGraph("Penghapusan", arrayDeleteTime, arrayListDeleteTime);
        }
    }

    /**
     * Mencetak grafik hasil perbandingan waktu operasi antara array dan ArrayList (Method overloading)
     * 
     * @param col1 Nama kolom untuk operasi yang sedang dibandingkan.
     * @param colArray waktu yang dibutuhkan untuk operasi pada array dalam ms.
     * @param colArrayList waktu yang dibutuhkan untuk operasi pada ArrayList dalam ms.
     */
    private static void printGraph(String col1, double colArray, double colArrayList) {
        String formattedArray = String.format("%.6f", colArray);
        String formattedArrayList = String.format("%.6f", colArrayList);
        
        System.out.printf("%-20s %-20s %-20s%n", 
            col1,                                           // putih
            "\u001B[33m" + formattedArray + "\u001B[0m",    // kuning
            "\u001B[34m" + formattedArrayList + "\u001B[0m" // biru
        );
    }

    /**
     * Mencetak grafik hasil perbandingan waktu operasi antara array dan ArrayList (Method overloading)
     * 
     * Metode ini digunakan untuk mencetak hasil dalam format yang terformat dengan baik.
     * 
     * @param col1 Nama kolom untuk operasi yang sedang dibandingkan.
     * @param strArray Waktu yang dibutuhkan untuk operasi pada array dalam format string.
     * @param strArrayList Waktu yang dibutuhkan untuk operasi pada ArrayList dalam format string.
     */
    private static void printGraph(String col1, String strArray, String strArrayList) {
        System.out.printf("%-20s %-20s %-20s%n", 
            col1, 
            "\u001B[33m" + strArray + "\u001B[0m", 
            "\u001B[34m" + strArrayList + "\u001B[0m"
        );
    }

    /**
     * Menghasilkan array data uji dengan nilai acak.
     *
     * Metode ini menghasilkan array integer dengan ukuran yang ditentukan,
     * di mana setiap elemen dalam array diisi dengan nilai acak antara 0 hingga 99.
     *
     * @param size ukuran array yang ingin dihasilkan.
     * @return array integer yang berisi nilai acak.
     * @throws IllegalArgumentException jika ukuran yang diberikan kurang dari atau sama dengan nol.
     */
    private static int[] generateTestData(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("<ARRAY_SIZE> harus lebih besar dari nol.");
        }
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(100); // nilai acak antara 0-99
        }
        return data;
    }
}
