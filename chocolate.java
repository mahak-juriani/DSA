import java.util.*;

public class chocolate {
    public static int solve(ArrayList<Integer> A) {
        
        
        int N = A.size();
        HashMap<Integer, Integer> priceCount = new HashMap<>();
        int totalSum = 0;
    
        int max = 0;
        for(int i=0; i<A.size(); i++){
            totalSum += A.get(i);
            if(priceCount.containsKey(A.get(i))){
                                        System.out.println("inside loop if");

                int val = priceCount.get(A.get(i));
                    System.out.println(A.get(i));
                    System.out.println(val);

                priceCount.put(A.get(i), val+1);
                System.out.println(priceCount.get(A.get(i)));
            }
            else{
                priceCount.put(A.get(i),1);
            }
    
        }
        
        // for(int i=0; i<priceCount.size(); i++){
            // int key = priceCount.keys.elementAt[i];
            // if(priceCount.get(key) * key > max){
            //     max = priceCount.get(key) * key;
            // }
        // }

        for(int key: priceCount.keySet()){
            System.out.println("key");
                        System.out.println(key);

            int value = priceCount.get(key);

            if(value * key > max){
                        // System.out.println(key);
                        //         System.out.println(value);
                max = value * key;
            }
            
        }
        // System.out.println(totalSum);
        // System.out.println(max);
        
        return totalSum - max;
//         int totalCost = 0;
//         int remainingSum = totalSum;
        
//         for(int i=0; i<N; i++){
//             if(totalCost <= totalSum/2){
//                 return totalCost;
//             }
//         }
        
//         totalCost += A.get(i);
//         remainingSum -= A.get(i);
//         priceCount.put(A.get(i),priceCount.get(A.get(i)-1);
        
//         if(priceCount.get(A.get(i))==0){
//             priceCount.remove(A.get(i));
//         }
    
//     return totalCost;
//     }
    
// }

    // Collections.sort(A);
    // int totalCost = 0;
    // int maxCost = 0;
    
    // for(int price : A){
    //     totalCost += price;
    //     if(totalCost >= maxCost){
    //         maxCost = totalCost;
    //     }
    // }
    // return maxCost;
    // }
    
    
    
    
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);        
        list.add(10);
        list.add(8);
        list.add(3);
chocolate.solve(list);
        // System.out.println(chocolate.solve(list));
    }
    
}
