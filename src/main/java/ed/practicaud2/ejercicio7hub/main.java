
package ed.practicaud2.ejercicio7hub;


public class main {

    public static void main(String[] args) {
    
        for (int i = 0; i < 100; i++) {
            System.out.println(imprimir(i));
        }
    }

    
    public static String imprimir(int numero){
        if(numero%5==0 && numero%3==0)return "FizzBuzz";
        else if(numero%3==0)return "Fizz";
        else if(numero%5==0)return "Buzz";
        else return Integer.toString(numero);
    }

}
