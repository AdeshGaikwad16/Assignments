package Assignment1;

import java.util.Scanner;

public class maxnum {
    public static void main(String[] args) {
        System.out.println("Enter a Three Number:-");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(maxnumber(a,b,c));
    }
    public static String maxnumber(int a,int b,int c) {
        if(a>b){
            if(a>c){
                return a + " is maximum between "+a +" "+ b +" and "+c;
             }else{
                return c + " is maximum between "+ a +" "+ b +" and "+c;
             }
        }else if( b>a){
             if(b>c){
                return b + " is maximum between "+a +" " +b +" and "+c;
             }else{
                return c + " is maximum between "+ a +" "+ b +" and "+c;
             }
        }else{
            return c + " is maximum between "+ a +" "+ b +" and "+c;
        }
    }    

}
