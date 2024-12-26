import java.util.*;
public class algorithmLargestElement {
    public static void largestElement(int array[]){
        int maxElement = array[0];
        for(int i=0; i<array.length; i++){
            if(maxElement<array[i]){
                maxElement = array[i];
            }
        }
        System.out.print("Largest element in the given array is: " + maxElement );
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int arraySample[] = new int[5];
            for(int i=0;i<arraySample.length;i++){
                System.out.print("Enter " + (i+1) + " element of your choice: ");
                arraySample[i] = sc.nextInt();
            }
            largestElement(arraySample);
        }
    }
}
