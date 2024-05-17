import javax.print.DocFlavor;
import java.util.*;

public class SearchSuggestionsSystem {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();
        Arrays.sort(products);

        for (int i = 0; i < searchWord.length(); i++) {
            List<String> temp = new ArrayList<>();
            int limit = products.length;
            boolean flag = true;
            for (int j = 0; j < limit; j++) {
                if (products[j].startsWith(searchWord.substring(0, i + 1))) {
                    if (flag) {
                        limit = Math.min(j + 3, limit);
                        flag = false;
                    }
                    temp.add(products[j]);
                }
            }
            ans.add(temp);
        }
        return ans;

    }



}
