
package ed.practicaud2.ejercicio7hub;


public class main {

    public static void main(String[] args) {
        imprimir();
    }
    
    public static void imprimir(){
        for (int i = 0; i < 100; i++) {
            if(i%5==0 && i%3==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0) {
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

}
