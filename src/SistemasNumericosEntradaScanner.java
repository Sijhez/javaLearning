import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
                                      // recibe datos de la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        // String numeroStr = scanner.nextLine(); //capturamos el parametro del usuario, o la línea que el usuario captura en la terminal

        int numeroDecimal = 0;
        //uso de try catch para manejo de errores
        try{
            // si se recibe un numero, se continua el procedimiento que esta abajo
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);//convertimos el string recibido en Integer, o entero, con parseInt(string)
               // aqui lo cambiamos para que use la clase InputMismatchException, al ser una entrada en consola, debe usar un verificador diferente para el catch
        }catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero");
            //bloque de código alternativo para algun error que ocurra
            main(args); //si ocurre el error, se ejecuta de nuevo el main, para evitar que sea recursivo usamos o return o clase Sysstem
            System.exit(0); //el status en cero indica proceso correcto, se ejecuta cuando el proceso se resuelve bien
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        
        //NUMERO BINARIO
        String mensajeBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        //SISTEMA OCTAL:                                              Usamos de nuevo la declaracion del Integer para usar el metodo octalString
        String mensajeOctal = "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) ;

        //SISTEMA HEXADECIMAL
        String mensajeHexadecimal = "\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


      String mensaje = mensajeBinario;
      mensaje += mensajeOctal;
      mensaje += mensajeHexadecimal;
      // el mensaje de resultado ahora solo por la consola
        System.out.println( mensaje);

    }
}
