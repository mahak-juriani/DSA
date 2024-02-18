import java.util.Scanner;

public class stickySpellingSituation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        int count=0;
        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s1.length(); j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    count++;
                }
            }
        }
        System.out.print(s1.length()-count);

    }
    
}
