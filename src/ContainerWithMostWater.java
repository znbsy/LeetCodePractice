public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int vol = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            vol = Math.max(vol, area);
            left = h != height[left] ? left : left + 1;
            right = h != height[right] ? right: right - 1;
        }

        return vol;
    }
}
