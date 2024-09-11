import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (var email: emails) {
            int at_pos = email.indexOf('@');
            int p_pos = email.indexOf('+');

            String domain = email.substring(at_pos);
            StringBuilder addr;

            if (p_pos >= 0) {
                email = email.substring(0, p_pos) + domain;
                at_pos = email.indexOf('@');
            }

            addr = new StringBuilder(email);

            for (int i = at_pos - 1; i >= 0; i--) {
                if (addr.charAt(i) == '.') {
                    addr.deleteCharAt(i);
                }
            }

            set.add(addr.toString());


        }
        return set.size();
    }
}
