package com.bootcamp.demo;
// method A -> method B
// methid B -> sum()
// sum() -> method C
// even if there's a slight change in sum(), it may cause changes in other methods that link to it.
// perform impact analysis aaccording to the dependency relationship during call flow
// re-run the test cases of related methods
// they should remain successful

public class Calculator {
    // if the sum() is altered, methodB is impacted. But it may be unknown since no test case was designed on methodB from the beginning.
    // so it is essential to have the test cases ready from Day 1.
    public static int methodB(int a) {
        return a + sum(a, a + 2);
    
    }

    public static int sum(int x, int y) {
        // return x + y; // Day 1
        return x + y + 1; // Day 2
    }

    public static int sum2(int x, int y) {
        // return x + y; // Day 1
        return x + y; // Day 2
    }
}
