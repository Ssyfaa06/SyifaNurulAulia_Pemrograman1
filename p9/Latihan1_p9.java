package p9;

interface Relation {
    public boolean isGreater(Object a, Object b);
    public boolean isLess(Object a, Object b);
    public boolean isEqual(Object a, Object b);
}

class Garis implements Relation {
    private double xAwal, yAwal, xAkhir, yAkhir;

    public Garis(double xAwal, double yAwal, double xAkhir, double yAkhir) {
        this.xAwal = xAwal;
        this.yAwal = yAwal;
        this.xAkhir = xAkhir;
        this.yAkhir = yAkhir;
    }

    public double hitungPanjang() {
        return Math.sqrt(Math.pow(xAkhir - xAwal, 2) + Math.pow(yAkhir - yAwal, 2));

    }
    @Override
    public boolean isGreater(Object a, Object b) {
        double panjangA = ((Garis) a).hitungPanjang();
        double panjangB = ((Garis) b).hitungPanjang();
        return panjangA > panjangB; // diperbaiki
    }
    @Override
    public boolean isLess(Object a, Object b) {
         double panjangA = ((Garis) a).hitungPanjang();
        double panjangB = ((Garis) b).hitungPanjang();
        return panjangA < panjangB; // benar
    }
    @Override
    public boolean isEqual(Object a, Object b) {
        double panjangA = ((Garis) a).hitungPanjang();
        double panjangB = ((Garis) b).hitungPanjang();
        return panjangA == panjangB; // diperbaiki
    }
}

public class Latihan1_p9 {
    public static void main(String[] args) {
        Garis g1 = new Garis(1, 2, 4, 6);
        Garis g2 = new Garis(2, 3, 8, 9);
        Garis g3 = new Garis(1, 2, 4, 6);

        System.out.println("Panjang garis A: " + g1.hitungPanjang());
        System.out.println("Panjang garis B: " + g2.hitungPanjang());
        System.out.println("Panjang garis C: " + g3.hitungPanjang());

        System.out.println("Garis A > Garis B: " + g1.isGreater(g1, g2));
        System.out.println("Garis A < Garis B: " + g1.isLess(g1, g2));
        System.out.println("Garis A == Garis C: " + g1.isEqual(g1, g3));
    }
}