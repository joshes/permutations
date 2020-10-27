package com.github.joshes.permutation.algo;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

abstract class PermutationAlgorithmTest {
    abstract Permutator getAlgorithm();

    static class Callback implements PermutationCallback {

        private final Set<String> permutations = new HashSet<>();

        @Override
        public void onPermutationFound(String s) {
            permutations.add(s);
        }

        public Set<String> getPermutations() {
            return permutations;
        }
    }

    @Test
    public void testCase1() {
        final Callback callback = new Callback();
        final String input = "DOG";
        final Set<String> expected = Set.of("GOD", "OGD", "DOG", "GDO", "ODG", "DGO");
        getAlgorithm().permutate(input, callback);
        Assert.assertEquals(expected, callback.getPermutations());
    }
}
