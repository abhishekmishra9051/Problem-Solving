class Solution {
    // Compares two version numbers.
    // Returns:
    //  1  -> version1 is greater
    // -1  -> version2 is greater
    //  0  -> both versions are equal
    public int compareVersion(String version1, String version2) {

        // Split each version into its individual revision numbers.
        // Example:
        // "1.0.3" -> ["1", "0", "3"]
        // "1.0"   -> ["1", "0"]
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        // Compare until the longer version is fully processed.
        // Missing revisions are considered as 0.
        int maxLength = Math.max(v1.length, v2.length);

        for (int i = 0; i < maxLength; i++) {

            // Get the current revision number.
            // If one version has no revision at this index,
            // treat it as 0.
            int rev1 = (i < v1.length) ? Integer.parseInt(v1[i]) : 0;
            int rev2 = (i < v2.length) ? Integer.parseInt(v2[i]) : 0;

            // Compare the current revisions.
            if (rev1 > rev2)
                return 1;      // version1 is larger

            if (rev1 < rev2)
                return -1;     // version2 is larger

            // If both revisions are equal,
            // continue checking the next revision.
        }

        // All corresponding revisions are equal.
        return 0;
    }
}