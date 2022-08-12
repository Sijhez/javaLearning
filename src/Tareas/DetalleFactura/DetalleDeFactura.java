package Tareas.DetalleFactura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
//TAREA 1
        System.out.println("Ingresar nombre factura:" );
        Scanner scanner =  new Scanner(System.in);
        String nombreFactura = scanner.nextLine();

       try {
            System.out.println("Ingrese el precio del Producto:");
           Double price1 = 0d;
            Double price2 = 0d;
            Double impuesto = 0.19;

            try {
                System.out.println("Precio producto:");
                price1 = scanner.nextDouble();
                System.out.println("Precio producto:");
                price2 = scanner.nextDouble();

                double impuestoFinal = (price2 + price1)*impuesto;
                double precioFinal = price1+price2 ;
                System.out.println(" La factura " + nombreFactura + " tiene un total bruto de: " + precioFinal + ", con un impuesto de " + impuestoFinal + "y el monto despues de impuestos es de " + (precioFinal+impuestoFinal)  );
            } catch (InputMismatchException e){
                System.out.println("Error: vuelva a intentarlo");
                main(args);
                System.exit(0);
            }

       } catch (InputMismatchException e ){
           System.out.println("Error: Ingrese un nombre para la factura");
           main(args);
           System.exit(0);
       }



    }
}
