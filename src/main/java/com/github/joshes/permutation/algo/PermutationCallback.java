package com.github.joshes.permutation.algo;

public interface PermutationCallback {
    /**
     * Callback invoked when a new permuation is found
     *
     * @param s Permutation string
     */
    void onPermutationFound(String s);
}
