import java.util.Scanner;

public class triple {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0; i<t; i++){

            int size = scn.nextInt();
            int [] A = new int[size];
            //input
            int j;
            for(j=0; j<size; j++){
                A[j]=scn.nextInt();
            }
            
            int count = 0;
            for(j=0; j<size; j++){
                count = 0;
                for(int k=0; k<size; k++){
                    if(A[j]==A[k]){
                        count++;
                    }
                }
            }
            if(count==3){
                System.out.print(A[j]);
            }
            else{
                System.out.println(-1);
            }

        }
    }
    
}
