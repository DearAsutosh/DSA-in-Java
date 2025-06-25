package DSA.array;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
    static void solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i]=arr[i]^arr[i-1];
                arr[i-1]=arr[i]^arr[i-1];
                arr[i]=arr[i]^arr[i-1];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
        System.out.println("After moving all zeros to end");
        System.out.println(Arrays.toString(arr));
    }
}
