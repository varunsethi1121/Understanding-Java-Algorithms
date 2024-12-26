import java.util.Scanner;

public class algorithmReverseArray {
    // public static void swappingElement(int a, int b){
    //     int temp = a;
    //      b = a;
    //      b = temp;
    // }
    public static void swappingElement(int array[], int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    // public static void reverseArray(int array[]){
    //     int first = 0;
    //     int last = array.length;
    //     for(int i=0;i<array.length;i++){
    //         if(first<last){
    //             swappingElement(first, last);
    //             first++;
    //             last--;
    //         }
    //     }
    // }
    public static void reverseArray(int array[]) {
        int first = 0;
        int last = array.length - 1; // Corrected index initialization
        while (first < last) { // Use a while loop for better clarity
            swappingElement(array, first, last); // Pass the array and indices
            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int arraySample[] = new int[5];
            for (int i = 0; i < arraySample.length; i++) {
                System.out.print("Enter " + (i + 1) + " element of your choice: ");
                arraySample[i] = sc.nextInt();
            }
            System.out.println("Original array: ");
            for (int i = 0; i < arraySample.length; i++) {
                System.out.print(arraySample[i] + " ");
            }
            System.out.println();
            
            reverseArray(arraySample);
            
            System.out.println("Reversed array: ");
            for (int i = 0; i < arraySample.length; i++) {
                System.out.print(arraySample[i] + " ");
            }
            System.out.println();
        }
    }
}
