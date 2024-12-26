import java.util.*;
public class algorithmMaximumSubArraySumPrefixArray {
    public static void maxSubarraySum(int array[]){
        //CREATING PREFIX ARRAY
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        int prefixArray[] = new int[array.length];
        prefixArray[0]=array[0];
        for(int i=1;i<array.length;i++){
            prefixArray[i] = prefixArray[i-1] + array[i];
        }
        for(int i=0; i<array.length; i++){
            for(int j=i;j<array.length;j++){
                currentSum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i-1];
                System.out.println("Sum of subarray: " +currentSum);
                if(maximumSum < currentSum){
                    maximumSum = currentSum;
                }
            }
        }
        System.out.print("Maximum subarray sum is: " + maximumSum);
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
            maxSubarraySum(sampleArray);
        }
    }
}
