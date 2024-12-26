import java.util.*;
public class algorithmBubbleSort {
    public static void bubbleSort(int array[]) {
        for (int turn = 0; turn < array.length - 1; turn++) {
            for (int j = 0; j < array.length - 1 - turn; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void displayArray(int array[], String message) {
        System.out.print(message + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements you want to have in your array: ");
            int element = sc.nextInt();
            int sampleArray[] = new int[element];
            for (int i = 0; i < element; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                sampleArray[i] = sc.nextInt();
            }
            displayArray(sampleArray, "The array you have entered");
            bubbleSort(sampleArray);
            displayArray(sampleArray, "The sorted array");
        }
    }
}
