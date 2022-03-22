import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * Anagram Program
 */
class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("DIGIT", "GIDIT"));
        System.out.println(isAnagram("AAAAAB", "BAACAAA"));
        System.out.println(isAnagram("DIGIT", "GIDIT"));
    }

    public static boolean isAnagram(String word1, String word2) {
        Map<Character, Integer> anagramMap1 = new HashMap<>();
        Map<Character, Integer> anagramMap2 = new HashMap<>();
        int count = 1;
        if (!(word1.length() == word2.length())) {
            return false;
        } else {
            for (int i = 0; i < word1.length(); i++) {
                if (anagramMap1.containsKey(word1.charAt(i))) {
                    count = anagramMap1.get(word1.charAt(i)) + 1;
                    anagramMap1.put(word1.charAt(i), count);
                    count = 1;
                } else {
                    anagramMap1.put(word1.charAt(i), count);
                }
            }
            for (int i = 0; i < word2.length(); i++) {
                if (anagramMap2.containsKey(word2.charAt(i))) {
                    count = anagramMap2.get(word2.charAt(i)) + 1;
                    anagramMap2.put(word2.charAt(i), count);
                    count = 1;
                } else {
                    anagramMap2.put(word2.charAt(i), count);
                }
            }
            for (Map.Entry<Character ,Integer> anagramSet : anagramMap1.entrySet() ){
               if (anagramMap2.containsValue(anagramSet.getValue())){
                   return true;
               }
            }
        }
        return false;
    }
}