import java.util.Scanner;
public class sistemPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean kartuMahasiswa, registrasiOnline;

        System.out.print("Apakah anda membawa kartu mahasiswa? (true/false): ");
        kartuMahasiswa = sc.nextBoolean();

        System.out.print("Apakah anda sudah melakukan registrasi online? (true/false): ");
        registrasiOnline = sc.nextBoolean();

        if (kartuMahasiswa == true || registrasiOnline == true) {
            System.out.println("Boleh masuk");
        } else {
            System.out.println("Tidak boleh masuk");
        }
    }
}
