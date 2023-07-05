package Assignments.Assignment1;

import java.util.Scanner;

public class lessgreater {
    public static void main(String[] args) {
        System.out.println("Enter The Number:-");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        System.out.println(lessgreaternum(val));
    }

    public static String lessgreaternum(int val) {
        if(val<10){
            return val +" Is less Than 10";
        }if(val>10){
            return val +" Is Greater Than 10";
        }if(val==10){
            return val +" is equal to 10";
        }

        return null;
        
    }
}
