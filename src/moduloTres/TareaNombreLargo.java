package moduloTres;

import javax.swing.*;

public class TareaNombreLargo {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog(null,"Introduzca el primer nombre:");
        String nombre2 = JOptionPane.showInputDialog(null,"Introduzca el segundo nombre:");;
        String nombre3 = JOptionPane.showInputDialog(null,"Introduzca el tercer nombre:");

        int name1Length = nombre1.split(" ")[0].length();
        int name2Length = nombre2.split(" ")[0].length();
        int name3Length = nombre3.split(" ")[0].length();

        if(name1Length > name2Length && name1Length > name3Length ) {
            System.out.println( nombre1 +  " tiene el nombre mas largo" );
        } else if (name2Length > name1Length && name2Length > name3Length){
            System.out.println( nombre2 +  " tiene el nombre mas largo" );
        } else {
            System.out.println( nombre3 +  " tiene el nombre mas largo" );
        }
    }
}
