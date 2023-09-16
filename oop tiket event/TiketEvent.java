class TiketEvent {
  // Deklarasi atrribut //Properties dari class TiketEvent
  private String tiket_id;
  private String namaPembeli;
  private int event;
  private int jumlahTiket;

  // Konstruktor //Constructur
  public TiketEvent() {
    tiket_id = "MOCHALLATE";
    namaPembeli = null;
    event = 0;
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
    return (event);
  }

  public int getJumlahTiket() {
    return (jumlahTiket);
  }

  public String getNamaEvent(int index) {
    String namaEvent[] = new String[5];
    namaEvent[0] = "JKT48";
    namaEvent[1] = "FRIENDLY MATCH (MANCHESTER CITY VS INDONESIA)";
    namaEvent[2] = "UNINDRA SUMMER FEST";
    namaEvent[3] = "DEPOK M";
    namaEvent[4] = "MPL ID S12 (RRQ VS EVOS)";

    // Get All Tiket Event
    if (index != -1) {
      return (namaEvent[index]);
    }

    return (namaEvent[event - 1]);
  }

  public String[] getDetailEvent(int index) {
    String[][] detailEvent = new String[2][5];

    detailEvent[0][0] = "7 Mei 2024";
    detailEvent[0][1] = "7 april 2024";
    detailEvent[0][2] = "7 april 2024";
    detailEvent[0][3] = "7 april 2024";
    detailEvent[0][4] = "7 april 2024";

    detailEvent[1][0] = "JAKARTA";
    detailEvent[1][1] = "JAKARTA";
    detailEvent[1][2] = "JAKARTA";
    detailEvent[1][3] = "JAKARTA";
    detailEvent[1][4] = "JAKARTA";

    // Get All Detail Tiket
    if (index != -1) {
      return new String[] { detailEvent[0][index], detailEvent[1][index] };
    }

    // Find Detail Tiket Event Where ID Event = ID Detail Event
    return new String[] { detailEvent[0][event - 1], detailEvent[1][event - 1] };
  }

  public int getHargaTiket(int index) {
    int harga[] = new int[5];
    harga[0] = 100;
    harga[1] = 200;
    harga[2] = 300;
    harga[3] = 400;
    harga[4] = 500;

    if (index != -1) {
      return (harga[index]);
    }

    return (harga[event - 1]);
  }

  // Mutator //Setter
  public void setIdTiket(String tiket_id) {
    this.tiket_id = tiket_id;
  }

  public void setNamaPembeli(String namaPembeli) {
    this.namaPembeli = namaPembeli;
  }

  public void setEvent(int event) {
    this.event = event;
  }

  public void setJumlahTiket(int jumlahTiket) {
    this.jumlahTiket = jumlahTiket;
  }
}