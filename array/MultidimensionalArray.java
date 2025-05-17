package DSA.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][2];

        //input
        System.out.println("Enter values for each row and column");
        for (int row = 0; row < arr.length; row++) {
//            for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //output
        System.out.println("=== 2D Array ===");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "\t");
            }
            System.out.print("\n");

        }


        //output
        System.out.println("=== Output using toString ===");
        for (int row = 0; row < arr.length; row++) {
            System.out.print(Arrays.toString(arr[row]));
        }

        

    }
}
