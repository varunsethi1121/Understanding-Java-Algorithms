import java.util.*;
public class algorithmPairsInArray {
    public static void pairArray(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.print("( " + array[i] + ", " + array[j] + " )");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int sampleArray[] = new int[5];
            for(int i=0;i<sampleArray.length;i++){
                System.out.print("Enter " + (i+1) + " element of your choice: ");
                sampleArray[i] = sc.nextInt();
            }
            for(int i=0;i<sampleArray.length;i++){
                System.out.print(sampleArray[i] + " ");
            }
            System.out.println(" ");
            pairArray(sampleArray);
        }
    }
}
