package Assignment3.nestedloop4;
//write the program to print the following pattern
// 1 2 3 4
// 2 3 4
// 3 4
// 4
public class forth {
    public static void main(String[] args) {
        int row=4;
        int n=1;
        for(int i=1;i<=row;i++){
            int a=n;
            for(int j=1;j<=row-i+1;j++){
                System.out.print(a+" ");
                a++;
            }
            n++;
            System.out.println();
        }
    }
}
