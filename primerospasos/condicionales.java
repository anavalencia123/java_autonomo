import java.util.*;
public class condicionales {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("introduce tu edad, por favor: ");
        int edad=entrada.nextInt();
        //if(edad >=18){
            //System.out.println("eres mayor de edad");
        //}
        //else{
            //System.out.println("eres menor de edad");
       // }
        
        if (edad<18){
            System.out.println("eres un adolecente ");
        }
        else if(edad<40){
            System.out.println("eres joven");
        }
    }
}

