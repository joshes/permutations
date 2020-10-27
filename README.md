# Coding Exercise

Print all permutations of a string.
 
Write a Java program to print all permutations of a given String. For example, if given String is "GOD" then your program should print all 6 permutations of this string e.g. "GOD", "OGD", "DOG", "GDO", "ODG", and "DGO".

Notes:

- You have 24 hours to finish this exercise.
- The program should accept the input string as an argument.
- The program should produce the correct results.
- Provide unit test cases.
- Think through the solution and design it well.

## Implementation notes

This was implemented with the intention of implementing >1 algorithms but time was not available to complete.

The working algorithm is based on the Heaps Algorithm, see https://en.wikipedia.org/wiki/Heap%27s_algorithm for details. 

The second implementation was to be based on the Steinhaus Johnson Trotter Algorithm (more here: https://en.wikipedia.org/wiki/Steinhaus%E2%80%93Johnson%E2%80%93Trotter_algorithm) which can be implemented in O(N) time complexity as opposed to Heaps Algorithm which provides O(N!).

Overall, the design is using a Factory for instantiating the algorithm(s) and more-or-less a visitor pattern to manage variations in what to do when a permutation is discovered (e.g, sometimes we want to print, other times we want to collect and verify in the case of unit testing). 

## Running 

Validate by running tests.

```
./gradlew test
```

Run using `gradlew` using basic argument "GOD"

```
./gradlew run --args=GOD
```

Run using `gradlew` using basic argument "GOD" using a different algorithm.

```
# Expected to throw NotImplemented RuntimeException presently
./gradlew run --args="GOD SteinhausJohnsonTrotter"
```