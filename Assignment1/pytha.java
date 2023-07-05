package Assignments.Assignment1;

import java.util.Scanner;

public class pytha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Three Number:-");
        int a=sc.nextInt();
         int b=sc.nextInt();
          int c=sc.nextInt();
          String Ans=pytriplet(a,b,c);
          System.out.println(Ans);
    }

    public static String pytriplet(int a,int b, int c) {
        if(a*a+b*b==c*c){
            return "its Pythagorean triplet";
        }
        else{
             return "its Not Pythagorean triplet";
        }
    }
}
