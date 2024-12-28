import java.util.*;
public class Triangle {

    int[][] mem;
    public int minimumTotal(List<List<Integer>> triangle) {
        mem = new int[triangle.size()][];
        for (int i = 0; i < triangle.size(); i++) {
            mem[i] = new int[triangle.get(i).size()];
            Arrays.fill(mem[i], Integer.MAX_VALUE);
        }
        return helper(triangle, 0, 0);

    }


    public int helper(List<List<Integer>> triangle, int col, int row) {
        if (row >= triangle.size()) return 0;
        if (col >= triangle.get(row).size()) return 0;

        //System.out.println("row: " + row + " col: " + col);
        int left = 0;
        int right = 0;

        if (row + 1 < mem.length) {
            if (mem[row + 1][col] == Integer.MAX_VALUE) {
                mem[row + 1][col] = helper(triangle, col, row + 1);
            }
            left = mem[row + 1][col];
            //System.out.println(col + 1  + "  " +  mem[row + 1].length);

            if (col + 1 < mem[row + 1].length) {
                //System.out.println("here");
                if (mem[row + 1][col + 1] == Integer.MAX_VALUE) {
                    mem[row + 1][col + 1] = helper(triangle, col + 1, row + 1);
                }
                right = mem[row + 1][col + 1];
            }

        }
        //System.out.println("left: " + left + " right: " + right);



        return triangle.get(row).get(col) + Math.min(left , right);
    }

}
