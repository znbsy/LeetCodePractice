public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.equals("")) {
            return str2;
        }
        if (str2.equals("")) {
            return str1;
        }

//        if (str1.equals(str2)) {
//            return str1;
//        }


        if (str1.length() < str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        int s2 = str2.length();


        while (str1.length() >= s2) {
            if (str1.substring(0, s2).contains(str2)) {
                str1 = str1.substring(s2);
            } else {
                return "";
            }
        }

        return gcdOfStrings(str2, str1);
    }
}
