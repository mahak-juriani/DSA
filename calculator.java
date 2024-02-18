import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        //single step of calculator
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int num1 = scn.nextInt();
        
        System.out.println("Please enter the operation:");
        char operator = scn.next().charAt(0);

        // Supported operators:
        //     -addition +
        //     -subtraction -
        //     -division /
        //     -multiplication *
        //     -power  ^

        System.out.println("Please enter the second number:");
        int num2 = scn.nextInt();

        int ans;
        if(operator=='+'){
            ans = num1 + num2;
        }
        else if(operator=='-'){
            ans = num1 - num2;
        }
        else if(operator=='*'){
            ans = num1*num2;
        }
        else if(operator=='/'){
            ans = num1 / num2;
        }
        else if(operator=='^'){
            //for loop to calculate num1^num2
            ans = power(num1,num2);
        }

        //connvertBAse(int num, int base) => assuming num is in base 10, coveert it into new base

        


    }
}