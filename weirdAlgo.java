import java.util.Scanner;

public class weirdAlgo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long num = scn.nextInt();
        System.out.print(num+" ");
        while(num!=1){
            if(num%2==0){
                num=num/2;
                System.out.print(num + " ");
            }
            else if(num%2!=0){
                num=3*num+1;
                System.out.print(num + " ");
            }
        }
    }
}
