package latihan6;

public class ProjectManager extends SoftwareEngineer {

    private int bonusAp;

    public ProjectManager(int mskrja) {
        super(mskrja);
    }

    public ProjectManager(int mskrja, int ap) {
        super(mskrja);
        bonusAp = ap;
    }

    @Override
    public int getTunjangan() {
        return super.getTunjangan() + 500000; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getBonus() {
        if (super.getMasaKerja() >= 10) {
            super.bonus = 700000;
        } else {
            super.bonus = 450000;
        }
        return super.bonus; //To change body of generated methods, choose Tools | Templates.
    }

    public int getBonusAp() {
        if (super.getMasaKerja() >= 10) {
            bonusAp = 700000;
        } else {
            bonusAp = 450000;
        }
        return bonusAp;
    }

    @Override
    public void cetak() {
        int total = getGaji() + getBonus() + getBonusAp() + getTunjangan();

        System.out.println("Gaji Pokok: " + getGaji());
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("Bonus: " + getBonus());
        System.out.println("Bonus Apresiasi: " + getBonusAp());
        System.out.println("Tunjangan :" + getTunjangan());
        System.out.println("Total : " + total); //To change body of generated methods, choose Tools | Templates.
    }
}
