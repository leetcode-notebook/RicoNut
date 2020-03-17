package hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/17 11:10 PM
 */
public class LC_1160_FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        HashMap<Character, Integer> charMap = getCharCount(chars);
        for (String word : words) {
            HashMap<Character, Integer> charCountMap = getCharCount(word);
            count += compareChar(charCountMap, charMap) != 0 ? word.length() : 0;
        }
        return count;
    }

    private int compareChar(HashMap<Character, Integer> wordCountMap, HashMap<Character, Integer> charMap) {
        for (Map.Entry<Character, Integer> entry : wordCountMap.entrySet()) {
            char key = entry.getKey();
            Integer charValue = charMap.get(key) == null ? 0 : charMap.get(key);
            if (entry.getValue() > charValue) {
                return 0;
            }
        }
        return 1;
    }

    private HashMap<Character, Integer> getCharCount(String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars.toCharArray()) {
            if (map.get(c) != null) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

}
