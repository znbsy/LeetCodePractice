public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        return helper(flowerbed, n, 0);
    }
    public boolean helper(int[] flowerbed, int n, int idx) {
        if (n == 0) {
            return true;
        }
        for (int i = idx; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0
                    && i + 1 < flowerbed.length
                    && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                if (helper(flowerbed, n - 1, idx + 2)) {
                    return true;
                }
            }else if (flowerbed[i] == 1) {
                i++;
            }
        }
        return false;
    }
}
