import java.util.*;

public class MOP {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int t = scn.nextInt();

        // while (t > 0) {
        //     int sum = 0;
        //     int N = scn.nextInt();

        //     for (int i = 1; i <= N/2    ; i++) { // Check divisibility up to N/2
        //         if (N % i == 0) {
        //             sum = sum + i;
        //         }
        //     }

        //     if (sum == N) {
        //         System.out.println("YES");
        //     } else {
        //         System.out.println("NO");
        //     }
        //     t--;
        // }

        // Scanner scn = new Scanner(System.in);
        // int N = scn.nextInt();
        // if(N%3==0 & N%5==0){
        //     System.out.println("Rockstar");
        // }
        // else if(N%3==0){
        //     System.out.println("Rock");
        // }
        // else if(N%5==0){
        //     System.out.println("Star");
        // }

        // Scanner scn= new Scanner(System.in);
        // int a = scn.nextInt();
        // int b= scn.nextInt();
        // int c = scn.nextInt();
        // int max = a;
        // if(b>max)
        // {
        //     max=b;
        // }
        // if(c>max)
        // {
        //     max=c;
        // }
        // System.out.println(max);


        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // for(int i=2;i<=n;i=i+2)
        // {
        //     System.out.println(i);
        // }

        // for(int i=4;i<=n; i=i+4)
        // {
        //     System.out.println(i);
        // }


        // Scanner scn = new Scanner(System.in);
        // int N = scn.nextInt();
        // int i=0;
        // if(N==0)
        // {
        //     System.out.println(0);
        // }
        // else  if(N>0)
        // {
        //     while(N!=0)
        //     {
        //         System.out.println(N%10);
        //         N/=10;
        //     }
        // }
        // else if(N<0)
        // {
        //     while(N!=0)
        //     {
        //         System.out.println(-(N%10));
        //         N/=10;
        //     }

        // }

        // Scanner scn = new Scanner(System.in);
        // int Ac= scn.nextInt();
        // int B= scn.nextInt();
        // for(int i=A*B; i<0; i--){
        // 
        // }

        // Scanner scn = new Scanner(System.in);
        // int N = scn.nextInt();
        // for(int i=1;i<=N;i++)
        // {
        //     for(int j=N;j>=i;j--)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Scanner scn = new Scanner(System.in);
        // int N = scn.nextInt();
        // for(int i=1;i<=N;i++)
        // {
        //     for(int j=1;j<=N;j++)
        //     {
        //         if(j==1 || j==N)
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //Hollow inverted triangle
        // Scanner scn = new Scanner(System.in);
        // int N =scn.nextInt();
        // for(int i=1; i<=N;i++)
        // {
        //     for(int j=N;j>=i;j--)
        //     {
        //         if(j==N || j==i || i==N || i==1){
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Scanner scn = new Scanner(System.in);
        // int N =scn.nextInt();
        // for(int row=0;row<N; row++){
        //     for(int col=0;col<=N-row-1; col++){
        //         System.out.print("*");
        //     }
        //     for(int col=0;col<2*row;col++){
        //         System.out.print(" ");
        //     }
        //     for(int col=0;col<=N-row-1;col++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Scanner scn = new Scanner(System.in);
        // int N = scn.nextInt();
        // for(int i=0;i<N;i++)
        // {
        //     for(int j=0;j<N-i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     for(int j=0; j>i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<N-i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Scanner scn = new Scanner(System.in);
        // int N = scn.nextInt();
        // for(int i=N; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        

        // Scanner scn = new Scanner(System.in);
        // int N = scn.nextInt();
        // for(int i = 1;i<=N; i++){
        //     for(int j=1; j<=i; j++){
        //         if((i+j)%2==0){
        //             System.out.print(1);
        //         }   
        //         else {
        //             System.out.print(0);
        //         }
        //     }
        //     System.out.println();
        // }

        // Scanner scn = new Scanner(System.in);
        // int N = scn.nextInt();
        // for(int i=1; i<=N; i++){
        //     for(int j=N-i; j>0; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=N; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Scanner scn = new Scanner(System.in);
        // int N = scn.nextInt();
        // for(int i=1; i<=N; i++){
        //     for(int j=N-i; j>0; j--){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


            // Scanner scn = new Scanner(System.in);
            // int size = scn.nextInt();
            // int []A = new int [size];
            // for(int i=0; i<size; i++){
            //     A[i]=scn.nextInt();
            // }
            // int max = A[0];
            // for(int i=0; i<size; i++){
            //     for(int j=0; j<size; j++){
            //         if(A[i]>max){
            //             max = A[i];
            //         }
            //     }
            // }
            // int count = 0;
            // for(int i=0; i<size; i++){
            //     if(A[i]==max){
            //         count++;
            //     }
            // }
            // int ans = size-count;
            // System.out.println(ans);


            // Scanner scn = new Scanner(System.in);
            // int size = scn.nextInt();
            // int A[] = new int[size];
            // for(int i=0; i<size; i++){
            //     A[i]=scn.nextInt();
            // }
            // int B = scn.nextInt();
            // int C = scn.nextInt();
            // int p1=B-1;
            // int p2=C-1;
            // int temp=0;
            // while(p1<p2){
            //     temp=A[p1];
            //     A[p1]=A[p2];
            //     A[p2]=temp;
            //     p1++;
            //     p2--;
            // }
            // for(int i=0; i<size; i++){
            //     System.out.print(A[i]+" ");
            // }



    }
}
