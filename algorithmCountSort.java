import java.util.*;
public class algorithmCountSort {
    public static void countSort(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            largest = Integer.max(largest , array[i]);
        }
        int countArray[] = new int[largest+1];
        for(int i=0;i<array.length;i++){
            countArray[array[i]]++;
        }
        int temp = 0;
        for(int i=0;i<countArray.length;i++){
            while(countArray[i]>0){
                array[temp] = i;
                temp++;
                countArray[i]--;
            }
        }
    }
    public static void displayArray(int array[] , String message){
        System.out.print(message + " : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements you want to have: ");
            int numElements = sc.nextInt();
            int sampleArray[] = new int[numElements];
            for(int i=0;i<numElements;i++){
                System.out.print("Enter " + (i+1) + " element: ");
                sampleArray[i] = sc.nextInt();
            }
            displayArray(sampleArray, "The array you ahve enterd is");
            countSort(sampleArray);
            displayArray(sampleArray, "The sorted array is");
        }
    }
}

