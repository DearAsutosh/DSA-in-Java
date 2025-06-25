package DSA.array;

public class ArrayADT {
    //array to store data
    private int[] array;
    //size of array
    private int index;
    //capacity of the array
    private int size;
    //constructor
    ArrayADT(int size){
        this.size=size;
        this.array=new int[this.size];
        this.index=0;
    }

    //insert
    public void insert(int value){
        //check if array is full
        if(index==this.size){
            System.out.println("Array is full.");
            return;
        }
        array[index]=value;
        index++;
    }

    //delete

}
