package Assignment3.nestedloop4;
//write the program to print the following pattern
// F 
// E 1
// D 2 E
// C 3 D 4
// B 5 C 6 D
// A 7 B 8 C 9
public class seventh {
    public static void main(String[] args) {
        int row =6;
        char ch='F';
        int n=1;
        for(int i=1;i<=row;i++){
            char k=ch;
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(n+" ");
                    n++;
                }else{
                    System.out.print(k+" ");
                    k++;
                }
            }
            ch--;
        System.out.println();
        }
    }
}
