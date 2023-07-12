package Assignment2;

public class square {

    // write a program to print the square of even digit of the given number.
    // input:1654984257
    // output: 4 16 64 36
    
    public static void main(String[] args) {
        long a=654984651;
        long ans;
        while(a!=0){
            long rem=a%10;
            if(rem%2==0){
                ans=rem*rem;
                System.out.println(ans);
            }
            a=a/10;
        }
    }
}
