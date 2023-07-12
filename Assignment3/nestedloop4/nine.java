package Assignment3.nestedloop4;
//write the program to print the following pattern
// 1
// 8 9
// 27 16 125
// 64 25 216 49
public class nine {
    public static void main(String[] args) {
         int row=4;
        int n=1;
        for(int i=1;i<=row;i++){
            int a=n;
            for(int j =1;j<=i;j++){
                if(j%2==0){
                    System.out.print(a*a+" ");
                }else{
                    System.out.print(a*a*a+" ");
                }
                a++;
            }
            n++;
            System.out.println();
        }
    }
   
}
