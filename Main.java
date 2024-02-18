import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String result = solve(N);
        System.out.println(result);
        scanner.close();
    }

    public static String solve(int N) {
        StringBuilder ans = new StringBuilder("1");
        for (int i = 0; i < N; i++) {
            ans.append("0");
            ans.append("1");
        }
        return ans.toString();
    }
}
