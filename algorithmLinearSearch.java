import java.util.*;
public class algorithmLinearSearch {
    public static void linearSearch(int array[], int key) {
        boolean found = false; // flag to check if the element is found
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Found!!");
                System.out.println("Element found at index " + i + " of the given array.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the entire array.");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int arraySample[] = new int[5];
            for(int i=0;i<arraySample.length;i++){
                System.out.print("Enter " + (i+1) + " element of your choice: ");
                arraySample[i] = sc.nextInt();
            }
            System.out.print("Enter the element you want to search for: ");
            int key = sc.nextInt();
            linearSearch(arraySample, key);
        }
    }
}
