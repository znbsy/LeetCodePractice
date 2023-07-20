public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int exp = columnTitle.length() - 1;
        for (int i = 0; i < columnTitle.length(); i++) {
            sum += (columnTitle.charAt(i) - 64) * Math.pow(26, exp);
            exp--;
        }

        return sum;
    }

}
