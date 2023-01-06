package semestralnapraca;

import java.util.Scanner;

/**
 * 8. Program, ktorý bude zadanú sadu bodov v 3D triediť podľa vzrastajúcej
 * vzdialenosti jednotlivých bodov od počiatku súradnicovej sústavy.
 *
 * @author Dominika.Strečanská
 * @version 0.1 21/12/22
 */
public class Semestralnapraca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean end = false;
        do {
            displayMenu();
            System.out.println("Zadaj volbu:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sempraca();
                    break;
                case 2: ;
                    vianocnauloha();
                    break;
                case 0:
                    end = true;
                    break;
                default:
                    System.out.println("Nevalidna volba");
            }
        } while (!end);

    }

    private static void displayMenu() {
        System.out.println("Ahoj, vitaj v semestralnej praci. Vyber si ulohu:");
        System.out.println("1. Semestralna praca");
        System.out.println("2. Vianocny projekt");
        System.out.println("0. Koniec");
    }

    public static void sempraca() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Pokracovat ve zpracovani (a/n):");
            String odpoved = sc.nextLine();
            odpoved = odpoved.toLowerCase();
            if (odpoved.equals("a")) {
                System.out.println("Zadej pocet bodu:");
                int n = sc.nextInt();
                Bod[] pole = new Bod[n];
                System.out.println("Zadej souradnice bodu:");
                for (int i = 0; i < n; i++) {
                    Bod b = new Bod(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                    pole[i] = b;
                }
                Bod swap;
                for (int j = 0; j < pole.length; j++) {
                    for (int i = 0; i < pole.length - 1; i++) {
                        if (pole[i].vzdialenost > pole[i + 1].vzdialenost) {
                            swap = pole[i];
                            pole[i] = pole[i + 1];
                            pole[i + 1] = swap;
                        }
                    }
                }
                System.out.println("Setridene body");
                for (int i = 0; i < pole.length; i++) {
                    pole[i].vypis();
                }
                sc.nextLine();
            } else if (odpoved.equals("n")) {
                return;
            }
        }
    }

    public static void vianocnauloha() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj velkost darceka");
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < x / 4; i++) {
            vypisZnak(' ', i);
            System.out.print('\\');
            vypisZnak(' ', x / 4);
            vypisZnak(' ', x + x / 4 - i - i - 2);
            System.out.println('/');
        }
        vypisZnak(' ', x / 4);
        vypisZnak('-', x);
        System.out.println();
        int a = y / 5 * 4;
        for (int i = 0; i < y; i++) {
            vypisZnak(' ', x / 4);
            System.out.print('|');
            if (i == a) {
                vypisZnak('-', x - 2);
            } else {
                vypisZnak(' ', x - 2);
            }
            System.out.println('|');
        }
        vypisZnak(' ', x / 4);
        vypisZnak('-', x);
        System.out.println();
        System.out.println("JEJDA!! Darcek je prazdny! Asi si neposluchal. Vesele Vianoce.");
        System.out.println();
    }

    static void vypisZnak(char c, int pocet) {
        for (int i = 0; i < pocet; i++) {
            System.out.print(c);
        }
    }
}