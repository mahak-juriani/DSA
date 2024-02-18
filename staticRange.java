import java.util.Scanner;
public class staticRange{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int queries = scn.nextInt();
        int [] A = new int[size];
        //input:
        for( int i=0; i<size; i++){
            A[i]=scn.nextInt();
        }
        //input of queries:
        for(long i=0; i<queries; i++){
            int a = scn.nextInt();
            int b = scn.nextInt();
            long sum = 0;
            for(int j=a-1; j<=b-1; j++){
                sum += (long)A[j];
            }
            System.out.println(sum);
        }
    }
}