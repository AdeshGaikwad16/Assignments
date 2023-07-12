package Assignment3.nestedloop4;
//write the program to print the following pattern
// 1
// 2 3
// 3 4 5 
// 4 5 6 7
public class sixth {
    public static void main(String[] args) {
        int row=4;
        int n=1;
        for(int i=1;i<=row;i++){
            int a=n;
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            n++;
            System.out.println();
        }
    }
}
