import java.util.*;

import javax.swing.JOptionPane;


public class clase_scanner {
    public static void main(String[] args) {
    
    Scanner prueba=new Scanner(System.in);
    System.out.println("nombre:");
    String nombre_usuario=prueba.nextLine();
    System.out.println("edad");
    int edad=prueba.nextInt();
    System.out.println("hola" + nombre_usuario +  " , el año que viene tendras"  +  (edad +1)  +  "años");



    


    }
}
