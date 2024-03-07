public class SegitigaSikuSiku extends Segitiga {
    public SegitigaSikuSiku(double a, double b) {
        super(a, b, Math.hypot(a, b));
    }

    @Override
    public double hitungLuas() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
