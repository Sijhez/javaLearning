public class CaracteresPrimitivos {
    public static void main(String[] args) {
        //variable char, es para un solo caracter, caracter UNICODE
        char caracter = '\u0040';//representacion de arroba por medio de Unicode: \ secuencia de escape
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = 'Æ';//se puede usar el mismo símbolo para usarse como valor

        char espacio = '\u0020'; //se puede incluir un espacio para separar strings
        char retroceso = '\b'; //retroceso, retrocede un espacio y elimina lo que esta en ese lugar
        char tabulador = '\t'; //tabulador para espacio
        char nuevaLinea = '\n'; //genera un salto de linea
        char retornoCarro = '\r';


        System.out.println("simbolo = " + simbolo);
        System.out.println("Genera nuevaLinea = " +nuevaLinea + Character.BYTES); //con este generamos un salto de línea
        System.out.println("Genera nuevaLinea y hace retorno de carro = " +nuevaLinea + retornoCarro + Character.BYTES); //Generamos un salto de linea y hacemos que se retorne el carro al inicio
        System.out.println("retornoCarro = " + retornoCarro + Character.BYTES); //limpia la linea, y solo se queda con el último valor
       //si no funciona alguno de los anteriores, podemos usar:
        System.out.println("salto de linea dependiendo sistema operativo: " + System.lineSeparator() +Character.BYTES );
        System.out.println("char correspondiente en \bbyte =" + espacio + Character.BYTES);//tambien se puede concatenar directamente en el string, tanto el espacio, como el tabulador o retroceso
        System.out.println("char correspondiente en \tbyte =" + tabulador + Character.BYTES); //uso para espaciar dentro de string
        System.out.println("char correspondiente en bites =" + retroceso + retroceso + Character.SIZE);//quita un caracter usando el retroceso
        System.out.println("valor minimo = "+ Character.MIN_VALUE);
        System.out.println("valor máximo = "+ Character.MAX_VALUE);
    }
}
