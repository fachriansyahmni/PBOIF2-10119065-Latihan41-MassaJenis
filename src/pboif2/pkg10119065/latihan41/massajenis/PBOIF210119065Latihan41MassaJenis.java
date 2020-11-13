package pboif2.pkg10119065.latihan41.massajenis;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program perhitungan massa kubus 
 *                         dengan objek
 */
public class PBOIF210119065Latihan41MassaJenis {
    
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("=== Massa Jenis Kubus ===");
        System.out.println("Sisi    : " + kubus.getSisi());
        System.out.println("Massa   : " + kubus.getMassa());
        System.out.println("\n=== Hasil Perhitungaan ===");
        System.out.println("Volume       : " + 125);
        System.out.println("Massa Jenis  : " + 2);
    }
    
}
