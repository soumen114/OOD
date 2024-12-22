// Sortable interface with the sort() method declaration
interface Sortable {
    void sort(int[] arr); // Method to sort an array of integers
}

// BubbleSort class implementing the Sortable interface
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

// SelectionSort class implementing the Sortable interface
class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

// Main class to test the sorting
public class Sorting7a {
    public static void main(String[] args) {
        int[] array1 = {64, 25, 12, 22, 11};
        int[] array2 = {64, 25, 12, 22, 11};

        // BubbleSort example
        Sortable bubbleSort = new BubbleSort();
        System.out.println("Array before BubbleSort:");
        printArray(array1);
        bubbleSort.sort(array1);
        System.out.println("Array after BubbleSort:");
        printArray(array1);

        // SelectionSort example
        Sortable selectionSort = new SelectionSort();
        System.out.println("Array before SelectionSort:");
        printArray(array2);
        selectionSort.sort(array2);
        System.out.println("Array after SelectionSort:");
        printArray(array2);
    }

    // Utility method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
