import java.util.*;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            helper(nums, i, res);
        }

        return res;




    }


    public void helper (int[] nums, int lev, List<List<Integer>> res) {
        int size = res.size();
        if (size == 0) {
            List<Integer> list = new ArrayList<>();
            list.add(nums[lev]);
            res.add(list);
            return;
        }

        for (int i = 0; i < size; i++) {
            List<Integer> cur = res.remove(0);
            for (int j = cur.size(); j >= 0; j--) {
                List<Integer> temp = new ArrayList<>(cur);
                temp.add(j, nums[lev]);
                res.add(temp);
            }

        }

    }




}
