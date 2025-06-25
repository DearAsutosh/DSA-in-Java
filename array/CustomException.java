package DSA.array;

import java.util.*;
 class UnderAgeException extends Exception{
    UnderAgeException(){
        super("You are under age !");
    }
 }
class Voting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=sc.nextInt();
        try{
            if(age<18)
                throw new UnderAgeException();
            else{
                System.out.println("Go and Vote !");
            }
        } catch (UnderAgeException e) {
            e.printStackTrace();
        }
    }
}
