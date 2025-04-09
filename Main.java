public class Main {
    public static void main (String[] args) {
        int[] arr = {10, 20, 30, 40, 60};
        ArrayOperations myArr = new ArrayOperations(arr);

        // array fixed size
        myArr.traversal();
        myArr.pencarianLinear(40, true);
        myArr.pencarianBinary(30);
        myArr.insert(4, 50); // setelah 40 (index 4)
        myArr.delete(10);
        myArr.traversal();

        // arraylist
        ArrayListOperations myArrList = new ArrayListOperations();
        myArrList.traversal();
        myArrList.add(false, 10, 60, 30, 20, 40);
        myArrList.traversal();
        myArrList.delete(10);
        myArrList.pencarianLinear(30);
        myArrList.add(true, 50);
        myArrList.sort();

    }
}
