package arraysproblems;

import java.util.*;

public class TwoSum {

    // =========================
    // 1️⃣ Brute Force (first pair)
    // =========================
    public int[] twoSumBruteForce(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // =========================
    // 2️⃣ HashMap Approach (first pair, unsorted array)
    // =========================
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    // =========================
    // 3️⃣ Two Pointer Approach (sorted array, first pair)
    // =========================
    public int[] twoSumTwoPointer(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{left, right};
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    // =========================
    // 4️⃣ All pairs (unsorted, use HashSet to avoid duplicates)
    // =========================
    public List<int[]> twoSumAllPairs(int[] nums, int target){
        List<int[]> result = new ArrayList<>();
        Set<String> seen = new HashSet<>(); // to avoid duplicates

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    // store as "min,max" to prevent duplicate pairs
                    int a = Math.min(i,j);
                    int b = Math.max(i,j);
                    String key = a + "," + b;
                    if(!seen.contains(key)){
                        result.add(new int[]{a,b});
                        seen.add(key);
                    }
                }
            }
        }
        return result;
    }

    // =========================
    // 5️⃣ Count number of pairs (frequency map)
    // =========================
    public int twoSumCountPairs(int[] nums, int target){
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for(int num : nums){
            int need = target - num;
            if(freq.containsKey(need)){
                count += freq.get(need); // add all occurrences
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    // =========================
    // Main method to test
    // =========================
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

        int[] nums = {1, 6, 2, 10, 3};
        int target = 7;

        System.out.println("Brute Force: " + Arrays.toString(ts.twoSumBruteForce(nums, target)));
        System.out.println("HashMap: " + Arrays.toString(ts.twoSumHashMap(nums, target)));

        // For two-pointer, array must be sorted
        int[] sortedNums = {1, 2, 3, 6, 10};
        System.out.println("Two Pointer (sorted): " + Arrays.toString(ts.twoSumTwoPointer(sortedNums, target)));

        // All pairs (unsorted)
        List<int[]> allPairs = ts.twoSumAllPairs(nums, target);
        System.out.print("All Pairs: ");
        for(int[] pair : allPairs){
            System.out.print(Arrays.toString(pair) + " ");
        }
        System.out.println();

        // Count of pairs
        int countPairs = ts.twoSumCountPairs(nums, target);
        System.out.println("Count of Pairs: " + countPairs);
    }
}