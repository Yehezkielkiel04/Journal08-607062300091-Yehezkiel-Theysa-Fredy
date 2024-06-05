import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MahasiswaData {
    private Map<MahasiswaKey, Double> dataMahasiswa;

    public MahasiswaData() {
        dataMahasiswa = new HashMap<>();
    }

    public void tambahMahasiswa(MahasiswaKey key, double nilai) {
        dataMahasiswa.put(key, nilai);
    }

    public void hapusMahasiswa(MahasiswaKey key) {
        dataMahasiswa.remove(key);
    }

    public void tampilkanDataMahasiswa() {
        if (dataMahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            double totalNilai = 0;
            for (Map.Entry<MahasiswaKey, Double> entry : dataMahasiswa.entrySet()) {
                System.out.println(entry.getKey() + ", Nilai: " + entry.getValue());
                totalNilai += entry.getValue();
            }
            double rataRata = totalNilai / dataMahasiswa.size();
            System.out.println("Rata-rata nilai: " + rataRata);
        }
    }

    public static void main(String[] args) {
        MahasiswaData mahasiswaData = new MahasiswaData();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tambah mahasiswa");
            System.out.println("2. Hapus mahasiswa");
            System.out.println("3. Tampilkan data mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan NIM: ");
                    String NIM = scanner.nextLine();
                    System.out.print("Masukan Kelas: ");
                    String kelas = scanner.nextLine();
                    System.out.print("Masukan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukan Nilai: ");
                    double nilai = scanner.nextDouble();
                    scanner.nextLine();  
                    MahasiswaKey key = new MahasiswaKey(NIM, kelas, nama);
                    mahasiswaData.tambahMahasiswa(key, nilai);
                    break;
                case 2:
                    System.out.print("Masukan NIM: ");
                    NIM = scanner.nextLine();
                    System.out.print("Masukan Kelas: ");
                    kelas = scanner.nextLine();
                    System.out.print("Masukan Nama: ");
                    nama = scanner.nextLine();
                    key = new MahasiswaKey(NIM, kelas, nama);
                    mahasiswaData.hapusMahasiswa(key);
                    break;
                case 3:
                    mahasiswaData.tampilkanDataMahasiswa();
                    break;
                case 4:
                    System.out.println("Terimakasih:)");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
