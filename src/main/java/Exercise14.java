import java.util.ArrayList;

public class Exercise14 {
    public String findAngelNumbers() {
        ArrayList<String> angelNumbers = new ArrayList<>();

        for (int n = 10; n <= 99999; n++) {
            int sum = 0;
            int tempN = n;
            int powNumber = 0;
            ArrayList<Integer> listNumber = new ArrayList<>();

            while (tempN > 0) {
                listNumber.add(tempN % 10);
                powNumber++;
                tempN /= 10;
            }

            for (Integer i : listNumber) {
                sum += Math.pow(i, powNumber);
            }

            if (sum == n) {
                angelNumbers.add(String.valueOf(n));
            }
        }

        return String.join(" ", angelNumbers);
    }
}