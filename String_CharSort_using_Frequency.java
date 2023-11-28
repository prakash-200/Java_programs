import java.util.*;
import java.lang.Error;
import java.lang.String;
public class String_CharSort_using_Frequency {
    public static void main(String[] args) {
        String s= "aabccdddeess";
        Map<Character, Integer> characterCount = new HashMap<>();
        for (char ch : S.toCharArray()) {
            characterCount.put(ch, characterCount.getOrDefault(ch, 0) + 1);
        }
        List<Character> charactersList = new ArrayList<>(characterCount.keySet());        
        Collections.sort(charactersList, (ch1, ch2) -> characterCount.get(ch2) - characterCount.get(ch1));
        StringBuilder result = new StringBuilder();
        for (char ch : charactersList) {
            int charCount = characterCount.get(ch);
            for (int i = 0; i < charCount; i++) {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
