package moduloTres;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //El operador ternario se conforma de tres partes o argumentos, la primera evalua una expr boleana, 
        // si se cumple devuelve un valor, si no, devuelve otro por default

        //variable = condicion ? si es true : si es falso ;
        String variable = 7 == 7 ? "ES verdadero" : "es falso";
        // System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 5.2;

        estado = promedio >= 5.5 ? "Aprobado": "Rechazado";
        // System.out.println("estado = " + estado);

        String estadoFinal = "";
        double matematicas = 0;
        double ciencias = 0;
        double historia = 0;
        double newPromedio = 0.0;
        //usuario ingresa valores con scanner
        Scanner scanner= new Scanner(System.in);
        System.out.println("INgrese la nota de matemáticas entre 2.0 - 7.0");
        matematicas = scanner.nextDouble(); //obtiene el dato y lo pone como un decimal o double

        System.out.println("INgrese la nota de ciencias entre 2.0 - 7.0");
        ciencias = scanner.nextDouble();

        System.out.println("INgrese la nota de historia entre 2.0 - 7.0");
        historia = scanner.nextDouble();

        newPromedio = (matematicas + ciencias + historia) / 3 ;
        System.out.println("newPromedio = " + newPromedio);

        estadoFinal = newPromedio >= 5.5 ? "Aprobadisimo" : "Rechazadisimo";
        System.out.println("estado = " + estadoFinal);


    }
}
