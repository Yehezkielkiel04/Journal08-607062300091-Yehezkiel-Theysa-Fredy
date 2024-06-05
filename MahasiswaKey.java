import java.util.Objects;

public class MahasiswaKey {
    private String NIM;
    private String kelas;
    private String nama;

    public MahasiswaKey(String NIM, String kelas, String nama) {
        this.NIM = NIM;
        this.kelas = kelas;
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public String getKelas() {
        return kelas;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MahasiswaKey that = (MahasiswaKey) o;
        return NIM.equals(that.NIM) && kelas.equals(that.kelas) && nama.equals(that.nama);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NIM, kelas, nama);
    }

    @Override
    public String toString() {
        return "NIM: " + NIM + ", Kelas: " + kelas + ", Nama: " + nama;
    }
}
