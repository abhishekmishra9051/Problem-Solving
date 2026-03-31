package arraysproblems;

import java.util.Arrays;

public class LowerBound {

    // 1️. Binary Search Approach (Optimal)
    public int lowerBoundBinarySearch(int[] nums, int x) {
        if (nums == null || nums.length == 0) return 0;  // edge case for empty array
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // find mid

            if (nums[mid] < x) {  // If mid element is less than x, move left pointer
                left = mid + 1;
            } else {  // If mid element is >= x, move right pointer
                right = mid - 1;
            }
        }

        return left;  // position where x can be inserted
    }

    // 2️⃣ Naive Approach (Brute Force)
    public int lowerBoundNaive(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= x) {
                return i;  // first element greater than or equal to x
            }
        }
        return nums.length;  // if no such element, return the length (position to insert)
    }

    // 3️. Ternary Search Approach (Alternative to Binary Search)
    public int lowerBoundTernary(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (nums[mid1] >= x) {
                right = mid1 - 1;
            } else if (nums[mid2] < x) {
                left = mid2 + 1;
            } else {
                right = mid2 - 1;
            }
        }
        return left;  // return the position to insert x
    }

    // 4️. Using Java's Arrays.binarySearch() method
    public int lowerBoundWithBinarySearch(int[] nums, int x) {
        int index = Arrays.binarySearch(nums, x);
        if (index < 0) {
            return -(index + 1);  // If element is not found, return the insertion point
        }
        return index;  // If element is found, return its index
    }

    // 5️. Two-pointer approach (with sorting)
    public int lowerBoundTwoPointer(int[] nums, int x) {
        Arrays.sort(nums);  // First sort the array
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;  // return the position to insert x
    }

    // Testing all approaches
    public static void main(String[] args) {
        LowerBound lb = new LowerBound();

        int[] nums = {1, 3, 5, 7, 9};

        int x = 6;

        System.out.println("Binary Search Approach: " + lb.lowerBoundBinarySearch(nums, x));
        System.out.println("Naive Approach: " + lb.lowerBoundNaive(nums, x));
        System.out.println("Ternary Search Approach: " + lb.lowerBoundTernary(nums, x));
        System.out.println("Using Arrays.binarySearch(): " + lb.lowerBoundWithBinarySearch(nums, x));
        System.out.println("Two-pointer Approach (with sorting): " + lb.lowerBoundTwoPointer(nums, x));
    }
}
