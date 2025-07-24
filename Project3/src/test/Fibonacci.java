package test;

public class Fibonacci {

    private static void fibonacci(int k) {
        int n1=0;
        int n2=1;
        System.out.printf(n1+" "+n2);
        int n3 =0;

        for (int i = 2; i < k; i++) {
            n3= n1+n2;
            System.out.printf(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }


}
