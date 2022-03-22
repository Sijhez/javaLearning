public class varPrimitivos {
    public static void main(String[] args) {
     System.out.println("hola mundo");

     //TIPOS DE VARIABLES: Estricto y estatico
        //BOLEANOS:
        boolean admin = true;
        //CHAR: solo un caracter (cada caracter son 16bits)
        char a = 'a'; //a diferencia de un string, solo es una comilla simple
        char b = '1'; //siempre cerrar con comilla simple
        //NUMEROS ENTEROS: son cualquier numero entero, positivo o negativo, conjunto z, no tienen punto decimal
        //rango entre -128 a 127
        byte enteroByte = 123;
        //rango entre -32768 a 32767
        short enteroShort= 32767;
        //entre -2147483648 a 2147483647
        int enteroInt= 2147483647;
        // entre -9223372036854775808 a 9223372036854775807
        long enteroLong=9223372036854775807L;

        //NUMEROS REALES (FLOTANTES O DECIMALES)
        float realFloat = 3.1416f; //debe llevar la letra f

        double realDouble = 4.7029235E3; //debe llevar la E cuando es double

        //NOMBRES DE VARIABLES, O PARA NOMBREAR CLASS O LO QUE SEA:
           //cuidar de no usar keywords

    }
}
