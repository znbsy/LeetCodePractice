public class PrisonCellsAfterNDays {
    public int[] prisonAfterNDays(int[] cells, int n) {
        n = n % 14;

        if (n == 0) {
            n = 14;
        }
        int[] prev = new int[8];
        System.arraycopy(cells, 0, prev, 0, 8);
        cells[0] = 0;
        cells[7] = 0;




        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 7; j++) {

                boolean flag1 = prev[j - 1] == 1 && prev[j + 1] == 1;
                boolean flag2 = prev[j - 1] == 0 && prev[j + 1] == 0;

                if (flag1 || flag2) {
                    cells[j] = 1;
                } else {
                    cells[j] = 0;
                }



                //System.out.print(cells[j] + " ");


            }
            System.arraycopy(cells, 0, prev, 0, 8);
            //System.out.println();
        }

        return cells;
    }
}
