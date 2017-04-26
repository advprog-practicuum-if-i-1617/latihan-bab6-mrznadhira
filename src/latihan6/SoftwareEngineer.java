package latihan6;

public class SoftwareEngineer extends Karyawan {

    private int tunjangan;

    public SoftwareEngineer(int mskrja) {
        super(mskrja);
    }

    public SoftwareEngineer(int mskrja, int tjg) {
        super(mskrja);
        tunjangan = tjg;
    }

    public int getTunjangan() {
        tunjangan = 5500000;
        return tunjangan;
    }

    @Override
    public int getBonus() {
        super.bonus = 300000;
        return super.bonus; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cetak() {
        int total = getGaji() + getBonus() + getTunjangan();

        System.out.println("Gaji Pokok: " + getGaji());
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("Bonus: " + getBonus());
        System.out.println("Tunjangan :" + getTunjangan());
        System.out.println("Total : " + total);
    }
}
