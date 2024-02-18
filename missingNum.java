import java.util.Scanner;
public class missingNum {
    public static void main(String[] args) {

        // Scanner sc= new Scanner(System.in);
        
        // int n=sc.nextInt();

        // int a[] = new int[n-1];

        // for(int i=0; i<n-1; i++)
        // {
        //     a[i] = sc.nextInt();
        // }

        // long sum = (long) n*n

        // n = 10^6;



        Scanner scn = new Scanner(System.in);

        System.out.println();
        int num = scn.nextInt();
        int [] list = new int[num-1];
        for(int i=0; i<num-1; i++)
        {
            list[i] = scn.nextInt();
        }
        long sum =  ((long)num*(num+1))/2;
        long listSum = 0;
        for(int i=0; i<num-1; i++){
            listSum = listSum + list[i];
        }
        System.out.print(sum - listSum);
    }
}
    

