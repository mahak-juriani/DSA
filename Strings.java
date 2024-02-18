import java.util.Scanner;

public class Strings{

    // static void printAllCharacters(String S){
    //     for(int i=0; i<S.length(); i++){
    //         System.out.println(S.charAt(i));
    //     }
    // }
    //Write a  functiion to count the number of vowels in a string having only lowercase character
    // public static int countVowels(String s){
    //     int count = 0;

    //     for(int i=0; i<s.length(); i++){
    //         if(s.charAt(i)=='a'||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
    //             count++;
    //         }
    //     }
    //     return count;
    // }


    // Reverse the string
    // public static String reverse(String s){
    //     String rev = "";
    //     for(int i=s.length()-1; i>=0; i++){
    //         rev=rev+s.charAt(i);
    //     }
    //     return rev;
    // }


    //Check if it is a pallindrome or not
    // public static boolean isPallindrome(String s){
    //     String rev=reverse(s);
    //     if(s.equals(rev)){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }

    // public static boolean isPallindrome2(String s){
    //     int s =0;
    //     int e= S.length()-1;
    //     while(s<e){
    //         if(S.charAt(s)!=S.charAt(e)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    //Password strength:
    //lowercase characters
    //uppercase characters
    //numbers
    //special characters
    //length>=8
    //4/4 --> strong
    //3/4 --> moderate
    //2/4 --> weak
    //1/4 --> poor
    // public static void passwordStrength(String s){
    //     boolean uppercase=false;
    //     boolean lowercase=false;
    //     boolean digit = false;

    //     for(int i=0; i<s.length(); i++){
    //         if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
    //             uppercase=true;
    //         }
    //         if(Character.isLowercase(i)){
    //             lowercase=true;
    //         }
    //         if(Character.isDigit(i)){
    //             digit = true;
    //         }
            
    //     }
    // }
    


    //Toggle the case of all characters
    // uppercase --> lowercase
    // lowercase --> uppercase
    // public static String toggleCharacters(String s){
    //     for(int i=0; i<s.length(); i++){
    //         if(s.charAt(i)>='a' && s.charAt(i)<='z'){
    //             s.charAt(i) = s.charAt(i)+32;
    //         }
    //         else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
    //             s.charAt(i) =s.charAt(i)+32;
    //         }
    //     }
    // }
    public static void main(String[] args) {
        // String s = "abc";
        // s=s+"d";
        // s=s+'e';
        // s=s+100;
        // System.out.println(s);
        // printAllCharacters(s);


        // Scanner scn = new Scanner(System.in);
        // String s = scn.nextLine();
        // System.out.println(countVowels(s));
        // System.out.println(isPallindrome(s));
        // System.out.println(toggleCharacters(s));
         


        Scanner scn = new Scanner(System.in);
        String s = "asdfas";
        String sortedString = "";

        for(int i=0; i<s.length(); i++){
            int ch = s.charAt(i);
            

            
        }
    }
}