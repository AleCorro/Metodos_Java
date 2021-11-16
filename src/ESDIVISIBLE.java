public class ESDIVISIBLE {

    public static boolean EsDivisible() {
        boolean EsDivisible = true;
        int n = 0;
        int m = 0;
        if (n % m != 0) {
            return false;
        }
        return EsDivisible;
    }

    public static void main (String[]args){
        int n = 10;
        int m = 5;
            if (n % m == 0) {
                System.out.println("Es divisible");
            } else {
                System.out.println("No es divisible");
            }
        }
    }
