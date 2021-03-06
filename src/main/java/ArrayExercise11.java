public class ArrayExercise11 {
    public int maxSumSubArray(int[] arr) {
        int max = arr[0];
        int maxCurrent = 0;

        for (int value : arr) {
            maxCurrent += value;
            if (max < maxCurrent) max = maxCurrent;
            if (maxCurrent < 0) maxCurrent = 0;
        }

        return max;
    }
}
