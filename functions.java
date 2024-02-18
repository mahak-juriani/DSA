import java.util.Scanner;

public class functions {
    //fuction to return sum of two integers
    // static int sum(int a, int b){
    //     return a+b;
    // }

    //function to return product of two integers
    // static int product(int a, int b){
    //     a=10;
    //     b=10;
    //     return a*b;
    // }
    // static int square(int a) {
    //     return a*a;
    // }

    //Function to return the square root of  an integer(assume that the input is always a perfect square)
    // static int sqrt(int a){
    //     for(int i = 1; i<=a; i++){
    //         if(i*i==a){
    //             return i;
                
    //         }
    //     }
    //     return 0;
    // }

    static double avg(int m1, int m2, int m3, int m4, int m5, int m6, int m7, int m8, int m9, int m10){
        double average= (m1+m2+m3+m4+m5+m6+m7+m8+m9+m10)/10;
        return average;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        // int M = scn.nextInt();
        // int N = scn.nextInt();
        // int P = product(M,N);
        // System.out.println(P);
        // System.out.println(N);

        // System.out.println(square(-6));

        // int N = scn.nextInt();
        // int M = sqrt(N);
        // System.out.println(M);


        int m1 = scn.nextInt();
        int m2 = scn.nextInt();
        int m3 = scn.nextInt();
        int m4 = scn.nextInt();
        int m5 = scn.nextInt();
        int m6 = scn.nextInt();
        int m7 = scn.nextInt();
        int m8 = scn.nextInt();
        int m9 = scn.nextInt();
        int m10 = scn.nextInt();
        double ans = avg(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10);
        System.out.println(ans);
    }
}
