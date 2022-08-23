package LAMBDA.Lambda_universite;

public class Universite {
    private String universite;
    private String bolum;
    private int ogrenciSayisi;
    private int notOrt;

    public Universite() {
    }

    public Universite(String universite, String bolum, int ogrenciSayisi, int notOrt) {
        this.universite = universite;
        this.bolum = bolum;
        this.ogrenciSayisi = ogrenciSayisi;
        this.notOrt = notOrt;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "universite='" + universite + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrenciSayisi=" + ogrenciSayisi +
                ", notOrt=" + notOrt +
                '}';
    }
}
