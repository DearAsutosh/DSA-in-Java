package DSA.array;

import java.util.Scanner;


//(1)Find the largest element in an array.

class PracticeQuestions {
    static int largestElement(int[] arr){
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("The input array is empty.");
        }
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array u want : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest Element is = "+PracticeQuestions.largestElement(arr));
    }
}
