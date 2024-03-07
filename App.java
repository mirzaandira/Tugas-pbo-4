public class App {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        Segitiga segitiga = new SegitigaSikuSiku(3, 4);
        Lingkaran lingkaran = new Lingkaran(2);

        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
    }
}
