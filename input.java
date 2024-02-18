import java.util.*;

public class input {
    public static void main(String[] args) {

        // Scanner scn = new Scanner(System.in);

        // int len = myScanner.nextInt();
        // int breadth = myScanner.nextInt();
        
        // int rectArea = len * breadth;
        // System.out.println(rectArea);

        // scn.nextInt();


        // // int a = scn.nextLong(); // ERRROR

        // long x = scn.nextInt(); // WORKS

        Scanner myScanner = new Scanner(System.in);
        // System.out.println("The actual time (in minutes) the lasagna has been in the oven for:");    
        int bakingTime = myScanner.nextInt();
        // System.out.println("How many minutes the lasagna needs to bake:");
        int timeNeeded  = 40 - bakingTime;
        System.out.println(timeNeeded);


 
     }
 }
