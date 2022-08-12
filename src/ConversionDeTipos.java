public class ConversionDeTipos {

    public static void main(String[] args) {


        String numeroStr = "50"; //cómo convertir el valor de este string en numero??
        //generamos un integer y hacemos un parseInt para convertir el string a entero
        int numeroInt = Integer.parseInt(numeroStr);//conversion de strings en numeros enteros
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "12231.24e-3"; //conversion de string en numero flotante(el e-3 significa exponente a la menos tres, es decir, el punto se recorre hacia la derecha)
        double realDouble = Double.parseDouble(realStr);//convertir el string en numero doble decimal
        System.out.println("realDouble = " + realDouble);

        //convertir un string en un tipo bolean
        String logicStr = "false"; //convertimos cualquier string que contenga un valor boleano, se puede convertir en boleano
        boolean logicBoolean = Boolean.parseBoolean(logicStr);
        System.out.println("logicBoolean = " + logicBoolean);

        //así mismo se puede convertir una cifra en string con valueOf(), indicando dentro la variable, ya sea integer, short, byte o long.

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt+10); //aqui si se suma el resultado, por que ambos son valores numéricos
        System.out.println("otroNumeroStr = " + otroNumeroStr+10); //aqui se concatenó el resultado

        //cuando son strings y usamos +10, se concatena, cuando son numericos o enteros, se suman.
        int myAge = 30;
        String stringAge = String.valueOf(myAge); //con este método se pueden sumar cantidades incluso dentro de los paréntesis.
        //el valueOf puede recibir tambien string y el resultado es distinto
       // String sumaString = String.valueOf(otroNumeroStr+10);
       // System.out.println("sumaString = " + sumaString);
         System.out.println("stringAge = " + stringAge);
        //convertir numero real a un tipo string:
                           // aqui usamos una clase wrapper, o envoltura:
        double otroRealDouble = 1.23456e2; //aun si agregamos notación científica, hace la conversion, y muestra el número final
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr); //convertimos un numero flotante o real, en string

        otroRealStr = String.valueOf(1234.45e-2f);//tambien se puede agregar directamente el valor dentro del valueOf()
        System.out.println("otroRealStr = " + otroRealStr);

        //si vamos a convertir de un tipo de numero a otro, debemos considerar el rango maximo del segundo, para evitasr incompatibilidad.
        //convertir tipos de entero a short
        //los intiger y los short son numeros que tienen un valor máximo, si pasamos un valor de un intiger a un short, puede haber incompatibilidad de tipos.
        //Pero si lo casteamos, o forzamos la conversion, se puede conseguir el valor.
        int i = 1000; //si agregamos el maximo valor de short en el intiger (32767), veremos que short aun lo recibe, no asi si agregamos un numero mas, resulta en un valor negativo
        short s = (short) i; //cast, forzamos la conversion de un tipo intiger a un short
        System.out.println("s = " + s);
        System.out.println("VAlor maximo de un short:"+ Short.MAX_VALUE);
        long l = i;
        System.out.println("l = " + l);
        //System.out.println("Valor maximo de un long:"+ Long.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
    }
}
