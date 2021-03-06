import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayExercise13Test {
    ArrayExercise13 arrayExercise13 = new ArrayExercise13();

    @Test
    public void test_deleteRowColumn() {
        assertArrayEquals(arrayExercise13.deleteRowColumn(new int[][]{
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}}, 2, 2), new int[][]{
                        {1, 2},
                        {4, 5}});
        assertArrayEquals(arrayExercise13.deleteRowColumn(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}}, 1, 1), new int[][]{
                {1, 3},
                {7, 9}});
    }
}
