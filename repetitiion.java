import java.util.Scanner;

public class repetitiion {
    public static void main(String[] args) {
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
