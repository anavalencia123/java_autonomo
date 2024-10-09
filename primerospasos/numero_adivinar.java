import java.util.*;
public class numero_adivinar {
    public static void main(String[] args) {
        int aleatorio =(int)(Math.random()*100);
        Scanner entrada=new Scanner (System.in);
        int numero=0;
        int intentos=0;
        while (numero!=aleatorio){
            intentos++;
            System.out.println("introduce un numero:");

            numero= entrada.nextInt();
            if(aleatorio<numero){
                System.out.println("mas bajo ");
            }
            else if (aleatorio>numero){
                System.out.println("mas alto");
            }
        }
        System.out.println("correcto. lo has coseguidos en " + intentos + "intentos");
    }
}
