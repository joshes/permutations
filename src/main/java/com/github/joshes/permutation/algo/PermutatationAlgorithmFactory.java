package com.github.joshes.permutation.algo;

public final class PermutatationAlgorithmFactory {
    public static Permutator get(PermutationAlgorithm algo) {
        if (algo == null) {
            throw new IllegalArgumentException("Algorithm cannot be null");
        }
        return switch (algo) {
            case Heaps -> new HeapsAlgorithm();
            case SteinhausJohnsonTrotter -> new SteinhausJohnsonTrotterAlgorithm();
        };
    }
}
