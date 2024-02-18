import java.util.*;

public class pretests {
    public static int checkBit(String P){
        int count = 0;
        for(int i=0; i<P.length(); i++){
            if((P & (1<<i))!=0){
                count++;
            }
        }
        return count;
    }

    public static String Pretests(String P, int N){
        int count = checkBit(P);
        if(count <= (25/100)*N){
            return "Good";
        }
        return "Bad";
    }



    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int j=0; j<t; j++){
            int N = scn.nextInt();
            String P = "";
            for(int i=0; i<N; i++){
                P += scn.next();
            }

            System.out.println(Pretests(P, N));
        }
    }
}
