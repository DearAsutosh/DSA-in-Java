package DSA.array;

import java.util.Arrays;
import java.util.Scanner;

//linear search
public class LinearSearch {
    public static int linearSearch(int array[], int target) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
//                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //input target
        System.out.println("Enter the target of the array : ");
        int target = sc.nextInt();

        //calling linear search method
        int foundIndex = linearSearch(arr, target);
        System.out.println(target + " found at index :" + foundIndex);

    }
}
