public class BinaryNumberWithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int k = n % 2;
        while (n != 0) {
            n = n >>> 1;
            if (n % 2 == k) {
                return false;
            } else {
                k = n % 2;
            }
        }
        return true;
    }
}
