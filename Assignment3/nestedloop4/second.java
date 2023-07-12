package Assignment3.nestedloop4;
//write the program to print the following pattern
// 1
// 3 4
// 6 7   8
// 10 11 12 13
// 15 16 17 18 19
public class second {
    public static void main(String[] args) {
        int n=1;
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            n++;
            System.out.println();
        }
    }
}
