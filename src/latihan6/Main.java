package latihan6;

public class Main {
    
    public static void main(String[] args) {
        
        Karyawan k = new Karyawan(7);
        SoftwareEngineer s = new SoftwareEngineer(7);
        ProjectManager p = new ProjectManager(12);
        
        System.out.println("--- Karwayan ---");
        k.cetak();
        
        System.out.println("\n--- Software Engineer ---");
        s.cetak();
        
        System.out.println("\n--- Programmer ---");
        p.cetak();
    }
    
}
