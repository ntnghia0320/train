public class StringExercise08 {
    public boolean checkBarcode(String str) {
        int n = str.length();
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sumEven += Character.getNumericValue(str.charAt(i));
            } else {
                sumOdd += Character.getNumericValue(str.charAt(i));
            }
        }

        return (sumEven + 3 * sumOdd) % 10 == 0;
    }
}
