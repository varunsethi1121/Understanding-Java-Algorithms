import java.util.*;

public class algorithmSubArray {
    public static void subArray(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(array[k] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int arraySample[] = new int[5];
            for (int i = 0; i < arraySample.length; i++) {
                System.out.print("Enter " + (i + 1) + " element of your choice: ");
                arraySample[i] = sc.nextInt();
            }
            System.out.println("Original array: ");
            System.out.println("Original array: ");
            for (int i = 0; i < arraySample.length; i++) {
                System.out.print(arraySample[i] + " ");
            }
            System.out.println();
            subArray(arraySample);
    }
    }
}

// OUTPUT
// 2
// 2 4
// 2 4 6
// 2 4 6 8  
// 2 4 6 8 10

// 4
// 4 6
// 4 6 8
// 4 6 8 10

// 6
// 6 8
// 6 8 10

// 8
// 8 10

// 10
