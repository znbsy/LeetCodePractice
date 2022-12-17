public class RomanToInteger {
    public static void main(String[] args) {
        String case1 = "III";
        String case2 = "LVIII";
        String case3 = "MCMXCIV";
        System.out.println(romanToInt(case1));
        System.out.println(romanToInt(case2));
        System.out.println(romanToInt(case3));
    }
    public static int romanToInt(String s) {
        if(s.length() == 0){
            return 0;
        }
        String first = s.substring(0,1);
        String two;
        if(s.length() == 1){
            two = s;
        }
        else{
            two = s.substring(0,2);
        }
        int ans = 0;
        switch (two){
            case "IV" -> ans += 4;
            case "IX" -> ans += 9;
            case "XL" -> ans += 40;
            case "XC" -> ans += 90;
            case "CD" -> ans += 400;
            case "CM" -> ans += 900;
            default -> {
                switch (first) {
                    case "I" -> ans += 1;
                    case "V" -> ans += 5;
                    case "X" -> ans += 10;
                    case "L" -> ans += 50;
                    case "C" -> ans += 100;
                    case "D" -> ans += 500;
                    case "M" -> ans += 1000;
                }
                ans += romanToInt(s.substring(1));
                return ans;
            }
        }
        ans += romanToInt(s.substring(2));
        return ans;


    }
}
