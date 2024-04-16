public class Pojistenec {
    /**
     * Jméno a příjmení pojištěnce
     */
    private String jmeno,prijmeni;
    /**
     * vek pojištěnce
     */
    private int vek;
    /**
     * Telefonní číslo pojištěnce
     */
    private long telCislo;

    /**
     * Konstruktor
     * @param jmeno
     * @param prijmeni
     * @param telCislo
     * @param vek
     */
    public Pojistenec(String jmeno, String prijmeni, long telCislo , int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telCislo = telCislo;
        this.vek = vek;
    }
    public String getJmeno() {
        return jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }
    public int getVek() {
        return vek;
    }

    public long getTelCislo() {
        return telCislo;
    }

    /**
     * Vypis údajů o pojištěnci
     * @return
     */
    @Override
    public String toString() {
        return jmeno + "  " + prijmeni + "  " + vek + "  " + telCislo;
    }
}
