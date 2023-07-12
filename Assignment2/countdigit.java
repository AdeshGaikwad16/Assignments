package Assignment2;

public class countdigit {
    public static void main(String[] args) {
        long a=213546846;
        int count=0;

        long temp=a;
        while(temp!=0){
            
            temp=temp/10;
            count++;
            
        }
        System.out.println("count of digits "+count);
    }
}
