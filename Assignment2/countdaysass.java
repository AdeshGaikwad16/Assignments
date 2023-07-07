package Assignments.Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Write the program to print the countdown of days to submit the
// Assignment
// input:-7 
// output:- 7 days remaining
//          6 . . .. . . .. 
//          5 ..............

public class countdaysass {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Number:-");
        int a=Integer.parseInt(br.readLine());
        while(a>=0){
            if(a>0){
            System.out.println(a +" days remaining");
                a--;
        }else{
             System.out.println(a +" days Assignment is Overdue");
             a--;
        }
        }
    }
}
