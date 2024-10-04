import javax.swing.*;
public class entrada_numeros {
    public static void main(String[] args) {
        double x=10000.0;
        System.out.printf("%1.2f",x/3);
    String num1=JOptionPane.showInputDialog("introduce unnumeor: ");
    double num2=Double.parseDouble(num1);
    System.out.println("la raiz de " +  num2 + "es");
    System.out.printf("%1.2f", Math.sqrt(num2));
    }
}
