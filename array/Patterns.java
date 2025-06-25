package DSA.array;

public class Patterns {
    public static void main(String[] args) {
//1.⭐⭐⭐⭐⭐
//⭐⭐⭐⭐⭐
//⭐⭐⭐⭐⭐
//⭐⭐⭐⭐⭐
//⭐⭐⭐⭐⭐
//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <=5; j++) {
//                System.out.print("⭐");
//            }
//            System.out.println();
//        }

//        2.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("⭐");
            }
            System.out.println();
        }
    }


}
