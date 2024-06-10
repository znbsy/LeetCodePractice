import java.util.Arrays;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int size = s.length();


        StringBuilder[] arr = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }

        int r = 0;
        int c = 0;
        boolean flag = true;

        for (int i = 0; i < size; i++) {
            //System.out.println("row: " + r + ", col: " + c);
            //System.out.println(s.charAt(i));
            arr[r].append(s.charAt(i));
            //System.out.println(arr[r]);

            if (r == numRows - 1 && flag) {
                flag = false;

            }

            if (flag) {
                r++;
            }

            if (r == 0) {
                flag = true;
                r++;
            }

            if (!flag) {
                r--;
                c++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            //System.out.println(i + ": " + arr[i]);
            sb.append(arr[i]);
        }

        return sb.toString();

    }
}
