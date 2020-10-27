package com.github.joshes.permutation.algo;

/**
 * Heaps Algorithm - O(N!) complexity
 * See: https://en.wikipedia.org/wiki/Heap%27s_algorithm
 */
final class HeapsAlgorithm implements Permutator {

    /**
     * Swap two values in an array.
     *
     * @param arr Array
     * @param p1  Position 1
     * @param p2  Position 2
     */
    private void swap(String[] arr, int p1, int p2) {
        String b = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = b;
    }

    /**
     * Recursive Heap implementation
     *
     * @param k   Position in arr
     * @param arr Array
     * @param cb  Callback
     */
    private void generate(int k, String[] arr, PermutationCallback cb) {
        if (k == 1) {
            cb.onPermutationFound(String.join("", arr));
        } else {
            // Generate permutations with kth unaltered
            // Initially k == length(A)
            generate(k - 1, arr, cb);
            // Generate permutations for kth swapped with each k-1 initial
            for (int i = 0; i < k - 1; i += 1) {
                // Swap choice dependent on parity of k (even or odd)
                if (k % 2 == 0) {
                    swap(arr, i, k - 1); // zero-indexed, the kth is at k-1
                } else {
                    swap(arr, 0, k - 1);
                }
                generate(k - 1, arr, cb);
            }
        }
    }

    @Override
    public void permutate(String s, PermutationCallback callback) {
        if (s == null) {
            throw new IllegalArgumentException("Valid string is expected!");
        }
        generate(s.length(), s.split(""), callback);
    }
}
