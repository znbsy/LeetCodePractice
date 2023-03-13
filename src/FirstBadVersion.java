public class FirstBadVersion {
    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int mid = 0;

        while (low <= high){
            mid = low + (high - low) / 2;
            if (isBadVersion(mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean isBadVersion(int version){
        if (version >= 1702766719){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
    }
}
