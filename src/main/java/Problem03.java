import java.util.HashSet;

public class Problem03 {
    public String countSubstring(String str, int k) {
        int subCount = 0;
        HashSet<Character> distinctChars = new HashSet<>();
        for (int i = 0; i <= str.length(); i++) {
            if (i + k < str.length()) {
                String partial_String = str.substring(i, i + k);
                for (int j = 0; j < partial_String.length(); j++) {
                    distinctChars.add(str.charAt(j));
                }
                if (distinctChars.size() == k) {
                    subCount++;
                }
            }
        }
        return "Input: str =\"" + str + "\",K = "+k+ "\nOutput: "+subCount;
    }
}
