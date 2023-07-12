package Assignment2;
// write whether the number is palindrome number or not(2332)
// output: 2332 is a palindrome number

public class palindrome {
    public static void main(String[] args) {
        int a=2332;
        int rev=0;
        int temp=a;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;

        }
        if(rev==a){
            System.out.println(a+" is A palindrome Number");
        }
        else{
             System.out.println(a+" is A Not palindrome Number");
        }
    }
}
