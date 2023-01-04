package Recurtion;

public class factorial {
    public static void main(String[] args) {
        int n = 3;
      int a =  fact(n);
        System.out.println(a);
    }

    private static int fact(int n) {
        if (n==0){
            return 1;
        }
        int smallAns = fact(n-1);
        return n*smallAns;
    }
}
