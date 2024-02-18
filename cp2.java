import java.util.Scanner;
public class cp2{
    public static void main(String[] args) {

        //T-Primes:
        
        // Scanner scn = new Scanner(System.in);
        // int size = scn.nextInt();
        // int[] array = new int[size];
        // for(int i=0; i<size; i++){
        //     array[i]=scn.nextInt();
        // }
        // for(int i=0; i<size; i++){
        //     int count = 0;
        //     for(int j=1; j<=size; j++){
        //         if(i%j==0){
        //             count++;
        //         }
        //     }
        //     if(count==3){
        //         System.out.println("Yes");
        //     }
        //     else{
        //         System.out.println("No");
        //     }

        //     }


        // Q. Repetition:

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int max=0;
        for(int i=0; i<str.length()-1; i++)
        {
            int count=0;
            while(str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }
            if(count>max)
            {
                max = count;
            }
        }
        System.out.println(max);
    }
}