// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        double liczba1 = scanner.nextDouble();

        System.out.println("Podaj drugą liczbę:");
        double liczba2 = scanner.nextDouble();

        double suma = liczba1 + liczba2;
        double różnica = liczba1 - liczba2;
        double iloczyn = liczba1 * liczba2;
        double iloraz = liczba1 / liczba2;

        System.out.println("Suma: " + suma);
        System.out.println("Różnica: " + różnica);
        System.out.println("Iloczyn: " + iloczyn);
        System.out.println("Iloraz: " + iloraz);

        scanner.close();
    }
}

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}