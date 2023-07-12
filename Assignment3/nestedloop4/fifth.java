package Assignment3.nestedloop4;
//write the program to print the following pattern
// A B C D 
// B C D 
// C D 
// D
public class fifth {
    public static void main(String[] args) {
        int row=4;
        char ch='A';
        for(int i=1;i<=row;i++){
            char n=ch;
            for(int j=1;j<=row-i+1;j++){
                System.out.print(n+" ");
                n++;
            }
            ch++;
            System.out.println();
        }
    }
}
