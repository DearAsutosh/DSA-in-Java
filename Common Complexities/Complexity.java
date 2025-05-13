public class Complexity {
    static void constantTime() {
        int array[] = {
                1, 2, 3, 4
        };
        System.out.println(array[0]);//O(1)
    }
    static void linearTime(){
        int array[]={
            1,2,3,4
        };
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1)+" Time\t");
            System.out.println(array[i]+" ");
        }//O(n)
    }
    public static void main(String[] args) {
        Complexity.constantTime();
        Complexity.linearTime();
    }
}
