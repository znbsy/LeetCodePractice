import java.util.Arrays;

public class SuccessfulPairsofSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;

        Arrays.sort(potions);

        int[] pairs = new int[n];

        for (int i = 0; i < n; i++) {
            if ((long) spells[i] * potions[0] >= success) {
                pairs[i] = m;
            }
            if ((long) spells[i] * potions[m - 1] < success) {
                pairs[i] = 0;
            }
            int left = 0;
            int right = m - 1;
            int mid = left + (right - left) / 2;

            while (left <= right) {
                if ((long) spells[i] * potions[mid] >= success) {
                    try {
                        if ((long) spells[i] * potions[mid - 1] < success) {
                            pairs[i] = m - mid;
                            break;
                        } else {
                            right = mid - 1;
                        }
                    } catch (Exception e) {
                        pairs[i] = m - mid;
                        break;
                    }



                } else {
                    left = mid + 1;
                }
                mid = left + (right - left) / 2;
            }

        }

        return pairs;
    }
}
