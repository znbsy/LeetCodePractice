public class ConvertANumberToHexadecimal {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        String ans = "";
        String[] categpty = new String[]{"0","1", "2", "3", "4", "5",
                "6", "7", "8", "9", "a",
                "b", "c", "d", "e", "f"};

        while (num != 0) {
            int mod = num & 15;
            ans = categpty[mod] + ans;
            num = num >>> 16;
        }
        return ans;

    }
}
