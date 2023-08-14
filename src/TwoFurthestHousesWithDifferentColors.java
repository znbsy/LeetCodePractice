public class TwoFurthestHousesWithDifferentColors {
    public static int maxDistance(int[] colors) {
        int start = 0;
        int end = colors.length - 1;
        if (colors[start] != colors[end]) {
            return end;
        }
        while (colors[start] == colors[end]) {
            end--;
        }
        int diff1 = end;
        int diff2 = colors.length - end - 1;

        while (colors[0] == colors[start]) {
            start++;
        }
        int diff3 = start;
        int diff4 = colors.length - start;

        return Math.max(diff1, Math.max(diff2, Math.max(diff3, diff4)));

    }

    public static void main(String[] args) {
        int[] colors = new int[]{1,1,1,6,1,1,1};
        System.out.println(maxDistance(colors));
    }
}
