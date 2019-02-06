import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        if(a == null || b == null || a == "" || b == "") {
            throw new IllegalArgumentException();
        }

        if(a.length() == b.length()) {
            a = a.toLowerCase();
            b = b.toLowerCase();

            Map<Character, Integer> map = new HashMap<>();

            for(int i = 0; i < a.length(); i++) {
                char letter = a.charAt(i);
                if(((HashMap) map).containsKey(letter)) {
                    int frequency = ((HashMap) map).get(letter);
                    map.put(letter, frequency + 1);
                } else {
                    ((HashMap) map).put(letter, 1);
                }
            }

            for(int j = 0; j < b.length(); j++) {
                char letter = b.charAt(j);

                if(!((HashMap) map).containsKey(letter)) return false;

                Integer frequency = ((HashMap) map).get(letter);

                if(frequency == 0) return false;
                else ((HashMap) map).put(letter, --frequency);
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
