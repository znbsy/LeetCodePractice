import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestFibonacciSubsequence {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> copy = new HashSet<>();
        for(int a: arr){
            copy.add(a);
        }
        int ans = 0;
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                int f1 = arr[i];
                int f2 = arr[j];
                int next = f1 + f2;
                int count = 2;
                while(copy.contains(next)){
                    count++;
                    f1 = f2;
                    f2 = next;
                    next = f1 + f2;
                }
                ans = Math.max(count, ans);
            }
        }
        return (ans >= 3 ? ans : 0);
    }
}
