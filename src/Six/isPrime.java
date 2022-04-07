package Six;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(73));
        System.out.println(isPrime(75));
        System.out.println(isPrime(-1));

    }

    public static boolean isPrime(int num) {
        int i = 2; // start at 2 for comparison since prime
        if (num <= 1) { // 1 & less is not prime
            return false;
        }
        while (i < 100000) {
            if (num % i == 0 && i != num) {
                return false;
            }
            i++;
        }
        return true;
    }
}
