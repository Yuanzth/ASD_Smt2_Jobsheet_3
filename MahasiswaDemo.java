import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] arrayMahasiswa = new Mahasiswa[3];
        double totalIPK = 0;

        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // Clear the scanner buffer

            arrayMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
            totalIPK += ipk;
        }

        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa mahasiswa : arrayMahasiswa) {
            mahasiswa.cetakInfo();
            System.out.println();
        }

        double rataRataIPK = totalIPK / arrayMahasiswa.length;
        System.out.println("\nRata-rata IPK: " + rataRataIPK);
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private char jenisKelamin;
    private double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Nilai IPK: " + ipk);
    }
}