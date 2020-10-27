package com.github.joshes.permutation.algo;

import org.junit.Assert;
import org.junit.Test;

public class PermutationAlgorithmFactoryTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailWithNullAlgorithm() {
        PermutatationAlgorithmFactory.get(null);
    }

    @Test
    public void shouldReturnValidPermutatorForAllKnownTypes() {
        for (PermutationAlgorithm algo : PermutationAlgorithm.values()) {
            Assert.assertNotNull(PermutatationAlgorithmFactory.get(algo));
        }
    }
}
