public class Nota {

 public static void significadoCalificaciones(int numero) {

     if (0 <= numero && numero < 3) {
         System.out.println("Muy Deficiente");
     } else if (3 <= numero && numero < 5) {
         System.out.println("Insuficiente");
     } else if (numero == 6) {
         System.out.println("Suficente");
     } else if (numero == 7) {
         System.out.println("Bien");
     } else if (7 <= numero && numero < 9) {
         System.out.println("Notable");
     } else if (numero == 10) {
         System.out.println("Sobresaliente");
     } else if (10 < numero) {
         System.out.println("Error");
     }
 }


 public static void main (String[] args) {

        byte numero = 3;
        significadoCalificaciones(numero);
        
    }
}
