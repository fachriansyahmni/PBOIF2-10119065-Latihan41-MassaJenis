package pboif2.pkg10119065.latihan41.massajenis;
/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program perhitungan massa kubus 
 *                         dengan objek
 */
public class Kubus {
    private int sisi;
    private int massa;
    
    public int getSisi()
    {
        return sisi;
    }
    public void setSisi(int sisi)
    {
        this.sisi = sisi;
    }
    
    public int getMassa()
    {
        return massa;
    }
    public void setMassa(int massa)
    {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi)
    {
        return (int) Math.pow(parSisi,3);
    }
    public int hitungMassaJenis(int parMassa, int volume)
    {
        return parMassa/volume;
    }
}
