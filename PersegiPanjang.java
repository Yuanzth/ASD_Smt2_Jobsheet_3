/**
 * PersegiPanjang
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public void cetakInfo() {
        System.out.println("Panjang: " + panjang + ", Lebar: " + lebar);
    }
    public void hitungLuas() {
        int luas = panjang * lebar;
        System.out.println("Luas: " + luas);
    }
    public void hitungKeliling() {
        int keliling = 2 * (panjang + lebar);
        System.out.println("Keliling: " + keliling);
    }
    public PersegiPanjang(int p, int l){
        panjang = p;
        lebar = l;
    }
}