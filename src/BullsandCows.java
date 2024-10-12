public class BullsandCows {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;

        int[] ref_array = new int[10];
        int[] cow_array = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bull++;
            } else {
                ref_array[s - '0']++;
                cow_array[g - '0']++;
            }

        }

        for (int i = 0; i < 10; i++) {
            cow += Math.min(ref_array[i], cow_array[i]);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(bull).append("A").append(cow).append("B");
        return sb.toString();
    }
}
