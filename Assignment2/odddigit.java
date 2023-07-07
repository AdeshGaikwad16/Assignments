package Assignments.Assignment2;

public class odddigit {
    public static void main(String[] args) {
        long a=516849684;
        int count=0;

        while(a!=0){
            long rem=a%10;
            if(rem%2!=0){
                count++;
            }
            a=a/10;
        }
        System.out.println("count of odd digit "+count);
    }
}
