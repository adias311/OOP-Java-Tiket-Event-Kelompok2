import java.io.*;
import java.util.Random;
import java.text.NumberFormat;
import java.util.Locale;

class PemesananTiketEvent {

  // Program utama
  public static void main(String[] args) {
    // Ciptakan objek
    TiketEvent tiket = new TiketEvent();

    // Penciptaan objek untuk pembacaan data dari keyboard
    InputStreamReader istream = new InputStreamReader(System.in);
    BufferedReader bufRead = new BufferedReader(istream);

    int evnt = 0;
    int jmlTiket = 0;
    String nmPembeli = "";
    final int index = -2;

    try {

      // Membersihkan layar
      System.out.print("\033[H\033[2J");
      System.out.flush();

      // Detail tiket event
      System.out.println("\u001B[32m==============|| Daftar List Pembelian Tiket Event ||==============\u001B[0m");

      for (int x = 0; x < 5; x -= -1) {
        System.out.println();
        System.out.println("\u001B[31m No." + (x + 1) + "\u001B[0m");
        System.out.println("  Nama Event    : " + tiket.getNamaEvent(x));
        System.out.println("  Harga Tiket   : "
            + NumberFormat.getCurrencyInstance(new Locale("id", "ID")).format(tiket.getHargaTiket(x)));
        System.out.println("  Tanggal Event : " + tiket.getDetailEvent(x)[0]);
        System.out.println("  Lokasi Event  : " + tiket.getDetailEvent(x)[1]);
      }

      // input data
      System.out.println();
      System.out.print("\u001B[33m Pilih Tiket Event (1-5) \u001B[0m  : ");
      String eventString = bufRead.readLine();
      evnt = Integer.parseInt(eventString);

      System.out.print("\u001B[33m Nama Pembeli \u001B[0m  : ");
      nmPembeli = bufRead.readLine();

      System.out.print("\u001B[33m Jumlah tiket \u001B[0m  : ");
      String jmlTiketString = bufRead.readLine();
      jmlTiket = Integer.parseInt(jmlTiketString);

      // Memeriksa jika nmPembeli kosong atau jmlTiket <= 0
      // Validasi input evnt harus angka 1-5
      if (nmPembeli.isEmpty() || jmlTiket <= 0 || evnt < 1 || evnt > 5) {
        System.out.println(
            "\u001B[31m Tidak dapat memproses pemesanan. \n Pastikan data yang dimasukan telah benar.\u001B[0m");
        return; // keluar dari program jika ada kesalahan input
      }

      // Membersihkan layar
      System.out.print("\033[H\033[2J");
      System.out.flush();

      // Manipulasi objek
      tiket.setEvent(evnt); // pilih tiket event
      tiket.setNamaPembeli(nmPembeli); // pilih tiket event
      tiket.setJumlahTiket(jmlTiket); // atur jumlah tiket

      // Membuat objek Random
      Random random = new Random();
      // Menghasilkan angka acak dengan 6 digit
      int randomNumber = random.nextInt(999999 - 100000 + 1) + 100000;
      // Mengonversi angka acak ke dalam bentuk string
      String randomSixDigit = String.valueOf(randomNumber);
      // generate ID tiket acak 6 digit
      tiket.setIdTiket("MOCHA" + randomSixDigit + "S");

      System.out.println("\u001B[32m==================|| Tiket Berhasil Di Cetak ||==================\u001B[0m");
      System.out.println();
      System.out.println(" ID Tiket     : \u001B[34m" + tiket.getIdTiket() + "\u001B[0m");
      System.out.println(" Nama Event   : " + tiket.getNamaEvent(index));
      System.out.println(" Nama Pembeli : " + tiket.getNamaPembeli());
      System.out.println(" Jumlah Tiket : " + tiket.getJumlahTiket() + " Tiket");
      System.out.println(" Tanggal      : " + tiket.getDetailEvent(index)[0]);
      System.out.println(" Lokasi       : " + tiket.getDetailEvent(index)[1]);
      System.out.println(" Total Harga  : " + NumberFormat.getCurrencyInstance(new Locale("id", "ID"))
          .format(tiket.getHargaTiket(index) * tiket.getJumlahTiket()));
      System.out.println();
      System.out.println("\u001B[32m=================================================================\u001B[0m");

    } catch (IOException err) {

      System.out.println("Proses pembacaan gagal!");

    } catch (NumberFormatException err) {

      System.out.println("Nilai input tidak valid!");

    }
  }
}