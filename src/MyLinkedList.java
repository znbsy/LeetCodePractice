import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    static LinkedList<Integer> list;

    public MyLinkedList() {
        list = new LinkedList<>();
    }

    public int get(int index) {
        if (index >=0 && index < list.size()) {
            return list.get(index);
        }
        return -1;
    }

    public void addAtHead(int val) {
        list.addFirst(val);
    }

    public void addAtTail(int val) {
        list.addLast(val);

    }

    public void addAtIndex(int index, int val) {
        if (index >=0 && index < list.size()) {
            list.add(index, val);
        } else if (index == list.size()) {
            addAtTail(val);
        }
    }

    public void deleteAtIndex(int index) {
        if (index >=0 && index < list.size()) {
            list.remove(index);
        }

    }

}
