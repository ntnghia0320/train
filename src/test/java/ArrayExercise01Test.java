import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExercise01Test {
    ArrayExercise01 exercise01 = new ArrayExercise01();

    @Test
    public void test_findDoubleNumber() {
        assertEquals(exercise01.findDoubleNumber(new int[]{2, 1, 1, 2, 3}), "1 2");
        assertEquals(exercise01.findDoubleNumber(new int[]{1, 2, 1, 3, 3, 4, 9, 0, 0, 0}), "0 1 3");
    }
}
