import java.util.Scanner;
public class pattersclass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                if(i==1 || i==N || j==1|| j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
