import java.util.Scanner;
public class oddQueries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0; i<t; i++){
            int size = scn.nextInt();
            int queries = scn.nextInt();
            int []A = new int[size];
            //input
            for(int j=0; j<size; j++){
                A[j]=scn.nextInt();
            }
            //queries kitni baar leni hain
            for(int a=0; a<queries; a++){
                int l = scn.nextInt();
                int r = scn.nextInt();
                int k = scn.nextInt();
                for(int b=l-1; b<=r-1; b++){
                    A[b]=k;
                }
                int sum = 0;
                for(int c=0; c<size; c++){
                    sum += A[c];
                }
                if(sum%2!=0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    } 
}
