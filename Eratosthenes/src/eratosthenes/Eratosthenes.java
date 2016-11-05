package eratosthenes;

/**
 *
 * @author maamiranda
 */
public class Eratosthenes {

public static void main(String[] args) {
        for (int a = 1; a < 50; a++) {
            if (a % 2 != 0 && a % 3 != 0 && a%5!=0) {
                System.out.println(a);
            } else {
                System.out.println(" ");
            }

        }
    }

}  