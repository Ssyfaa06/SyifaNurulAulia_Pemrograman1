package p9;

abstract class MakhlukHidup {
    public void bernapas() {
        System.out.println("Sedang bernapas...");
    }
     public void makan() {
        System.out.println("Sedang makan...");
     }
     public abstract void bergerak();

}

class Orang extends MakhlukHidup {
     public void bergerak() {
        System.out.println("Orang berjalan dengan 2 kaki");
     }
}

class Babi extends MakhlukHidup {
    public void bergerak() {
        System.out.println("Babi berjalan dengan 4 kaki");
    }
}

class Institusi {
      protected String nama;
    protected String alamat;
    protected String kontak;
    protected String kategori;

    public Institusi(String nama, String alamat, String kontak, String kategori) {
        this.nama = nama;
        this.alamat = alamat;
        this.kontak = kontak;
        this.kategori = kategori;
    }

    public String tampilData() {
         return "Nama: " + nama +
               "\nAlamat: " + alamat +
               "\nKontak: " + kontak +
               "\nKategori: " + kategori;
    }
}

class Kampus extends Institusi {
    public Kampus(String nama, String alamat, String kontak, String kategori) {
        super(nama, alamat, kontak, kategori);
    }
}

class Sekolah extends Institusi {
    public Sekolah(String nama, String alamat, String kotak, String katagori) {
        super(nama, alamat, kotak, katagori);
    }
}

public class Latihan2_p9 {
    public static void main(String[] args) {
        
        Orang orang = new Orang();
        Babi babi = new Babi();

        System.out.println("...Orang...");
        orang.bernapas();
        orang.makan();
        orang.bergerak();

        System.out.println("\n...Babi...");
        babi.bernapas();
        babi.makan();
        babi.bergerak();

        Kampus kampus = new Kampus(
            "Universitas Peliita Harapan",
            "Jl.karawaci",
            "0234211111",
            "Kampus"
        );

        Sekolah sekolah = new Sekolah(
            "SMA Negri 11 Tangerang",
            "Jl. sepatan",
            "2124611111",
            "Sekolah"
        );

        System.out.println("\n...Institusi...");
        System.out.println(kampus.tampilData());
        System.out.println();
        System.out.println(sekolah.tampilData());
    }

}