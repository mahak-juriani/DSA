import java.util.*;
public class online_shopping{
  static int solve(int N, int S, int K, int[][] arr) {
    int sum = 0;
    for(int i=0; i<N; i++){
      sum += (arr[i][0]*arr[i][1]);
    }
    int ans = 0;
    if(sum >= S){
      ans = sum;
    }
    else{
      ans = sum+K;
    }
    return ans;
  }
  
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int S = scn.nextInt();
    int K = scn.nextInt();
    int[][] arr = new int[N][2];
    for(int i=0; i<N; i++){
      for(int j=0; j<2; j++){
        arr[i][j]=scn.nextInt();
      }
    }
    
    System.out.println(solve(N, S, K, arr));
  }
}
    

