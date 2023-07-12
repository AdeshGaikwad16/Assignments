package Assignment3;

public class nestedloop3 {
    public static void main(String[] args) {
        loop1();
        loop2();
        loop3();
        loop4();
        loop5();
        loop6();
        loop7();
        loop8();
        loop9();
        loop10();
    }

    //write a program to print the following pattern
    // C2W
    // C2W C2W
    // C2W C2W C2W
    // C2W C2W C2W C2W
    static void loop1(){
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("C2W ");
            }
            System.out.println();
        }
    }

    //write a program to print the following pattern
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    static void loop2(){
        int row=4;
        int n=1;
        for(int i=1;i<=row;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
    //write a program to print the following pattern
    // 10
    // 9 8
    // 7 6 5
    // 4 3 2 1
    static void loop3(){
        int row=4;
        int n=10;
        for(int i=1;i<=row;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n--;
            }
            System.out.println();
        }
    }
    //write a program to print the following pattern
    // 3C 3C 3C 3C
    // 3C 3C 3C
    // 3C 3C
    // 3C

    static void loop4(){
        int row=4;
       
        for(int i=1;i<=row;i++){
            
            for(int j=1;j<=row-i+1;j++){
                System.out.print("3C ");
               
            }
            System.out.println();
        }
    }
    //write a program to print the following pattern
    // 10 10 10 10
    // 11 11 11
    // 12 12 
    // 13

    static void loop5(){
        int row=4;
        int n=10;
        for(int i=1;i<=4;i++){
            
            for(int j=1;j<=row-i+1;j++){
                System.out.print(n+" ");
                
            }
            n++;
            System.out.println();
        }
    }

    //write a program to print the following pattern
    // 9
    // 9  8
    // 9  8  7
    // 9  8  7  6
    static void loop6(){
        
        for(int i=1;i<=4;i++){
            int n=9;
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n--;
            }
            System.out.println();
        }
    }

     //write a program to print the following pattern
    //  F 
    //  E F 
    //  D E F 
    //  C D E F 
    //  B C D E F 
    //  A B C D E F

    static void loop7(){
        int row=6;
        char n='F';
        for(int i=1;i<=row;i++){
            char ch=n;
            for(int j=1;j<=i;j++){
                
                System.out.print(ch+" ");
                ch++;
            }n--;
            System.out.println();
        }
    }

    //write a program to print the following pattern
    // J
    // I H 
    // G F E 
    // D C B A
    static void loop8(){
        int row=4;
        char ch='J';
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
    //write a program to print the following pattern
    // 1
    // 8  27
    // 64 125 216
    static void loop9(){
        int row=3;
        int n=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n*n*n+" ");
                n++;
            }
            System.out.println();
        }
    }
    ////write a program to print the following pattern
    // 1 2 3 4
   //  4 5 6
   //  6 7
   //  7
    static void loop10(){
        int n=1;
        int row=4;
        for(int i=1;i<=4;i++){
            
            for(int j=1;j<=row-i+1;j++){
                System.out.print(n+" ");
                
                n++;
            }
            n--;
            System.out.println();
        }
    }
}
