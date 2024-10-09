import javax.swing.*;
public class bucle_do_while {
    public static void main(String[] args) {
    
        String genero ="";
        do{
            genero=JOptionPane.showInputDialog("introduce tu genero (H/M)");
        }while (genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")== false);
        int altura =Integer.parseInt(JOptionPane.showInputDialog("digite su altura"));
        int pesoideal=0;
        if (genero.equalsIgnoreCase("H")){
            pesoideal=altura-110;
        }
        else if(genero.equalsIgnoreCase("M")){
            pesoideal=altura-120;
        }
        System.out.println("tu pero ideal es" + pesoideal + "kg");
    }
}
