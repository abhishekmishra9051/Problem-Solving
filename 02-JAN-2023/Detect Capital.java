class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int cCount = 0;
        for(int i=0; i<n; i++){
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90)
                cCount++;
        }
        if(cCount == 0 || cCount == n) return true;
        if(cCount == 1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}