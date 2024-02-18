public class towerOfHanoi {


    static void toh(int n, char src, char aux, char dest) {
        if(n == 0) {
            return;
        }
        toh(n - 1, src, dest, aux);
        System.out.println("move disk " + n + " from " + src + "->" + dest);
        toh(n - 1, aux, src , dest);
    }

    public static void main(String[] args) {
        toh(3, 'A', 'B', 'C');
    }    
}
