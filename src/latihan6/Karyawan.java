package latihan6;

public class Karyawan {

    protected int gajiPokok;
    protected int bonus;
    private int masaKerja;

    public Karyawan(int mskrja) {
        masaKerja = mskrja;
        gajiPokok = 2500000;
    }

    public int getGaji() {
        return gajiPokok;
    }

    public void setBonus(int b) {
        bonus = b;
    }

    public void setMasaKerja(int m) {
        masaKerja = m;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public int getBonus() {
        if (getMasaKerja() >= 5) {
            bonus = 500000;
        } else {
            bonus = 0;
        }
        return bonus;
    }

    public void cetak() {
        System.out.println("Gaji Pokok: " + getGaji());
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("Bonus: " + getBonus());
        System.out.println("Total : " + (getGaji() + getBonus()));
    }
}
