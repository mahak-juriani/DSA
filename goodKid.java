import java.util.Scanner;
public class goodKid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0; i<t; i++){
            int n = scn.nextInt();
            int [] A = new int[n];
            for(int j=0; j<n; j++){
                A[j]=scn.nextInt();
            }
            int max = 0;
            int product = 1;
            for(int k=0; k<n; k++){
                A[k]=A[k]+1;
                product *= A[k]
            }
        }
    }
    
}
