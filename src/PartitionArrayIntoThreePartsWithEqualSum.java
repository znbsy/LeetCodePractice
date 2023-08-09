public class PartitionArrayIntoThreePartsWithEqualSum {
    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        if (sum % 3 != 0) {
            return false;
        }
        sum = sum / 3;
        int count = 0;
        int part = 0;
        for (int i: arr) {
            part += i;
            if (part == sum) {
                count++;
                part = 0;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0,0};
        System.out.println(canThreePartsEqualSum(arr));
    }
}
