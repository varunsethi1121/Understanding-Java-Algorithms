import java.util.*;
public class algorithmBinarySearch {
    public static void binarySearch(int array[], int key, int first, int last){
        if(first<=last){
            int mid = first + (last - first) / 2;

        if(array[mid]==key){
            System.out.print("Found at index " + mid);
        }
        //FIRST HALF
        else if(array[mid] > key){
            for(int i=0;i<mid;i++){
                if(array[i]==key){
                    System.out.print("Found at index " + i);
                }
            }
        }
        // SECOND HALF
        else if ( array[mid] < key){
            for(int i=mid+1;i<array.length;i++){
                if(array[i]==key){
                    System.out.print("Found at index " + i);
                }
            }
        }
        else{
            System.out.print("Not Found");
        }
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
            for(int i=0;i<arraySample.length;i++){
                System.out.print(arraySample[i] + " ");
            }
            System.out.println(" ");
            Arrays.sort(arraySample);
            for(int i=0;i<arraySample.length;i++){
                System.out.print(arraySample[i] + " ");

            }
            System.out.println(" ");
            int firstIndex = 0;
            int lastIndex = arraySample.length;
            binarySearch(arraySample, key , firstIndex, lastIndex);
        }
    }
}
