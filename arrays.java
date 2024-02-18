import java.util.Scanner;
public class arrays {

    // static int sumOfArray(int[] array){
    //     int sum=0;
    //     int i;
    //     int size = array.length;
    //     for(i=0; i<10; i++){
    //         sum=sum+array[i];
    //     }
    //     return sum;
    // }
    

    // static boolean search(int[] data, int target){
    //     int size = data.length;
    //     for(int i=0; i<size; i++){
    //         if(target == data[i]){
    //             return true;            
    //         } 
    //     }
    //     return false;



        // public static void firstAndLast(int[] A, int target){
        //     int size = A.length;
        //     for(int i=0; i<size; i++){
        //         if(target==A[i]){
        //             System.out.println("First index is : "+ i);
        //             break;
        //         }
        //     }
        //     for(int i=size-1; i>=0; i--){
        //         if(A[i]==target){
        //             System.out.println("Last index is : "+i);
        //             break;
        //         }
        //     }

        // }


        // Single number!
        // [2, 4, 5, 6, 7, 4, 2, 5, 6,]
        // Write the code for the element which is present just once in the array.
        // public static int SingleNumber(int[] A){
        //     int ans = 0;
        //     int i =0;
        //     int count = 0;
        //     for(i=0; i<A.length; i++){
        //         for(int j = 0;j<A.length; j++)
        //         {
        //             if(A[i]==A[j]){
        //                 count++;
        //             }
        //         }
        // }
        //     if(count==1){
        //         ans = A[i];
        //     }
        //     return ans;
            
        // }


        // [4,6,1,3,8,9,0]
        // Write a function which takes an array and returns the count of the elements which have at least one element gretaer than that.

        // public static int smallerNumCount(int[] A){
        //     int count =0;
        //     for(int i = 0; i<A.length; i++){
        //         for(int j = 0; j<A.length; j++){
        //             if(A[i]<A[j]){
        //                 count++;
        //                 break;
        //             }
        //         }
                
        //    }
        //     return count;
        // }


        // Write a function which takes an array and returns the maximum value 
        // public static int maxNum(int [] A){
        //     int max = 0;
        //     for(int i=0; i<A.length; i++){
        //         for(int j=0; j<A.length; j++){
        //             if(A[i]<A[j]){
        //                 max = A[j];
        //             }
        //         }
        //     }
        //     return max;
        // }


        // public static int maxOfArray(int [] A){
        //     int max = A[0];
        //     for(int i=1; i<A.length; i++){
                
        //     }
        // }

            // static int[] insert(int[]A, int inp){
            //     int n = A.length;
            //     if(size<n){
            //         A[size]=inp;
            //         return A; 
            //     }
            //     int [] newArray = new int[n+1];
            //     for(int i=0; i<n; i++){
            //         newArray[i]=A[i];
            //     }   
            //     newArray[size] = inp;
            //     return newArray;
            // } 

            public static int[] getCoordinates(int[][]A, int target){
                int [] ans = new int[2];
                ans[0]=-1;
                ans[1]=-1;

                for(int i=0; i<A.length; i++){
                    for(int j=0; j<A[0].length; j++){
                        if(A[i][j]==target){
                            ans[0]=i;
                            ans[1]=j;
                            return ans;
                        }
                    }
                }
                return ans;
            }
        public static void main(String[] args) {
            
        
        // int [] marks = new int[10];
        // for(int i = 0; i<10; i++){
        //     marks[i] = scn.nextInt();
        //     System.out.println(marks[i]);}

            //Implement a function which takes an array and returns the sum of all the values of the array.
        // [1,2,3,4,5] => 155
            
//         int[] array = new int[10];
//         for(int k=0; k<10; k++){
//         array[k]=scn.nextInt();
// }        
//         System.out.println("sum: "+sumOfArray(array));
        // int s = scn.nextInt(); 
        // int[] data = new int[s];
        // for(int k=0; k<s; k++){
        //     data[k]=scn.nextInt();
        // }
        // int target = scn.nextInt();      


        // System.out.println(search(data,target));

        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int [] A = new int[n];
        // for(int i=0; i<n; i++){
        //     A[i] = scn.nextInt();
        // }
        // int target = scn.nextInt();
        // firstAndLast(A, target);



            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // int [] A = new int[n];
            // for(int i=0; i<n; i++){
            //     A[i] = scn.nextInt();
            // }
            // System.out.println(SingleNumber(A));

            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // int [] A = new int[n];
            // for(int i=0; i<n; i++){
            //     A[i]= scn.nextInt();
            // }
            // System.out.println(smallerNumCount(A));


            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // int[] A = new int[n];
            // for(int i=0;i<n;i++){
            //     A[i]= scn.nextInt();
            // }
            // System.out.println(maxNum(A));


            //Write a function to rotate the array K times.
            // [1, 2, 3, 4, 5, 6, 7, 8, 9]  K=4
            // [6, 7, 8, 9, 1, 2, 3, 4, 5] final output
                // Scanner scn = new Scanner(System.in);
                // System.out.println("Size of the array");
                // int N = scn.nextInt();
                // System.out.println("Enter the array elements");
                // int [] Arr = new int[N];
                // for(int i=0; i<N; i++){
                //     Arr[i]=scn.nextInt();
                // }
                // System.out.println("Enter how many rotations are to be performed");
                // int K = scn.nextInt();
                // for(int i=0; i<N; i++){
                //     if((i+K)<=N-1){
                //     Arr[i]=Arr[i+K];
                //     System.out.print(Arr[i]+ " ");

                //     }
                //     else if(i+K>N-1){
                //         Arr[i]=Arr[(i+K)-(N+1)];
                //         System.out.print(Arr[i]+ " ");

                        
                //     }
                // }
                // System.out.println();

                // Scanner scn = new Scanner(System.in);
                // int size = scn.nextInt();
                // int[] array = new int[size];
                // for(int i=0; i<size; i++){
                //     array[i]=scn.nextInt();
                // }
                // for(int i=0; i<size; i++){
                //     int count = 0;
                //     for(int j=1; j<=size; j++){
                //         if(array[i]%j==0){
                //             count++;
                //         }
                //     }
                //     if(count!=3){
                //         System.out.println("No");
                //     }
                //     else{
                //         System.out.println("Yes");
                //     }
        
                // }
                

                //Write a functioin which takes a 2D array ans a target and returns the row and col values of the target

                // Scanner scn = new Scanner(System.in);
                // int row = scn.nextInt();
                // int col = scn.nextInt();

                // int [][] A = new int [row][col];
                // for(int i=0; i<row; i++){
                //     for(int j=0; j<col; j++){
                //         A[i][j]=scn.nextInt();
                //     }
                // }

                // int target = scn.nextInt();
                // getCoordinates(A, target);


                //Given an array of strings.
                //Return the string with highest frequency along with it
                
                



        }

        }

        

    
    
    
    

