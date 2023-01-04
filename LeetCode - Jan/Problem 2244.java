class Solution {
    public int minimumRounds(int[] tasks) {
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int task : tasks) {
            freq.put(task, freq.getOrDefault(task, 0) + 1);
        }

        int ans = 0;
        for (int task : freq.keySet()) {
            int count = freq.get(task);
            if (count == 1) {
                return -1;
            }
            ans += count / 3;
            if (count % 3 != 0) {
                ans++;
            }
        }
        return ans;
    }
}