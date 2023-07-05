package Assignments.Assignment1;

import java.util.Scanner;

public class monthprint {
    public static void main(String[] args) {
        System.out.println("Enetr the Month Number:-");
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        System.out.println(MonthName(val));
        
    }
    private static String MonthName(int val) {
        if(val>0 && val<13){
            if(val==1){
                return "january has 31 days";
            } else if(val==2){
                return "February has 28 days";
            }
             else if(val==3){
                return "March has 31 days";
            }
             else if(val==4){
                return "April has 30 days";
            }
             else if(val==5){
                return "May has 31 days";
            }
             else if(val==6){
                return "June has 30 days";
            }
             else if(val==7){
                return "July has 31 days";
            }
             else if(val==8){
                return "Augest has 30 days";
            }
             else if(val==9){
                return "September has 31 days";
            }
             else if(val==10){
                return "October has 30 days";
            }
             else if(val==11){
                return "November has 31 days";
            }
             else if(val==12){
                return "December has 30 days";
            }
        }else if(val>12){
            return "Invalid Month";
        }else{
            return val +" Is not Month";
        }
        return null;
    }
}
