import java.util.Scanner;

public class CWHnotes {
    public static void main(String[] args) {
        // 1.Logical operators
        // System.out.println(64>8 && 98>9198);
        // System.out.println(879<867 || 873>9840);

        // 2.Arithematic Operators
        // int A = 4;

        // 3.Modulo Operator
        // int b = 6%4;

        // 4.8%1.1 --> Returns decimal remainder

        // 4.Assignment Operator
        // int b = 9;
        // b *= 3;
        // System.out.println(b);

        // 5.Bitwise Operator
        // System.out.println(2&3);

        // int a = 6 * 5 - 34 / 2;
        // System.out.println(a);
        // Precedence and Associtivity
        // Highedt precendence goes to * and /
        // Precedencce is same for * and /
        // isiliye fir unki associativity dekhte h * aur / ki associativity left to
        // right hoti h
        // int a = 6 * 5 - 34 / 2; // 13
        // int b = 60 / 5 - 34 * 2; // -56
        // + - associativity--> left to right
        // ++ == associativity --> right to left

        //Increment and Decrement Operators
        // int i = 56;
        // int b = i++;-->first b is assigned i(56) then i is incremented
        // int j = 67;
        // int c = ++j;
        //first j(67) is incremented then c is assigned j(68) 

        // System.out.println(i++); (Post increment)
        // System.out.println(i);
        // System.out.println(++i); (Pre increment)
        // System.out.println(i);

        // int y=7;
        // System.out.println(++y*8);

        //Calculate Percentage
        // Scanner scn = new Scanner(System.in);
        // float a = scn.nextFloat();
        // float b = scn.nextFloat();
        // float c = scn.nextFloat();
        // float d = scn.nextFloat();
        // float e = scn.nextFloat();
        // System.out.println(((a+b+c+d+e)/5)+ "%");

        // float a = 7/4.0f*9/2.0f;
        // System.out.println(a);

        // //Encrypting the code
        // char grade = 'B';
        // grade = (char)(grade+8);
        // System.out.println(grade);

        // //Decrypting the code
        // grade = (char)(grade-8);
        // System.out.println(grade);

        // Scanner scn = new Scanner(System.in);
        // int a = scn.nextInt();
        // System.out.println(a>8);

        //String name = new String("Mahak");
        //String name = "Mahak";    
        //-->System.out.println(name);
        //-->Strings are immutableand cannot be changed
        
        //int a = 6;
        //float b=5.87697f;
        //System.out.printf("The value of a is %d and value of b %f", a, b);
        //%d --> int
        //%f --> float
        //%c --> char
        //%s --> string
        //%d --> double
        //System.out.format("The value of a is %d and value of b is %.2f", a, b);
        //(.2f likhne se sirf do decimal places dikhaega.)
        //Agar 8.2f likhenge toh 8 places ki jagah lega end se bharega baaki khali chhodh dega.

        //Taking input from the user
        //---------------------------
        
        // Scanner scn = new Scanner(System.in);
        // String st = scn.next(); 
        // System.out.println(st);
        // --> next() only displays th efirt word of the line.
        // String st = scn.nextLine();
        // System.out.println(st);
        // --> mextLine() displays the whole line and only just the first word of the line.

        // String name = "Mahak";
        // int value = name.length();
        // System.out.println(value);
        // String lowerstring = name.toLowerCase();
        // System.out.println(lowerstring);
        // String ustring = name.toUpperCase();
        // System.out.println(ustring);


        // String nts = "      Mahak       ";
        // System.out.println(nts);
        // System.out.println(nts.trim());

        // System.out.println(name.substring(3));
        // System.out.println(name.substring(1,4));\
        // System.out.println(name.replace('k', 'l'));
        // System.out.println(name.replace('ahak', 'ango'));
        // System.out.println(name.startsWith("Ma", 0));
        // System.out.println(name.endsWith("Ma"));
        // System.out.println(name.endsWith("ak"));
        // System.out.println(name.charAt(1));
        // System.out.println(name.indexOf("ak", 0));
        // String modifiedName = "Mahakmahak";
        // System.out.println(modifiedName.indexOf("ahak", 4));
        // System.out.println(modifiedName.lastIndexOf("ahak"));
        // System.out.println(modifiedName.lastIndexOf("ahak", 6));
        // System.out.println(name.equals("Mahak"));
        // System.out.println(name.equalsIgnoreCase("mahak"));

        // System.out.println("I am escape Sequence \ndouble quotes");
        
        //Conditionals:
        //If-Else:
        // Scanner scn = new Scanner(System.in);
        // int age = scn.nextInt();
        // if(age>18){
        //     System.out.println("You are eligibile to drive.");
        // }
        // else{
        //     System.out.println("You are not eligibile to drive yet!");
        // }

// Scanner scn = new Scanner(System.in);
// int N = scn.nextInt();
// for(int i = 1; i<=N; i++){
//     //N-1 spaces
//     for(int j = 1; j<=(N-i); j++){
//         System.out.print(" ");
//     }
//     //i stars
//     for(int j =1; j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// int age;
// System.out.println("Enter your age:");
// Scanner scn = new Scanner(System.in);
// age = scn.nextInt();
// switch(age){
//     case 18:
//         System.out.println("You are going to be an adult.");
//         break;
//     case 21:
//         System.out.println("You are going to join a job.");
//         break;
//     case 60:
//         System.out.println("You are going to retire.");
//         break;
//     default:
//         System.out.println("Enjoy your life!");
//         break;
// }
// System.out.println("thanks for using my java code.");

// String var = "Shubham";
// switch(var){
//     case "Shubham" : {
//         System.out.println("Hello, Shubham.");
//         System.out.println("Hello, Shubham.");
//         System.out.println("Hello, Shubham.");
//     }
//     case "Saurabh":     
//         System.out.println("Hello, Saurabh.");
//     case "Vishakha": 
//         System.out.println("Hello, Vishakha.");

// Scanner scn = new Scanner(System.in);
// byte m1, m2, m3;
// System.out.println("Enter your marks in Physics");
// m1 = scn.nextByte();
// System.out.println("Enter your makrks in Chemistry");
// m2 = scn.nextByte();
// System.out.println("Enter your marks in Mathematics");
// m3 = scn.nextByte();
// float avg = (m1+m2+m3)/3.0f;
// if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//     System.out.println("Congratulations! You have been promoted.");
// }
// else{
//     System.out.println("Sorry! You've not been promoted.");
// }

// float tax = 0;
// float income = 3.3f;
// if(tax<2.5){
//     tax=tax+0;
// }
// else if(tax>2.5f && tax<5.0f ){
//     tax = tax + 0.05f*(income-2.5f);
// }
// else if(tax>5f && tax<10f ){
//     tax = tax + 0.05f*(income-2.5f);
// }

//To print the day of the week given the number.
// Scanner scn = new Scanner(System.in);
// int day = scn.nextInt();
// switch(day){
//     case 1 : 
//         System.out.println("Monday");
//         break;
//     case 2 : 
//         System.out.println("Tuesday");
//         break;
//     case 3 : 
//         System.out.println("Wednesday");
//         break;
//     case 4 : 
//         System.out.println("Thursday");
//         break;
//     case 5 : 
//         System.out.println("Friday");
//         break;
//     case 6 : 
//         System.out.println("Saturday");
//         break;
//     case 7 : 
//         System.out.println("Sunday");
//         break;
// }

// Scanner scn = new Scanner(System.in);
// String website = scn.next();
// if(website.endsWith(".org")){
//     System.out.println("This is a Organisational website.");
// }
// else if(website.endsWith(".com")){
//     System.out.println("This is a commercial website.");
// }
// else if(website.endsWith(".in")){
//     System.out.println("This is an Indian website.");
// }

//LOOPS:
//while
// while(condition){
//     statement;
// }

//DO WHILE:
// int b=0;
// do{
//     System.out.println(b);
//     b++;
// }while(b<5);

//To print first n natural numbers using do while:
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// int i = 1;
// do{
//     System.out.println(i);
//     i++;
// }while(i<=n);


// For Loops:

// Scanner scn = new Scanner(System.in);
// int N = scn.nextInt();
// for(int i=1;i<=N; i=i+2){
//     System.out.println(i);
    
// }


// Scanner scn = new Scanner(System.in);
// int N = scn.nextInt();
// for(int i=N; i>0; i--){
//     System.out.println(i);
// }


//BREAK AND CONTINUE USING LOOPS:

// Scanner scn = new Scanner(System.in);
// int N = scn.nextInt();
// for(int i = 1; i<=N; i++){
//     System.out.println(i);
//     System.out.println("I'm great");
//     if(i==3){
//         System.out.println("Ending the loop");
//         break;
//     }
// }


// for(int i=1; i<=10; i++){
//     if(i==2){
//         System.out.println("Ending the loop.");
//         continue;
//     }
//     System.out.println(i);
//     System.out.println("Java is great");
// }


//Practice set:

//Printing stars
// Scanner scn= new Scanner(System.in);
// int N = scn.nextInt();
// int N =5;
// for(int i=0; i<N; i++){
//     for(int j=N; j>i; j--){
//         System.out.print("*");
//     }
//     System.out.println();
// }

//print the sum of first n even numbers:
// Scanner scn= new Scanner(System.in);
// int N = scn.nextInt();
// int sum=0;
// for(int i=2;i<=N+1; i=i+2){
//     sum= sum+i;
// }
// System.out.println(sum);


//print the multiplication table of the given number:
// Scanner scn= new Scanner(System.in);
// int N = scn.nextInt();
// for(int i = 1; i<=10; i++){
//     System.out.println(N + " * " + i + " = " + N*i);
// }

//print mulltiplication table of 10 in reverse order:
// int N = 10;
// for(int i=12; i>0; i--){
//     System.out.println(N + " * " + i + " = " + N*i);
// }


//print the factorial of a given number using for loop:
// Scanner scn = new Scanner(System.in);
// int N = scn.nextInt();
// int factorial = 1;
// for(int i = 1; i<=N; i++){
//     factorial= factorial*i;
// }
// System.out.println(factorial);

//  ARRAYS:
// ---------

//Classroom of 500 students and you have to store marks of 500 students:
// You have 2 options:
// 1. Create 500 variables.
// 2. Use arrays (recommended)

//Therre are three main ways to create arrays in java:
//1. Declaration &memory allocation:
// int[] marks = new int[5];

//2. Declaration:
//int[] marks;

// Initialization:
//int[] marks = new int[5];
// marks[0]=100;
// marks[1]=90;
// marks[2]=87;
// marks[3]=84;
// marks[4]=98;

//3. Declaration, Memory allocation and initialisation.
// int[] marks={98,98,90,97,87};

//Why to use arrays? 
//-->Accessing elements in the arrays is faster.

//size kitna lagega ? kitna size allocate krega compiler array k liye?
//--> size *4 bytes (kyuki ek byte is of 4 bits)


// int[] marks = new int[5];
// marks[0]=100;
// marks[1]=90;
// marks[2]=87;
// marks[3]=84;
// marks[4]=98;
// System.out.println(marks[4]);

//Printing the array in reverse order:
// int[] marks={98,98,90,97,87};
// for(int i=marks.length-1; i>=0; i--){
//     System.out.println(marks[i]);
// }

//Printing the array (for-each loop):
// int[] marks={98,98,90,97,87};
// for(int element: marks){
//     System.out.println(element);
// }


//Multidimensional Arrays:
// int [] marks; // 1-D array
// int [][] flats; //2-D array
// flats = new int[2][3];
// flats[0][0]=101;
// flats[0][1]=102;
// flats[0][2]=103;
// flats[1][0]=201;
// flats[1][1]=202;
// flats[1][2]=203;


// Scanner scn = new Scanner(System.in);
// float [] A = new float[5];
// float sum = 0;
// for(int i=0; i<5; i++){
//     A[i] = scn.nextInt();
//     sum = sum + A[i];
// }
// System.out.println(sum);


// Scanner scn = new Scanner(System.in);
// System.out.println("Enter the size:");
// int n =scn.nextInt();
// int [] A = new int[n];
// System.out.println("Enter the elements of the array:");

// for(int i=0; i<n; i++){
//     A[i]=scn.nextInt();
// }
// System.out.println("Enter the number to be checked in the array:");
// int target = scn.nextInt();
// for(int i=0; i<n; i++){
// if(target==A[i]){
//     boolean isinarray=true;
//     break;
// }
// }








    }
}

