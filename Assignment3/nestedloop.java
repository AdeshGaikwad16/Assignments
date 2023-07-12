package Assignment3;

public class nestedloop{
    public static void main(String[] args) {
        loop1(3);
        loop2();
        loop3(14);
        loop4();
        loop5(12);
        loop6();
        loop7();
        loop8('d');
        loop9();
        loop10();
    }
    static void loop1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("C2W ");
            }
            System.out.println();
        }
    }
    static void loop2(){
        for(int i=1;i<=4;i++){
            int n=4;
            for (int j=1;j<=4;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }

    //write the program to print the following pattern
    // 14 14 14 14
    // 15 15 15 15
    //  16 16 16 16
    //  17 17 17 17
    static void loop3(int n){
         
        for(int i=1;i<=4;i++){
           
            for(int j=1;j<=4;j++){
                System.out.print(n+" ");
            }
           n++;
            System.out.println();
            
        } 
    }

    //write the program to print the following pattern
    // 1A 1A 1A 1A
    // 1A 1A 1A 1A
    // 1A 1A 1A 1A
    static void loop4(){
    for(int i=1;i<=3;i++){
        for(int j=1;j<=3;j++){
            System.out.print("1A ");
        }System.out.println();
    }
}

//write the program to print the following pattern
    // 12 12 12
    // 11 11 11
    // 10 10 10
static void loop5(int n){
         
        for(int i=1;i<=3;i++){
           
            for(int j=1;j<=3;j++){
                System.out.print(n+" ");
            }
           n--;
            System.out.println();
            
        } 
    }

    //write the program to print the following pattern
    // 9 8 7
    // 9 8 7
    // 9 8 7

    static void loop6(){
        for(int i=1;i<=3;i++){
            int n=9;
            for(int j=1;j<=3;j++){
                
                System.out.print(n+" ");
                n--;
            }
            System.out.println();
        }
    }
    //write the program to print the following pattern
    //D D D D
    //D D D D
    //D D D D
    //D D D D

    static void loop7(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                char ch='D';
                System.out.print(ch+" ");
            }System.out.println();
        }
    }

    //write the program to print the following pattern
    // d d d d
    // c c c c
    // b b b b
    // a a a a
static void loop8(char ch){
         
        for(int i=1;i<=4;i++){
           
            for(int j=1;j<=4;j++){
                System.out.print(ch+" ");
            }
           ch--;
            System.out.println();
            
        } 
    }

    //write the program to print the following pattern
    //C B A
    //C B A
    //C B A

    static void loop9(){
        for(int i=1;i<=3;i++){
            char ch='C';
            for(int j=1;j<=3;j++){
                System.out.print(ch+" ");
                ch--;
            }System.out.println();
        }
    }
    //write the program to print the following pattern
    // 1 2 3 4 
    //    2 3 4 5
    //    3 4 5 6
    //    4 5 6 7

    static void loop10(){
        for(int i=1;i<=4;i++){
            int row=i;
            for(int j=1;j<=4;j++){
                System.out.print(row+" ");
                row++;
            }
            System.out.println();
        }
    }
}