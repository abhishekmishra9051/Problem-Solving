class Solution {
    public static String longestString(int n, String[] arr) {
        Set<String> set = new HashSet<String>();
        for (String s : arr) {
            set.add(s);
        }
        String ans = "";
        for(String s : arr) {
            for (int i = 0; i < s.length(); i++) {
                if (!set.contains(s.substring(0, i + 1))) {
                    break;
                } 
                if (i == s.length() - 1) {
                    ans = check(s, ans);
                }
            }
        }
        return ans;
    }
    private static String check(String s1, String s2) {
        if (s1.length() > s2.length())  return s1;
        else if (s2.length() > s1.length()) return s2;
        if (s1.compareTo(s2) < 0)   return s1;
        else return s2;
    }
}
        