class Solution {
    // Returns the number of students that need to be removed
    // to form the longest increasing subsequence in the given array
    public int removeStudents(int[] H, int N) {
        // Calculate the length of the longest increasing subsequence
        int longIncSubLength = fun(H, N);
        
        // Return the number of students that need to be removed
        return N - longIncSubLength;
    }
    
    // Performs a binary search to find the index of the smallest element
    // in the given array that is greater than or equal to the given key element
    int binary(int b[], int l, int h, int key) {
        while(l<h) {
            int mid = (l+h)/2;
            if(b[mid]<key) {
                l = mid+1;
            }
            else {
                h = mid;
            }
        }
        return l;
    }
    
    // Returns the length of the longest increasing subsequence in the given array
    int fun(int H[], int n) {
        // Initialize the array that will store the longest increasing subsequence
        int b[] = new int[n];
        b[0] = H[0];
        
        // Initialize the length of the longest increasing subsequence
        int longIncSubLength = 1;
        
        // Iterate over the elements of the input array
        for(int i=1; i<n; i++) {
            // If the current element is greater than the last element of the longest increasing subsequence
            if(H[i]>b[longIncSubLength-1]) {
                // Append the element to the end of the longest increasing subsequence
                b[longIncSubLength++] = H[i];
            }
            // If the current element is not greater than the last element of the longest increasing subsequence
            else {
                // Find the index where the element should be inserted to maintain the increasing order
                int insertIndex = binary(b, 0, longIncSubLength, H[i]);
                // Insert the element at the appropriate index
                b[insertIndex] = H[i];
            }
        }
        
        // Return the length of the longest increasing subsequence
        return longIncSubLength;
    }
};



