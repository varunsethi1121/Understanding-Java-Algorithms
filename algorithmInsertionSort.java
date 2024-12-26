import java.util.*;
public class algorithmInsertionSort {
    public static void insertionSort(int array[]) {
       for(int i=1;i<=array.length-1;i++){
            int currentPosition = array[i];
            int previousPosition = i-1;
            while(previousPosition >= 0 && array[previousPosition] > currentPosition){
                array[previousPosition+1] = array[previousPosition];
                previousPosition--;
            }
            array[previousPosition+1] = currentPosition;
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
            insertionSort(sampleArray);
            displayArray(sampleArray, "The sorted array");
        }
    }
}

