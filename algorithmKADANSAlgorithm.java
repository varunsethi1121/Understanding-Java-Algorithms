import java.util.*;
public class algorithmKADANSAlgorithm {
    public static void kandanAlgorithm(int array[]){
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            currentSum = currentSum + array[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            maximumSum = Math.max(maximumSum, currentSum);
        }
        System.out.print("Maximum subarray sum is: " + maximumSum);
    }
    public static void  main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int sampleArray[] = new int[5];
            for(int i=0;i<sampleArray.length;i++){
                System.out.print("Enter " + (i+1) + " element: ");
                sampleArray[i] = sc.nextInt();
            }
            for(int i=0;i<sampleArray.length;i++){
                System.out.print(sampleArray[i]);
            }
            System.out.println(" ");
            kandanAlgorithm(sampleArray);
        }
    }
}
