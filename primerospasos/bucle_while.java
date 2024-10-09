import javax.swing.*;
public class bucle_while {
    public static void main(String[] args) {
        String calve="ana";
        String pass="";

        while (calve.equals(pass)==false) {
            pass = JOptionPane.showInputDialog(" introducd la contraseña:"); // ventana tipo JPo
            if (calve.equals(pass)== false){
                System.out.println("contrasela incorrecta");
            }
        }
    
        System.out.println("contraseña correcta");
    }
}
