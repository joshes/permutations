package com.github.joshes.permutation.algo;

public interface Permutator {
    /**
     * Permutator interface. Represents a specific permutation algorithm.
     *
     * @param s        String to permutate
     * @param callback Callback to utilize when finding permutations
     */
    void permutate(String s, PermutationCallback callback);
}
