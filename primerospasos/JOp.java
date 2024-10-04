import javax.swing.*;
public class JOp {
    public static void main(String[] args) {
        String nombre_usuario=JOptionPane.showInputDialog("introdice tu nombr eporfavor");
        String edad=JOptionPane.showInputDialog("digite su edad");
        int edad_ususairo= Integer.parseInt(edad);
        edad_ususairo++;
        System.out.println("hola" + nombre_usuario + "el amos que vienes tendras : "+ edad_ususairo + "años");
    }
}
