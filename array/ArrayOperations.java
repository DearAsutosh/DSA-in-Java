package DSA.array;

public class ArrayOperations {
    public static void main(String[] args) {
        ArrayADT array=new ArrayADT(10);
        array.insert(20);
        array.insert(21);
        array.insert(22);
        System.out.println("Size of the array :"+array.getSize());
        array.traverse();
        array.update(1,30);
        array.traverse();
        System.out.println("Item found at index-"+array.search(22));
        array.delete(2);
        array.traverse();

    }
}
