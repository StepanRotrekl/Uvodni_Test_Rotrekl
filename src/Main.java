import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    List<Mazlicek> mazlicek = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    mazlicek.add(new Mazlicek("Baryk", "pes", 5, 25.5));
    mazlicek.add(new Mazlicek("Micka", "kocka", 8, 12.5));
boolean running = true;

while (running) {
    System.out.println("---------------MENU---------------");
    System.out.println("1. Pridat mazlicka");
    System.out.println("2. Vypsat vsechny mazlicky");
    System.out.println("3. Prumerny vek mazlicka");
    System.out.println("4. Najit mazlicka podle jmena");
    System.out.println("5. Filtrovat podle druhu");
    System.out.println("6. Ukoncit");


    int volba = scanner.nextInt();
    scanner.nextLine();

    switch (volba) {
        case 1 -> {
            System.out.println("Zadejte jmeno: ");
            String jmeno = scanner.nextLine();


            System.out.println("Zadejte druh: ");
            String druh = scanner.nextLine();


            System.out.println("Zadejte vek: ");
            int vek = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Zadejte vahu: ");
            double vaha = scanner.nextDouble();
            scanner.nextLine();
            mazlicek.add(new Mazlicek(jmeno, druh, vek, vaha));
        }
        case 2 -> {
            for (Mazlicek m : mazlicek)
                System.out.println(m);
        }

        case 3 -> {
            System.out.println("Prumerny vek mazlicka: " + SpravaMazlicku.vypocetPrumernehoVeku(mazlicek));

            System.out.println("Prumerna vaha: " + SpravaMazlicku.vypocetPrumerneVahy(mazlicek));

        }

        case 4 -> {
            System.out.println("Zadejte jmeno: ");
            String hledane = scanner.nextLine();
            Mazlicek nalezen = SpravaMazlicku.najdiMazlickaPodleJmena(hledane, mazlicek);

            if (nalezen != null) {
                System.out.println("Nalezen: " + nalezen);
            } else {
                System.out.println("Mazlicek nenalezen");
            }

        }

        case 5 -> {
            System.out.println("Zadejte druh: ");
            String druh = scanner.nextLine();
            Mazlicek filtrovani = SpravaMazlicku.filtrujMazlickyPodleDruhu(druh, mazlicek);
            if (filtrovani != null) {
                System.out.println("Nebyl nalezen zadni mazlicek");
            } else {
                for (Mazlicek m : mazlicek) {
                    System.out.println(m);
                }
            }

        }

        case 0 -> running = false;
        default -> System.out.println("Neplatna volba");

    }
}

        scanner.close();

    }
}