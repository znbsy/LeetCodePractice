import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public String intToRoman(int num) {
//        Map<Integer,String> map = new HashMap<>();
//
//        map.put(1, "I");
//        map.put(4, "IV");
//        map.put(5, "V");
//        map.put(9, "IX");
//        map.put(10, "X");
//        map.put(40, "XL");
//        map.put(50, "L");
//        map.put(90, "XC");
//        map.put(100, "C");
//        map.put(400, "CD");
//        map.put(500, "D");
//        map.put(900, "CM");
//        map.put(1000, "M");
        int[] val = new int[] {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] syb = new String[] {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        StringBuilder ans = new StringBuilder();


        for (int i = val.length - 1; num > 0 && i >= 0; i--) {
            while (num >= val[i]) {
                ans.append(syb[i]);
                num -= val[i];
            }
        }

        return ans.toString();



    }

}
