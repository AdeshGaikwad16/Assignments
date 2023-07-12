package Assignment1;

import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        System.out.println("Enter the Number:-");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        System.out.println(posnegnum(val));
    }
    public static String posnegnum(int val) {
        if(val<0){
            return val +" is Negative Number";
        }else if(val>0){
            return val +" is positive Number";
        }else{
            return val +" is nuteral Number";
        }
        
    }
}
