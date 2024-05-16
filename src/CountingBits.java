public class CountingBits {
    public int[] countBits(int n) {

        int[] ans = new int[n + 1];


        for (int i = 1; i <= n; i++) {
            ans[i] += ans[i / 2] + (i % 2);
        }
        return ans;

//        int[] ans = new int[n + 1];
//
//        for (int i = 0; i <= n; i++) {
//            int j = i;
//            while (j != 0) {
//                if (ans[j] != 0) {
//                    ans[i] += ans[j];
//                    break;
//                } else {
//                    ans[i] += j % 2;
//                    j /= 2;
//                }
//            }
//        }
//        return ans;
    }

}
