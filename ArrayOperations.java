import java.util.Arrays;

public class ArrayOperations {
    private int[] array;
    private int size;

    /**
     * constructor
     */
    public ArrayOperations(int[] newArray) {
        this.array = newArray;
    }

    public void traversal() {
        System.out.print("Array - traversal: [");
        // for loop unutk menampilkan element dalam array secara traversal (loop)
        // traversal: mengiterasi dan mengakses element satu per satu 
        for (int i=0; i < array.length; i++) {
            // utk element terakhir
            if (i == (array.length - 1)) {
                System.out.println(array[i] + "]");
            // utk element selain terakhir
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public int pencarian(int intToSearch) {
        int result = Arrays.binarySearch(array, intToSearch);
        if (result >= 0) {
            System.out.println("Array - pencarian: angka '" + intToSearch + "' ditemukan di index ke-" + result);
        } else {
            System.out.println("Array - pencarian: angka '" + intToSearch + "' tidak ditemukan.");
        }
        return result;
    }

    public void insert(int index, int value) {
        if (size >= array.length) {
            System.out.println("Array penuh!");
            return;
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
    }

    public void delete(int value) {
        int index = pencarian(value);
        if (index != -1) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            size--;
        } else {
            System.out.println("Nilai tidak ditemukan untuk dihapus.");
        }
    }
}

class Main {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayOperations myArr = new ArrayOperations(arr);
        myArr.traversal();
        myArr.pencarian(3);

    }
}