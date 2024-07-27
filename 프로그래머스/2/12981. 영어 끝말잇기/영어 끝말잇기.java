import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> usedWords = new HashSet<>();
        char lastChar = words[0].charAt(words[0].length() - 1);
        usedWords.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];

            if (lastChar != currentWord.charAt(0) || usedWords.contains(currentWord)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                return answer;
            }

            lastChar = currentWord.charAt(currentWord.length() - 1);
            usedWords.add(currentWord);
        }

        return answer;
    }
}