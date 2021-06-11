public class Exercise12 {
    public double sqrt(int a) {
        final double E = 0.0001;
        double fn = a;
        while (fn * fn - a > E)
            fn = a / (2 * fn) + fn / 2;
        return fn;
    }
}
