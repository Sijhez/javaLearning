package moduloTres;

import java.util.Scanner;

public class TareaTanqueGasolina {
    public static void main(String[] args) {
        Double tanqueGas = 0d;
        String estadoTanque = "";
        
        System.out.println("Ingrese litros de gasolina: ");
        Scanner scannerGas = new Scanner(System.in);
        tanqueGas = scannerGas.nextDouble();
         if(tanqueGas == 70){
             estadoTanque = "Estanque lleno";
         } else if (tanqueGas >=60 && tanqueGas < 70 ) {
             estadoTanque = "Estanque casi lleno";
         } else if ( tanqueGas >=40 && tanqueGas < 60 ) {
             estadoTanque = "Estanque 3/4";
         } else if ( tanqueGas >=35 && tanqueGas < 40 ) {
             estadoTanque = "Medio Estanque";
         } else if (tanqueGas >=20 && tanqueGas < 35 ) {
             estadoTanque = "Suficiente";
         } else if (tanqueGas >=1 && tanqueGas < 20) {
             estadoTanque = "Insuficiente";
         }

        System.out.println(" la medida es : " + estadoTanque);

    }
}
