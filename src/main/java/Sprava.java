import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sprava {
    /**
     * Instance scanneru
     */
    Scanner scanner = new Scanner(System.in, "UTF8");
    /**
     * Kolekce s pojištěnci
     */
    List<Pojistenec> pojistenci = new ArrayList<>();
    /**
     * Jméno a příjmení pojištěnce
     */
    private String jmeno, prijmeni;
    /**
     * Věk pojištěnce
     */
    private int vek;
    /**
     * Telefonní číslo pojištěnce
     */
    private long telCislo;

    /**
     * Metoda pro přidání pojištěnce do kolekce
     */
    public void pridejPojistence() {
        System.out.println("Zadejte jmého pojištěného:");
        jmeno = scanner.nextLine();
        System.out.println("Zadejte príjmení:");
        prijmeni = scanner.nextLine();
        System.out.println("Zadejte telefonní číslo:");
        telCislo = Long.parseLong(scanner.nextLine());
        System.out.println("Zadejte Věk:");
        vek = Integer.parseInt(scanner.nextLine());
        if(jmeno.equals("") || prijmeni.equals("")) {
            System.out.println("Jméno a příjmení musí být vyplněny. Opakujteb akci");
            return;
        }
        pojistenci.add(new Pojistenec(jmeno, prijmeni, telCislo, vek));
        System.out.println("Pojištěnec byl uložen");

    }

    /**
     * Metoda pro vypsání všech pojištěnců v kolekci
     */
    public void vypisPojistence() {
        for(Pojistenec pojistenec: pojistenci) {
            System.out.println(pojistenec);
        }
    }

    /**
     * Metoda pro vyhledání konkrétního pojištěnce
     */
    public void vyhledejPojistence() {
        System.out.println("Zadej jméno pojištěnce:");
        jmeno = scanner.nextLine();
        System.out.println("Zadej příjmení:");
        prijmeni = scanner.nextLine();
        for(Pojistenec pojistenec: pojistenci) {
            if(pojistenec.getJmeno().toLowerCase().equals(jmeno.toLowerCase()) && pojistenec.getPrijmeni().toLowerCase().equals(prijmeni.toLowerCase())) {
                System.out.println(pojistenec);
            }
            else {
                System.out.println("Pojištěnec s tímto jménem v systému není");
            }
        }
    }
}
