public class DominoAndTrominoTiling {

    public int numTilings(int n) {
        int[] mem = new int[3];

        mem[0] = 1;
        mem[1] = 2;
        mem[2] = 5;

        if (n <= 2) {
            return mem[n - 1];
        }


        for (int i = 3; i < n; i++) {
            int temp = (2 * mem[2])  % ((int)Math.pow(10, 9) + 7);
            temp = (temp + mem[0]) % ((int)Math.pow(10, 9) + 7);
            mem[0] = mem[1];
            mem[1] = mem[2];
            mem[2] = temp;
        }

        return mem[2];
    }
}
