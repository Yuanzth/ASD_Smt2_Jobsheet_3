import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        int panjang, lebar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlah = sc.nextInt();
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Persegi Panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();
            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Persegi panjang ke-" + (i + 1) + ", ");
            arrayOfPersegiPanjang[i].cetakInfo();
            arrayOfPersegiPanjang[i].hitungLuas();
            arrayOfPersegiPanjang[i].hitungKeliling();
        }
    }
}