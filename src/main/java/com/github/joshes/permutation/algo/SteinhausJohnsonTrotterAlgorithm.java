package com.github.joshes.permutation.algo;

/**
 * Steinhaus Johnson Trotter Algorithm - O(N) complexity
 * See: https://en.wikipedia.org/wiki/Steinhaus%E2%80%93Johnson%E2%80%93Trotter_algorithm
 */
final class SteinhausJohnsonTrotterAlgorithm implements Permutator {

    @Override
    public void permutate(String s, PermutationCallback callback) {
        if (s == null) {
            throw new IllegalArgumentException("Valid string is expected!");
        }
        // TODO implement
        throw new RuntimeException("Algorithm not implemented!");
    }
}
