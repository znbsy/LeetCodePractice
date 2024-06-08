import java.util.*;
public class TrappingRainWater {

    public int trap(int[] height) {
        int sum = 0;
        int l = 0;
        int r = height.length - 1;
        int right = height[r];
        int left = height[l];


        while (l < r) {
            if (height[l] < height[r]) {
                l++;
                left = Math.max(left, height[l]);
                //System.out.print(left  + " ");
                sum += left - height[l];
            } else {
                r--;
                right = Math.max(right, height[r]);
                sum += right - height[r];
            }
            //System.out.println(sum);


        }


        return sum;



    }


}
