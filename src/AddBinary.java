import java.util.ArrayList;
import java.util.List;

public class AddBinary {
    public static String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int i = len1 - 1;
        int j = len2 - 1;
        int add = 0;
        int curr = 0;

        List<Integer> ans = new ArrayList<>();

        while (i >= 0 && j >= 0) {
            int sum = a.charAt(i) + b.charAt(j) + add;
            curr = sum % 2;
            add = sum >= 98 ? 1 : 0;

            ans.add(0,curr);

            i--;
            j--;
        }
        if (len1 > len2) {
            while (i >= 0) {
                int sum = a.charAt(i) + add;
//                System.out.println(sum1 + sum2);
//                System.out.println(add);
                curr = sum % 2;
                add = sum >= 50 ? 1 : 0;

                ans.add(0,curr);
                i--;
            }
        } else {
            while (j >= 0) {
                int sum = b.charAt(j) + add;
                curr = sum % 2;
                add = sum >= 50 ? 1 : 0;

                ans.add(0,curr);
                j--;
            }
        }
        if (add > 0) {
            ans.add(0, 1);
        }

        String get = "";
        for (int num: ans) {
            get = get.concat(num + "");
        }

        return get;
    }

    public static void main(String[] args) {
        int sum = '1' + '1';
        System.out.println(addBinary("1010" , "1011"));
    }
}
