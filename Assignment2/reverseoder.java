package Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// write a program which takes number from users if number is even print that
// number in reverse order or if number is odd print that nuber in reverse order
// by difference two ?
// input:6
// output:6 5 4 3 2 1 
// input:7
// output:7 5 3 1

public class reverseoder {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Number:-");
        int a=Integer.parseInt(br.readLine());
        if(a%2==0){
        while(a!=0){
                System.out.print(a+" ");
                a--;
            }
        }else {
            while(a>0){
               System.out.print(a +" ");
               a--;
               if(a%2==0){
                a--;
               }
            }
        }
    }
}
