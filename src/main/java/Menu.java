import java.util.Scanner;

public class Menu {
    /**
     * Instance scanneru
     */
    Scanner scanner = new Scanner(System.in, "UTF8");
    /**
     * Instance třídy pro správu uživatelů
     */
    Sprava sprava = new Sprava();
    /**
     * Číselná hodnota operace
     */
    private int prikaz;

    /**
     * Metoda pro vykreslení menu
     */
    public void zobarzMenu() {
        System.out.println("----------------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("----------------------------------");
        System.out.println("\n Vyberte si akci:");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
    }

    /**
     * Zpracování příkazu a zavolání příslušné metody
     */
    public void zpracujPrikaz() {
        prikaz = Integer.parseInt(scanner.nextLine());
        switch (prikaz) {
            case 1: sprava.pridejPojistence(); break;
            case 2: sprava.vypisPojistence(); break;
            case 3: sprava.vyhledejPojistence();break;
            case 4: return;
            default:
                System.out.println("Tato možnost neexistuje");
        }
    }
    public int getPrikaz() {
        return prikaz;
    }
}
