package Assignments.Assignment2;

public class evmulti {

    // write a program to print the sum of all even number and multiplication
    // of odd numbers between 1 to 10

    // output:sum of even numbers between 1 to 10=30
    // multiplication of odd numbers between 1 to 10=945

    public static void main(String[] args) {
        int a=1;
        int sum=0;
        int multi=1;
        while(a<=10){
            if(a%2==0){
                sum=sum+a;
            }else {
                multi=multi*a;
            }
            a++;
        }
        System.out.println("sum of even numbers between 1 to 10 = "+sum);
         System.out.println("multiplication of odd numbers between 1 to 10 = "+multi);
    }
}
