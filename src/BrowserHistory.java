import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BrowserHistory {

    Info curr;
    public BrowserHistory(String homepage) {
        this.curr = new Info(homepage,null, null);
    }

    public void visit(String url) {

        Info info = new Info(url, this.curr, null);
//        System.out.println(this.curr);
//        System.out.println(info);
        this.curr.next = info;
        this.curr = info;
    }

    public String back(int steps) {
        int count = 1;
        while (count <= steps && this.curr.prev != null) {
            this.curr = this.curr.prev;
            count++;
        }
        //System.out.println(this.curr);
        return this.curr.url;
    }

    public String forward(int steps) {
        int count = 1;
        while (count <= steps && this.curr.next != null) {
            this.curr = this.curr.next;
            count++;
        }
        return this.curr.url;
    }

    public static class Info {
        String url;
        Info prev;
        Info next;

        public Info (String url1, Info prev1, Info next1) {
            url = url1;
            prev = prev1;
            next = next1;
        }
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
        browserHistory.back(1);                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        browserHistory.back(1);                   // You are in "facebook.com", move back to "google.com" return "google.com"
        browserHistory.forward(1);                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
        browserHistory.forward(2);                // You are in "linkedin.com", you cannot move forward any steps.
        browserHistory.back(2);                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        browserHistory.back(7);                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
    }
}
