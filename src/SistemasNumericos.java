import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        
       // int numeroDecimal = 500;
       // System.out.println("numeroDecimal = " + numeroDecimal);        //usamos la clase Integer, con el metodo toBinaryString y llamamos al numero anterior
       // System.out.println("Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));//convirtiendo un numero decimal y lo convierte en tipo string binario

        //el bytecode es el lenguaje de la maquina
        //NUMERO BINARIO
        // int numeroBinario = 0b111110100; //debemos agregar el 0b al inicio del numero para que el compilador de JAVA comprenda que es un numero en sistema binario, si no lo considera como decimal
        //System.out.println("numeroBinario = " + numeroBinario); //imprime el valor decimal del numero binario que ingresamos

        //SISTEMA OCTAL:                                              Usamos de nuevo la declaracion del Integer para usar el metodo octalString
        // System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal) ); //conseguimos el entero octal del numero binario que conseguimos,
        // int numeroOctal = 0764; //para indicar que es numero octal, debemos agregar un 0 antes del numero que obtuvimos al convertir el octal
        //System.out.println("numeroOctal = " + numeroOctal); //imprime el numero decimal

        //SISTEMA HEXADECIMAL
        //System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        //int numeroHex = 0x1f4; //agregar 0x para indicar que es hexadecimal
        //System.out.println("numeroHex = " + numeroHex);

          String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = Integer.parseInt(numeroStr);

        System.out.println("numeroDecimal = " + numeroDecimal);        //usamos la clase Integer, con el metodo toBinaryString y llamamos al numero anterior

       String mensajeBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println("Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));//convirtiendo un numero decimal y lo convierte en tipo string binario

        //el bytecode es el lenguaje de la maquina
        //NUMERO BINARIO
        int numeroBinario = 0b111110100; //debemos agregar el 0b al inicio del numero para que el compilador de JAVA comprenda que es un numero en sistema binario, si no lo considera como decimal
        System.out.println("numeroBinario = " + numeroBinario); //imprime el valor decimal del numero binario que ingresamos

        //SISTEMA OCTAL:                                              Usamos de nuevo la declaracion del Integer para usar el metodo octalString

        System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal) ); //conseguimos el entero octal del numero binario que conseguimos,
        int numeroOctal = 0764; //para indicar que es numero octal, debemos agregar un 0 antes del numero que obtuvimos al convertir el octal
        System.out.println("numeroOctal = " + numeroOctal); //imprime el numero decimal

        //SISTEMA HEXADECIMAL
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4; //agregar 0x para indicar que es hexadecimal
        System.out.println("numeroHex = " + numeroHex);

      String mensaje = mensajeBinario;
      mensaje += "\nNumero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
      mensaje+= "\nNumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
