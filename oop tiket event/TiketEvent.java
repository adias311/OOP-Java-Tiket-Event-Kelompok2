class TiketEvent {
  // Deklarasi atrribut //Properties dari class TiketEvent
  private String tiket_id;
  private String namaPembeli;
  private int event_id;
  private int jumlahTiket;

  // Konstruktor //Constructur
  public TiketEvent() {
    tiket_id = null;
    namaPembeli = null;
    event_id = 0;
    jumlahTiket = 0;
  }

  // Selector //Getter
  public String getIdTiket() {
    return (tiket_id);
  }

  public String getNamaPembeli() {
    return (namaPembeli);
  }

  public int getEvent() {
    return (event_id);
  }

  public int getJumlahTiket() {
    return (jumlahTiket);
  }

  public String getNamaEvent(int index) {
    String namaEvent[] = new String[5];
    namaEvent[0] = "JKT48 (PESTAPORA 2023)";
    namaEvent[1] = "FRIENDLY MATCH (MANCHESTER CITY VS INDONESIA)";
    namaEvent[2] = "UNINDRA SUMMER FESTIVAL";
    namaEvent[3] = "HEAD IN THE CLOUDS (HITC 2024)";
    namaEvent[4] = "MPL ID S12 (RRQ VS EVOS)";

    // Get All Tiket Event
    if (index != -1) {
      return (namaEvent[index]);
    }

    return (namaEvent[event_id - 1]);
  }

  public String[] getDetailEvent(int index) {
    String[][] detailEvent = new String[2][5];

    detailEvent[0][0] = "24 September 2023";
    detailEvent[0][1] = "30 Februari 2024";
    detailEvent[0][2] = "7 November 2023";
    detailEvent[0][3] = "19 april 2024";
    detailEvent[0][4] = "13 Oktober 2023";

    detailEvent[1][0] = "Gambir Expo, Jiexpo Kemayoran";
    detailEvent[1][1] = "Stadion Si Jalak Harupat, Kabupaten Bandung";
    detailEvent[1][2] = "Taman Impian Jaya Ancol, Jakarta Utara";
    detailEvent[1][3] = "Kawasan PIK 2, Jakarta Utara";
    detailEvent[1][4] = "Mahaka Square, Kelapa Gading, Jakarta Utara";

    // Get All Detail Tiket
    if (index > -1) {
      return new String[] { detailEvent[0][index], detailEvent[1][index] };
    }

    // Find Detail Tiket Event Where ID Event = ID Detail Event
    return new String[] { detailEvent[0][event_id - 1], detailEvent[1][event_id - 1] };
  }

  public double getHargaTiket(int index) {
    double harga[] = new double[5];
    harga[0] = 200000;
    harga[1] = 375000;
    harga[2] = 100000;
    harga[3] = 2500000;
    harga[4] = 150000;

    if (index > -1) {
      return (harga[index]);
    }

    return (harga[event_id - 1]);
  }

  // Mutator //Setter
  public void setIdTiket(String tiket_id) {
    this.tiket_id = tiket_id;
  }

  public void setNamaPembeli(String namaPembeli) {
    this.namaPembeli = namaPembeli;
  }

  public void setEvent(int event_id) {
    this.event_id = event_id;
  }

  public void setJumlahTiket(int jumlahTiket) {
    this.jumlahTiket = jumlahTiket;
  }

}