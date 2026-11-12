
import java.util.*;

class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Pass 1: Count frequency
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Pass 2: Find first unique character
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(map.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }
}
