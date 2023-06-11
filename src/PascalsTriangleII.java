import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> one = new ArrayList<>();


        one.add(1);
        if (rowIndex == 0) {
            return one;
        }

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> two = new ArrayList<>();
            two.add(1);
            for (int j = 1; j < i; j++) {
                two.add(one.get(j - 1) + one.get(j));
            }
            two.add(1);
            one = new ArrayList<>(two);
        }
        return one;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
