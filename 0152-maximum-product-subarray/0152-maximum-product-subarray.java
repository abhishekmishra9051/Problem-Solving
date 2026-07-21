class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prod1=1;
        for(int i=0; i<nums.length; i++){
            prod1*=nums[i];
            max = Math.max(prod1, max);
            if(prod1==0) prod1=1;
        }
        prod1=1;
        for(int i=nums.length-1; i>=0; i--){
            prod1*=nums[i];
            max = Math.max(prod1, max);
            if(prod1==0) prod1=1;
        }
        return max;
    }
}