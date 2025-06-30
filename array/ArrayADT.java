package DSA.array;

import java.util.Arrays;

public class ArrayADT {
    //array to store data
    private int[] array;
    //size of array
    private int index;
    //capacity of the array
    private int size;

    //constructor
    ArrayADT(int size) {
        this.size = size;
        this.array = new int[this.size];
        this.index = 0;
    }

    //insert
    public void insert(int value) {
        //check if array is full
        if (index == this.size) {
            System.out.println("Array is full.");
            return;
        }
        array[index] = value;
        index++;
    }

    //delete
    public void delete(int deleteIndex) {
        if (deleteIndex < 0 || deleteIndex >= index) {
            System.out.println("Invalid Index !");
            return;
        }
        for (int i = deleteIndex; i < index - 1; i++) {
            array[i] = array[i + 1];
        }
        index--;
        System.out.println("Deleted Successfully !");
    }

    //search the element and return the value
    public int search(int value) {
        int indexResult = -1;
        for (int i = 0; i < index; i++) {
            if (array[i] == value) {
                indexResult = i;
                break;
            }
        }
        return indexResult;
    }

    //get the data
    public int get(int getIndex) {
        if (getIndex < 0 || getIndex > this.index) {
            System.out.println("Invalid index...");
            return -1;
        }
        return array[getIndex];
    }

    //traverse
    public void traverse() {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i]);
            if(i!=index-1) System.out.print(", ");
        }
        System.out.println("]");
    }

    //update
    public void update(int updateIndex, int value) {
        if (updateIndex < 0 || updateIndex > this.index) {
            System.out.println("Invalid Index !!!");
            return;
        }
        array[updateIndex] = value;
        System.out.println("Value updated at position-" + updateIndex);
    }

    //get the size
    public int getSize() {
        return this.index;
    }
}
