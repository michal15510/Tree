import java.util.Scanner;


public class ComplexityClassExample {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(2));
    }

    private static boolean isPrimeNumber(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }
}