
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";

        int left = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            int length = right - left + 1;

            if (length > maxLength) {
                maxLength = length;
            }
        }

        System.out.println(maxLength);
    }
}
