package Assignment3.nestedloop4;
// //write the program to print the following pattern
// 10
// 10 9
// 9 8 7
// 7 6 5 4  
public class third {
    public static void main(String[] args) {
        int n=10;
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n--;
            }
            n++;
            System.out.println();
        }
    }
}
