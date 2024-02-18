import java.util.Scanner;
public class countingTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0; i<t; i++){
            int s = scn.nextInt();
            int queries = scn.nextInt();
            String A="";
            for(int m=0; m<s; m++){
                A = scn.nextLine();
            }
            for(int j=0; j<queries; j++){
                int l = scn.nextInt();
                int r = scn.nextInt();
                char n = scn.next();
                int count=0;
                for(int k=l-1; k<r-1; k++){
                    if(A.charAt(k)==n){
                        count++;
                    }
                    System.out.println(count);
                }
            }
        }
    }
    
}
