public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        String[] words = s.split(" ");
        int length = words.length;
        for(int i = length - 1; i >= 0; i--) {
            String tmp = words[i].trim();
            if(tmp.length() <= 0)
                continue;
            sb.append(tmp + " ");
        }
        return sb.toString().trim();
    }
}
