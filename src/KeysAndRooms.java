import java.util.*;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> unlock = new HashSet<>();
        unlock.add(0);

        Queue<Integer> keys = new LinkedList<>(rooms.get(0));

        while (!keys.isEmpty()) {
            int curr = keys.remove();
            if (unlock.contains(curr)) {
                continue;
            }
            unlock.add(curr);
            keys.addAll(rooms.get(curr));

        }

        return rooms.size() == unlock.size();

    }
}
