class Solution {
	static long countPairs(int n, int[] arr, int k) {
    long count = 0;
    long[] rem = new long[k];

    for (int x : arr) {
        rem[(x + k) % k]++;
    }

    for (long r : rem) {
        count += ((r - 1) * r) / 2;
    }
    return count;
	}
}