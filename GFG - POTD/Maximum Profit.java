class Solution {
    public static int maximum_profit(int n, int[][] intervals) {
        // code here
        Arrays.sort(intervals, (i1, i2) -> i1[1] - i2[1]);
        
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        
        for(int[] interval : intervals) {
            int val = interval[2] + dp.floorEntry(interval[0]).getValue();
            if(val > dp.lastEntry().getValue()) {
                dp.put(interval[1], val);
            }
        }
        
        return dp.lastEntry().getValue();
        
    }
}