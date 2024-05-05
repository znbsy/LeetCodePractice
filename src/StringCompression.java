public class StringCompression {
    public int compress(char[] chars) {
        String s = "";
        int prev = -1;
        int count = 0;

        for (var c: chars) {
            if (prev != c) {
                if (count > 1) {
                    s += String.valueOf(count);
                }
                s += c;
                prev = c;
                count = 1;


            } else {
                count++;
            }
        }
        s =  (count > 1 ? s + count : s);
        System.out.println(s);

        char[] temp = s.toCharArray();
        int size = temp.length;

        System.arraycopy(temp, 0, chars, 0, size);

        return size;
    }
}
