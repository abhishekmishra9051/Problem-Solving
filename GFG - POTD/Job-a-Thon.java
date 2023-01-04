
// Toggle

class Solution {
    public static int toggle(int n, int[] arr) {
        int i = 0;
        int ma = 0;
        int lone = 0;
        while (i < n) {
            if (arr[i] == 1) {
                lone++;
                i++;
            } else {
                int zero = 0;
                int j = i;
                while (j < n && arr[j] == 0) {
                    zero++;
                    j++;
                }
                int rone = 0;
                i = j;
                while (j < n && arr[j] == 1) {
                    rone++;
                    j++;
                }
                ma = Math.max(ma, zero + lone + rone);
                lone = 0;
            }
        }
        ma = Math.max(ma, lone);
        return ma;
    }
}


// Geek & Geekina Purchasing Ice Cream  

class Solution {
    static long findGoodPairs(int[] a, int n, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        for (int i = k; i < n; i++) {
            map.put(a[i - k], map.getOrDefault(a[i - k], 0) + 1);
            ans += map.getOrDefault(a[i], 0);
        }
        return ans;
    }
}


// Maximum Points Covered 

class Solution {
    static int maximumpoints(int[][] arr, int n, int x, int y) {
        final int N = 1000 + 2;
        int[][] a = new int[N][N];
        for (int[] p : arr) {
            a[p[0]][p[1]]++;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {
                a[i][j] = a[i][j] + a[i - 1][j] + a[i][j - 1] - a[i - 1][j - 1];
            }
        }
        int ans = 0;
        for (int i = x + 1; i < N; i++) {
            for (int j = y + 1; j < N; j++) {
                int count = a[i][j] - a[i - x - 1][j] - a[i][j - y - 1] + a[i - x - 1][j - y - 1];
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
