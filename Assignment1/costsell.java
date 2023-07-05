package Assignments.Assignment1;

import java.util.Scanner;

public class costsell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The selling Price:-");
        int sellp=sc.nextInt();
        System.out.println("Enter The Cost Price:-");
        int costp=sc.nextInt();
        String ans=costsellprice(sellp,costp);
        System.out.print(ans);
    }
    public static String costsellprice(int sellp,int costp) {
        if(sellp>costp){
          return "profit of "+(sellp-costp);
        }else if(sellp<costp){
            return "loss of "+(sellp-costp);
        }else{
            return "price of sell & cost is same";
        }
    }
}
