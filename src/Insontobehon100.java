public class Insontobehon100 {
    static boolean checkPrime(int x) {
        if (x < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(" số nguyên tố bé hơn 100 là: ");
        for (int i = 0; i <= 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i + ",");
            }
        }
    }
}
