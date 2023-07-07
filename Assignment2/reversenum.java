package Assignments.Assignment2;
// write the program to reverse the given number
// input:123456789
// output:987654321
public class reversenum {
    public static void main(String[] args) {
        int a=87965415;
        int rev=0;
        while(a!=0){
            rev=rev*10+a%10;
            a=a/10;

        }
        System.out.println(rev);

    }
}
