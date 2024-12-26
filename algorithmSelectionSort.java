import java.util.*;
public class algorithmSelectionSort {
    public static void selectionSort(int array[]) {
        for(int turn=0;turn<array.length-1;turn++){
            int minPosition = turn;
            for(int i=turn+1;i<=array.length-1;i++){
                if(array[minPosition] > array[i]){
                    minPosition = i;
                }
            }
            int temp = array[minPosition];
            array[minPosition] = array[turn];
            array[turn] = temp;
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
            selectionSort(sampleArray);
            displayArray(sampleArray, "The sorted array");
        }
    }
}
