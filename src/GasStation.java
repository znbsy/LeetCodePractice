public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int sum = 0;
        int remain = 0;

        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            remain += gas[i] - cost[i];

            if (remain < 0) {
                start = i + 1;
                remain = 0;
            }

        }

        return sum >= 0 ? start % gas.length : -1;
    }
}
