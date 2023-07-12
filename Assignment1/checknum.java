package Assignment1;

import java.util.Scanner;

public class checknum {
    public static void main(String[] args) {
        System.out.println("Enter the number:-");
        Scanner Sc=new Scanner(System.in);
        int val=Sc.nextInt();
        System.out.println(checknumber(val));
    }

    private static String checknumber(int val) {
        if(val<=5&& val>=0){
            if(val==0){
                return "zero";
            }
            else if(val==1){
                return "One";
            }
            else if(val==2){
                return "Two";
            }
             else if(val==3){
                return "Three";
            }
             else if(val==4){
                return "Four";
            }
            else if(val==5){
                return "Five";
            }
            

        }else if (val>5){
            return val +" Is Greater Than 5";
        }
        else{
            return val +" Is Negative num ";
        }
        return null;
        
    }
}
