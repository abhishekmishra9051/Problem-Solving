class Solution {
    public int minimumPushes(String word) {
       /* Map<Character, Integer> freqMap = new HashMap<>();
        for(char x : word.toCharArray()){
            freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
        }

       List<Integer> freq = new ArrayList<>(freqMap.values());
       Collections.sort(freq, Collections.reverseOrder());
   


        int minPushes = 0;
        int pressCount = 1;
        int letterOnCurrentKey = 0;
        final int MAX_LETTERS_PER_KEY = 3;

        for(int x : freq){
            if(letterOnCurrentKey == MAX_LETTERS_PER_KEY ){
                pressCount++;
                letterOnCurrentKey = 0;
            }
            minPushes += x*pressCount;
            letterOnCurrentKey++;
        }
        return minPushes;*/

        /*int[] count = new int[26];
        for(int i = 0; i < word.length(); ++i){
            ++count[word.charAt(i) - 'a'];
        }
        Arrays.sort(count);
        int ans = 0;
        for(int i =0; i<26; ++i){
            ans += (i/8+1)*count[26-i-1];
        }
        return ans;*/

        int[] freq = new int[26];

        for(char c : word.toCharArray()){
            freq[c - 'a']++;
        }
         
        Arrays.sort(freq);

        int minPushes = 0;
        int pressCount = 1;
        int letterCount = 0;

        for(int i = 25; i >= 0; i--){
            if(freq[i] == 0) break;
            minPushes += freq[i]*pressCount;
            letterCount++;

            if(letterCount == 8){
                pressCount++;
                letterCount = 0;
            }

        }
        return minPushes;
        
    }
}