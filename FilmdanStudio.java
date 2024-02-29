import java.util.Scanner;

public class FilmdanStudio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah film dari user
        System.out.print("Masukkan jumlah film: ");
        int jumlahFilm = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        // Array of objects untuk menyimpan film
        Film[] films = new Film[jumlahFilm];

        // Input data film dari user
        for (int i = 0; i < jumlahFilm; i++) {
            System.out.println("Film ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Sinopsis: ");
            String sinopsis = scanner.nextLine();
            System.out.print("Durasi: ");
            int durasi = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            System.out.print("Rating: ");
            double rating = scanner.nextDouble();
            scanner.nextLine(); // consume newline character
            System.out.print("Waktu Tayang: ");
            String waktuTayang = scanner.nextLine();

            // Membuat objek film dan menyimpannya dalam array
            films[i] = new Film(judul, sinopsis, durasi, rating, waktuTayang);
        }

        // Menampilkan informasi film menggunakan foreach
        System.out.println("\nInformasi Film:");
        for (Film film : films) {
            film.printInfo();
            System.out.println();
        }

        // Input jumlah studio dari user
        System.out.print("\nMasukkan jumlah studio: ");
        int jumlahStudio = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        // Array of objects untuk menyimpan studio
        Studio[] studios = new Studio[jumlahStudio];

        // Input data studio dari user
        for (int i = 0; i < jumlahStudio; i++) {
            System.out.println("Studio ke-" + (i + 1));
            System.out.print("Nama Studio: ");
            String namaStudio = scanner.nextLine();
            System.out.print("Deskripsi: ");
            String deskripsi = scanner.nextLine();
            System.out.print("Harga: ");
            double harga = scanner.nextDouble();
            System.out.print("Jumlah Kursi: ");
            int jumlahKursi = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            System.out.print("Jadwal penayangan film: ");
            String jadwalPenayangan = scanner.nextLine();

            // Membuat objek studio dan menyimpannya dalam array
            studios[i] = new Studio(namaStudio, deskripsi, harga, jumlahKursi, jadwalPenayangan);
        }

        // Menampilkan informasi studio menggunakan foreach
        System.out.println("\nInformasi Studio:");
        for (Studio studio : studios) {
            studio.printInfo();
            System.out.println();
        }
    }
}

class Film {
    private String judul;
    private String sinopsis;
    private int durasi;
    private double rating;
    private String waktuTayang;

    public Film(String judul, String sinopsis, int durasi, double rating, String waktuTayang) {
        this.judul = judul;
        this.sinopsis = sinopsis;
        this.durasi = durasi;
        this.rating = rating;
        this.waktuTayang = waktuTayang;
    }

    public void printInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Durasi: " + durasi);
        System.out.println("Rating: " + rating);
        System.out.println("Waktu Tayang: " + waktuTayang);
    }
}

class Studio {
    private String namaStudio;
    private String deskripsi;
    private double harga;
    private int jumlahKursi;
    private String jadwalPenayangan;

    public Studio(String namaStudio, String deskripsi, double harga, int jumlahKursi, String jadwalPenayangan) {
        this.namaStudio = namaStudio;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jumlahKursi = jumlahKursi;
        this.jadwalPenayangan = jadwalPenayangan;
    }

    public void printInfo() {
        System.out.println("Nama Studio: " + namaStudio);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jadwal penayangan film: " + jadwalPenayangan);
    }
}
