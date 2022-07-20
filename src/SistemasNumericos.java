import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        
        // int numeroDecimal = 500;
        // System.out.println("numeroDecimal = " + numeroDecimal);        //usamos la clase Integer, con el metodo toBinaryString y llamamos al numero anterior
       // System.out.println("Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));//convirtiendo un numero decimal y lo convierte en tipo string binario
                                                                     // aqui usamos la clase Integer por que el número decimal es un numero entero, y usamos el méetodo .toBynaryString
        //el bytecode es el lenguaje de la maquina
        //NUMERO BINARIO
        //int numeroBinario = 0b111110100; //debemos agregar el 0b al inicio del numero para que el compilador de JAVA comprenda que es un numero en sistema binario, si no lo considera como decimal
        //System.out.println("numeroBinario = " + numeroBinario); //imprime el valor decimal del numero binario que ingresamos

        //SISTEMA OCTAL:                                              Usamos de nuevo la declaracion del Integer para usar el metodo octalString
        // System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal) ); //conseguimos el entero octal del numero binario que conseguimos,
        // int numeroOctal = 0764; //para indicar que es numero octal, debemos agregar un 0 antes del numero que obtuvimos al convertir el octal
        //System.out.println("numeroOctal = " + numeroOctal); //imprime el numero decimal

        //SISTEMA HEXADECIMAL
        //System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        //int numeroHex = 0x1f4; //agregar 0x para indicar que es tipo numérico hexadecimal
        //System.out.println("numeroHex = " + numeroHex);


        //Aqui podemos hacer un sistema dinámico, para que un usuario pueda interactuar y convertir numeros.
                           //este objeto genera una ventana de dialogo para interactuar con un input
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");

        int numeroDecimal = 0;
        //uso de try catch para manejo de errores
        try{
            // si se recibe un numero, se continua el procedimiento
            numeroDecimal = Integer.parseInt(numeroStr);//convertimos el string recibido en Integer, o entero, con parseInt(string)

        }catch (NumberFormatException e) {
            //bloque de código alternativo para algun error que ocurra
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero");
            main(args); //si ocurre el error, se ejecuta de nuevo el main, para evitar que sea recursivo usamos o return o clase Sysstem
            System.exit(0); //el status en cero indica proceso correcto, se ejecuta cuando el proceso se resuelve bien
        }

       // System.out.println("numeroDecimal = " + numeroDecimal);        //usamos la clase Integer, con el metodo toBinaryString y llamamos al numero anterior

       String mensajeBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
       System.out.println(mensajeBinario);//convirtiendo un numero decimal y lo convierte en tipo string binario

        //el bytecode es el lenguaje de la maquina
        //NUMERO BINARIO
        int numeroBinario = 0b111110100; //debemos agregar el 0b al inicio del numero para que el compilador de JAVA comprenda que es un numero en sistema binario, si no lo considera como decimal
        //System.out.println("numeroBinario = " + numeroBinario); //imprime el valor decimal del numero binario que ingresamos

        //SISTEMA OCTAL:                                              Usamos de nuevo la declaracion del Integer para usar el metodo octalString
        String mensajeOctal = "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) ;
        System.out.println(mensajeOctal ); //conseguimos el entero octal del numero binario que conseguimos,
         int numeroOctal = 0764; //para indicar que es numero octal, debemos agregar un 0 antes del numero que obtuvimos al convertir el octal
           // System.out.println("numeroOctal = " + numeroOctal); //imprime el numero decimal

        //SISTEMA HEXADECIMAL
        String mensajeHexadecimal = "\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);
        int numeroHex = 0x1f4; //agregar 0x para indicar que es hexadecimal
           // System.out.println("numeroHex = " + numeroHex);

      String mensaje = mensajeBinario;
      mensaje += mensajeOctal;
      mensaje += mensajeHexadecimal;
      // en este JOptionPane generamos un mensaje de salida con la concatenacion de los mensajes anteriores
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
