
import java.util.Arrays;

public class SortingAlgorithms {

    // 1. Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    // 2. Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // 3. Insertion Sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    // Main Method
    public static void main(String[] args) {

        int[] original = {45, 12, 78, 23, 9, 56, 34, 89, 5, 67};

        int[] bubbleArray = Arrays.copyOf(original, original.length);
        int[] selectionArray = Arrays.copyOf(original, original.length);
        int[] insertionArray = Arrays.copyOf(original, original.length);

        System.out.println("Original Array: " + Arrays.toString(original));

        bubbleSort(bubbleArray);
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleArray));

        selectionSort(selectionArray);
        System.out.println("Selection Sort: " + Arrays.toString(selectionArray));

        insertionSort(insertionArray);
        System.out.println("Insertion Sort: " + Arrays.toString(insertionArray));
    }
}
