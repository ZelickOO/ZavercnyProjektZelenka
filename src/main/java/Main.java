public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        do {
            menu.zobarzMenu();
            menu.zpracujPrikaz();
        }while (menu.getPrikaz() != 4);
    }
}
