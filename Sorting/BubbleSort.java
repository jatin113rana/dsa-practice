
package Sorting;
import java.util.*;

public class BubbleSort {
    
    public static int[] bubbleSort(int[] arr){

        int length = arr.length;

        for( int  i = 0 ; i < length ; i++){
            for(int j = 0 ; j < length - 1-i ;j++ ){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of an array:: ");
        int length  = sc.nextInt();

        System.out.println();

        int[] array = new int[length];

        for(int i = 0 ; i < length ; i++){
            System.out.print("Enter number at index "+i+" :");
            int number = sc.nextInt();
            array[i] = number;
        }

        int[] newArray = bubbleSort(array);

        // System.out.print("[");
        // for(int i = 0 ; i < length ; i++){
        //     System.out.print(newArray[i]+" ");
        // }
        // System.out.print("]");        

        System.out.println("NEW ARRAY:"+Arrays.toString(newArray));
    }
}
