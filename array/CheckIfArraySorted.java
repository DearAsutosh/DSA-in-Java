package DSA.array;

import java.util.Scanner;

public class CheckIfArraySorted {
    static void solution(int arr[]) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "sorted ! ":"not sorted ! ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }
}
