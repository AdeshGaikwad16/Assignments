package Assignment3;

public class nestedloop2 {
    public static void main(String[] args) {
        loop1();
        loop2(4);
        loop3(14);
        loop4();
        loop5(26,'Z');
        loop6(1);
        loop7(1);
        loop8();
        loop9();
        loop10();
    }
    //write the program to print the following pattern
    // C2W1 C2W2 C2W3
    // C2W1 C2W2 C2W3 
    // C2W1 C2W2 C2W3

    static void loop1(){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print("C2W"+j+" ");
            }
            System.out.println();
        }
    }
    //write the program to print the following pattern
    // 4 4 4 4
    // 5 5 5 5
    // 6 6 6 6
    // 7 7 7 7

    static void loop2(int n){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(n+" ");
            }
            n++;
            System.out.println();
        }
    }
    //write the program to print the following pattern
    // 14 15 16 17 
    // 15 16 17 18
    // 16 17 18 19
    // 17 18 19 20
    static void loop3(int n){
        for(int i=1;i<=4;i++){
            int row=n;
            for(int j=1;j<=4;j++){
                
                System.out.print(row+" ");
                row++;
            }
            n++;
            System.out.println();
        }

    }
     //write the program to print the following pattern
    //  1A 2B 3C
    //  1A 2B 3C
    //  1A 2B 3C

    static void loop4(){
        for(int i=1;i<=3;i++){
            char ch='A';
            for(int j=1;j<=3;j++){
                
                System.out.print(j+""+ch+" ");
                ch++;
            }System.out.println();
    }
    }
    //write the program to print the following pattern
    // 26 Z 25 Y
    // 24 X 23 W
    // 22 V 21 U
    // 20 T 19 S
    static void loop5(int n,char ch){
        for(int i=1;i<=4;i++){
            
            for(int j=1;j<=4;j++){
                if(j%2==0){
                System.out.print(ch+" ");
                ch--;
                }else{
                    System.out.print(n+" ");
                    n--;
            }
          }System.out.println();
        }
    }

     //write the program to print the following pattern
    //  1 4 9 
    //  16 25 36 
    //  49 64 81

    static void loop6(int n){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print(n*n+" ");
                n++;
            }System.out.println();
        }
    }

    //write the program to print the following pattern
    //  1 2 9 
    //  4 25 6 
    //  49 8 81
     static void loop7(int n){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){

                if(n%2!=0){
                    System.out.print(n*n+" ");
                n++;
                }else{
                    System.out.print(n+" ");
                n++;
                }
                
            }System.out.println();
        }
    }
     //write the program to print the following pattern
    //  A b C d
    //  E f G h 
    //  I j K l
    //  M n O p
    static void loop8(){
        char ch='A';
        char dh='b';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j%2==0){
                    System.out.print(dh+" ");
                    dh++; 
                    dh++;
                }else{
                    System.out.print(ch+" ");
                    ch++; 
                    ch++;
                }
            }System.out.println();
        }
    }

     //write the program to print the following pattern
    //  1C3 4B2 9A1
    //  16C3 25B2 36A1
    //  49C3 64B2 81A1
    static void loop9(){
        int a=1;
        for(int i=1;i<=3;i++){
            
            int n=3;
            char ch='C';
            for(int j=1;j<=3;j++){
                System.out.print(a*a+""+ch+n+" ");
                ch--;
                n--;
                a++;
            }
            System.out.println();
        }
    }

    //write the program to print the following pattern
    // F 5 D 3 B 1
    // F 5 D 3 B 1
    // F 5 D 3 B 1
    // F 5 D 3 B 1
    // F 5 D 3 B 1
    // F 5 D 3 B 1

    static void loop10(){
        for(int i=1;i<=6;i++){
            char ch='F';
            int n=5;
            for(int j=1;j<=6;j++){
                if(j%2!=0){
                System.out.print(ch+" ");
                ch--;
                ch--;
                }else{
                    System.out.print(n+" ");
                    n--;
                    n--;
                }
            }System.out.println();
        }
    }
}
