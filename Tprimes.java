import java.util.Scanner;

public class Tprimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i]=scn.nextInt();
        }
        for(int i=0; i<size; i++){
            int count = 0;
            for(int j=1; j<=size; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==3){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            }
    }
}
