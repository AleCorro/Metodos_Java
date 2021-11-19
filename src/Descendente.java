public class Descendente {

    public static void Ascendente(float num1, float num2) {

        if (num1 < num2) {
            System.out.println("El orden ascendente es el siguiente: " + num1 + ";" + num2);
        } else {
            System.out.println("El orden ascendente es el siguiente: " + num2 + ";" + num1);
        }
    }

        public static void main (String[] args) {

            float num1 = 5.8f;
            float num2 = 5.85f;
            Ascendente(num1, num2);
        }
    }
