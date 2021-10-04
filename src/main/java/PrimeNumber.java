import org.apache.commons.math3.primes.Primes;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class PrimeNumber {

    public static void main(String[] args) {
        for (String arg : args) {
            try {
                if (Primes.isPrime(Integer.parseInt(arg))) {
                    System.out.println(arg + " - prime");
                } else {
                    System.out.println(arg + " - not prime");
                }
            } catch (NumberFormatException e) {
                System.out.println(arg + " - not a number!");
            }
        }
    }
}
