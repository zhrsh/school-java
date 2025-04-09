import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    private ArrayList<Integer> arrayList;

    public ArrayListOperations() {
        arrayList = new ArrayList<>();
    }

    public void arraylistPrintln(String message) {
        System.out.println("\u001B[34m" + "ArrayList - " + message + "\u001B[0m");
    }

    public void add(boolean output, int... values) {
        for (int value : values) {
            arrayList.add(value);
            if (output == true) {
                arraylistPrintln("penambahan: nilai " + value + " telah ditambahkan");
            }
        }
    }

    public void traversal() {
        arraylistPrintln("traversal: " + arrayList);
    }

    public int pencarianLinear(int value) {
        int index = arrayList.indexOf(value);
        arraylistPrintln("pencarian linear: nilai " + value + " ditemukan pada index ke-" + index);
        return index;
    }

    public void delete(int value) {
        if (!arrayList.remove(Integer.valueOf(value))) {
            arraylistPrintln("nilai tidak ditemukan untuk dihapus.");
        } else {
            arraylistPrintln("nilai " + value +  " telah dihapus");
        }
    }

    public void sort() {
        Collections.sort(arrayList);
        arraylistPrintln("arraylist telah di urutkan menjadi: " + arrayList);
    }
}
