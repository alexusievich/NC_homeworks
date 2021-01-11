package com.mycompany.HorstmannTasks.InterfLambdaExpr;

public interface IntSequence {
    int next();

    default boolean hasNext() {
        return true;
    }

    static IntSequence of(int... numbers) {
        return new IntSequence() {
            private int counter = 0;

            public boolean hasNext() {
                return counter < numbers.length;
            }

            public int next() {
                counter++;
                return numbers[counter - 1];
            }
        };
    }

    static IntSequence constant(int value) {
        return () -> value;
    }
}

