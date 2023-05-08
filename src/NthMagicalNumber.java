import java.util.*;

public class NthMagicalNumber {
    public static int nthMagicalNumber(int n, int a, int b) {
        int mul = a * b;
        int count = a + b - 1;
        Set<Integer> arr = new HashSet<>();

        if (a % b == 0) {
            return b * n;
        }

        if (b % a == 0) {
            return a * n;
        }

        for (int i = 1; i <= b; i++) {
            arr.add(a * i);
        }

        for (int i = 1; i <= a; i++) {
            arr.add(b * i);
        }


        int p = n / count * mul;
        int q = n % count;

        return (arr.stream().sorted().toList().get(q - 1) + p) % 1000000007;


    }

    public static void main(String[] args) {
        System.out.println(nthMagicalNumber(4,2,5));
        System.out.println(nthMagicalNumber(4,2,5));
        System.out.println(nthMagicalNumber(2,1,1));
        System.out.println(nthMagicalNumber(3,4,4));
        System.out.println(nthMagicalNumber(3,8,3));
        System.out.println(nthMagicalNumber(5,2,4));
        System.out.println(nthMagicalNumber(1,2,3));
    }
}
