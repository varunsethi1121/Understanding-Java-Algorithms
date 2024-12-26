import java.util.*;
public class algorithmMaximumSubArrayBruteForce {
    //BRUTE FORCE METHOD
    public static void maxSubarray(int array[]){
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                currentSum = 0;
                for(int k=i;k<=j;k++){
                    currentSum += array[k];
                }
                System.out.print(currentSum + " ");
                if(maximumSum < currentSum){
                    maximumSum = currentSum;
                }
            }
        }
        System.out.println("Maximum subarray sum is: " + maximumSum);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int sampleArray[] = new int[5];
            for(int i=0;i<sampleArray.length;i++){
                System.out.print("Enter " + (i+1) + " element of the sampleArray:");
                sampleArray[i] = sc.nextInt();
            }
            for(int i=0;i<sampleArray.length;i++){
                System.out.print(sampleArray[i]);
            }
            System.out.println(" ");
            maxSubarray(sampleArray);
        }
    }
}
