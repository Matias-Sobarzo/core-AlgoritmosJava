package clases;

public class Algoritmos {

    public static boolean esPar(int par){
        if ( (par & 1) == 0 ) {
            return true; 
        }else{ 
            return false; 
        }
    }

    public static boolean esPrimo(int primo){
        if (primo <= 1) return false;
        for(int i = 2; i < primo; i++){
            if (primo % i ==0)
            return false;
        }
        return true;
    }

    public static String stringEnReversa(String reversa){
        String inversa = "";
        char[] resultdoArray =reversa.toCharArray();
        for (int i = resultdoArray.length - 1; i >= 0; i--){
            inversa += reversa.charAt(i);
        };
        return inversa;
    }


    public static boolean esPalindromo(String palindromo){
        String palindro = "";
        char[] resultdoArray =palindromo.toCharArray();
        for (int i = resultdoArray.length - 1; i >= 0; i--){
            palindro += palindromo.charAt(i);
        };
        return palindromo.equals(palindro);
        
    }

    public static void secuenciaFizzBuzz(int secuencia){
        for(int i = 1; i <= secuencia; i++){
            if(i% 3 == 0 && i% 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i% 3 == 0){
                System.out.println("Fizz");
            }else if(i% 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i + " ");
            }
        }
    }

}
