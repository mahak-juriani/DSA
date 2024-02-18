import java.util.Scanner;
public class shortSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0; i<t; i++){
            String A = "";
            for(int j=0; j<3; j++){
                A+=scn.next();
            }
            if(A=="abc"|| A=="acb" || A=="bac" || A=="cba"){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        
    }
    
}
