package DSA.array;

import java.util.Arrays;
import java.util.Scanner;

class Array {
    static void change(int a[]){
        a[2]=13;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];

//        //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter the number at index " + i + " Below .");
//            arr[i] = sc.nextInt();
//        }
//
//        //output using for loops
//        System.out.println("\n\n=== using for loop ===");
//        System.out.println("The elements present in the array : ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        //output using for-each loops
//        System.out.println("\n\n=== using For-each loop ===");
//        System.out.println("The elements present in the array : ");
//        for (int num:arr){
//            System.out.print(num+" ");
//        }
//
//        //output using toString method
//        System.out.println("\n\n=== using toString method ===");
//        System.out.println("The elements present in the array : ");
//        System.out.println(Arrays.toString(arr));

//        array of string
//        String arr[]=new String[4];
//        //input string array
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.next();
//        }
//        System.out.println(Arrays.toString(arr));

        int arr[] = new int[]{2,6,4,8,9,10};
        System.out.println(Arrays.toString(arr));
        Array.change(arr);
        System.out.println(Arrays.toString(arr));


    }


}