import java.util.*;

class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        if (!wordList.contains(endWord)) {
            return 0;
        }

        Map<String, List<String>> map = new HashMap<>();
        if (!wordList.contains(beginWord)) {
            wordList.add(0, beginWord);
        }
        createGraph(wordList, map);



        return bfs(beginWord, endWord, map);

    }

    public int bfs(String begin, String end, Map<String, List<String>> map) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(begin);
        visited.add(begin);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                if (currentWord.equals(end)) {
                    return level;
                }

                List<String> neighbors = map.get(currentWord);
                if (neighbors != null) {
                    for (String neighbor : neighbors) {
                        if (!visited.contains(neighbor)) {
                            visited.add(neighbor);
                            queue.offer(neighbor);
                        }
                    }
                }
            }
            level++;
        }

        return 0;
    }




    public void createGraph(List<String> list, Map<String, List<String>> map) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                String s1 = list.get(i);
                String s2 = list.get(j);
                if (distance(s1, s2)) {
                    map.computeIfAbsent(s1, k -> new ArrayList<>()).add(s2);
                    map.computeIfAbsent(s2, k -> new ArrayList<>()).add(s1);
                }
            }
        }
    }


    public boolean distance(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }

        return count == 1;
    }
}