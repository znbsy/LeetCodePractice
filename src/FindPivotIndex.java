public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,-1,0,1,1,0};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j < i; j++){
                sum += nums[j];
            }
            for(int k = i + 1; k < nums.length; k++){
                sum -= nums[k];
            }
            if(sum == 0){
                return i;
            }
        }
        return -1;
    }
}
