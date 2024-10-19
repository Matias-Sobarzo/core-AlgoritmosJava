import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {
        int par = 20;
        int primo = 1999;
        String reversa = "java";
        String palindromo = "hola";
        System.out.println("¿El numero es par? " + Algoritmos.esPar(par));
        System.out.println("¿El numero es primo? " + Algoritmos.esPrimo(primo));
        System.out.println("La palabra al reves es: " + Algoritmos.stringEnReversa(reversa));
        System.out.println("¿La palabra es palindromo? " + Algoritmos.esPalindromo(palindromo));
        System.out.println("La secuencia es: ");
        Algoritmos.secuenciaFizzBuzz(20);
    }
}