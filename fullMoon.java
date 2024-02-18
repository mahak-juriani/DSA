import java.util.Scanner;
public class fullMoon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int P = scn.nextInt();
        int sum = M;
        int i=1;
        int count=1;
        while(i<N){
            sum +=P;
            count++;
            i++;
        }
        System.out.println(count);
    }
    
}
