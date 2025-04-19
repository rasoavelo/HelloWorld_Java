import java.util.Scanner;

public class DevineNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre un nombre entre 1 et 100 : ");
        int nombre = scanner.nextInt();
        int secret = 50;
        if (nombre < 1 || nombre > 100) {
            System.out.println("Erreur : nombre invalide.");
        } else if (nombre == secret) {
            System.out.println("Bravo, tu as deviné le bon nombre !");
        } else if (nombre < secret) {
            System.out.println("Trop petit ! Essaie encore.");
        } else {
            System.out.println("Trop grand ! Essaie encore.");
        }

    }
}