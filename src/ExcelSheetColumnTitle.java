public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {

        StringBuilder s = new StringBuilder();
        while (columnNumber != 0) {

            columnNumber--;
            char curr = (char)(columnNumber % 26 + 'A');

            s.append(curr);
            columnNumber /= 26;
        }

        s.reverse();
        return s.toString();

    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }
}
