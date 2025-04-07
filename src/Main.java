import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean unos = false;

        while (!unos) {
            System.out.println("Upisite: ");

            try {
                String tekst = input.nextLine();
                int broj = Integer.parseInt(tekst);
                System.out.println(broj);
                unos = true;
            } catch (Exception e) {
                System.out.println("Unesen krivi format broja!");
            }
        }
        input.close();
    }
}
