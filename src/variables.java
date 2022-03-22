import java.util.Arrays;
import java.util.Locale;

public class variables {
    //las variables pueden ser de tipo primitivas(solo un dato, letra, o letras, numeros, o boleano) o de referencia
    //se debe especificar que tipo de variable es, nombre y valor:

    //el contexto de una clase existe dentro del método, dentro de las llaves
    public static void main(String[] args) {
        //variable de tipo instancia (objeto), tiene metodos
        Integer myNumero = 30;

        //variable de tipo primitivo, no tiene metodos
        int numberTwo;


        String myNombre = "soy sinuhe y tengo ";
        //System.out.println(myNombre + myNumero + " años");

        boolean valor = true;
        if(valor){
            numberTwo = 26;
            System.out.println(myNombre.toUpperCase() + myNumero + " y además " + numberTwo);
        }
        //usando var(tipo flexible) definimos la variable y el tipo de variable de forma dinámica
        int numero3 = 15 ;
        if(numero3 > myNumero){
             System.out.println("es mayor");
        }else{
            System.out.println("no es mayor");
        }
        //las variables no pueden comenzar con numero, solo con letras, si es  mas de una palabra, usar camelCase

    }
}
