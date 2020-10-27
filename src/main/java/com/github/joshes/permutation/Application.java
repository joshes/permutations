package com.github.joshes.permutation;

import com.github.joshes.permutation.algo.PermutatationAlgorithmFactory;
import com.github.joshes.permutation.algo.PermutationAlgorithm;

import java.util.Arrays;

public final class Application {

    private static final PermutationAlgorithm DefaultAlgorithm = PermutationAlgorithm.Heaps;

    private static void usage() {
        System.out.println("Usage: ./gradlew run string [algo]");
        System.out.println("  string        String intended to permutate");
        System.out.println("  algo          Optional algorithm name to use in permutation");
        System.out.println();
        System.out.println("Available algorithms: " + Arrays.toString(PermutationAlgorithm.values()));
        System.out.println();
    }

    /**
     * Entry point
     *
     * @param args String args, see `usage()` for expectations
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            usage();
            System.exit(0);
        }

        PermutationAlgorithm algo = DefaultAlgorithm;

        try {
            if (args.length > 1) {
                algo = PermutationAlgorithm.valueOf(args[1]);
            }
        } catch (IllegalArgumentException | NullPointerException ex) {
            System.err.printf("Algorithm `%s` not found - running with default algorithm%n", args[1]);
        }

        PermutatationAlgorithmFactory
                .get(algo)
                .permutate(args[0], System.out::println);
    }
}
