package Assignment1;

import java.util.Scanner;

public class dayinweek {
    public static void main(String[] args) {
        System.out.println("Enter the number:-");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        String ans=Dayname(val);
        System.out.println(ans);
    }

    public static String Dayname(int val) {
        if(val<=7 && val>0){
            if(val==1){
                return "Monday";
            }
            if(val==2){
                return "Thusday";
            }
            if(val==3){
                return "wednesday";
            }
            if(val==4){
                return "Thursday";
            }
            if(val==5){
                return "friday";
            }
            if(val==6){
                return "Saturday";
            }
            if(val==7){
                return "Sunday";
            }
        }else{
            return "There is Only Seven Days In a Week";
        }
        return null;
    }
}
