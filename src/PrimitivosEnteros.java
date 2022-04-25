public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127; //almacenamiento de 8 bytes
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a:"+ Byte.BYTES); //Uso de memoria
        System.out.println("tipo byte corresponde en bites a: "+ Byte.SIZE); //tamaño en que se puede almacenar
        System.out.println("valor máximo de un byte " + Byte.MAX_VALUE); //Rango máximo de valor
        System.out.println("valor minimo de un byte " + Byte.MIN_VALUE); //Rango minimo de valor

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a:"+ Short.BYTES); //Uso de memoria
        System.out.println("tipo short corresponde en bites a: "+ Short.SIZE); //tamaño en que se puede almacenar
        System.out.println("valor máximo de un short " + Short.MAX_VALUE); //Rango máximo de valor
        System.out.println("valor minimo de un short " + Short.MIN_VALUE); //Rango minimo de valor
        //el int, de la clase INteger tiene mayor capacidad de almacenamiento, 32 bites
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a:"+ Integer.BYTES); //Uso de memoria
        System.out.println("tipo int corresponde en bites a: "+ Integer.SIZE); //tamaño en que se puede almacenar
        System.out.println("valor máximo de un int " +  Integer.MAX_VALUE); //Rango máximo de valor
        System.out.println("valor minimo de un int " + Integer.MIN_VALUE); //Rango minimo de valor
       //el long, o numero mas largo, con 64 bytes
        long numeroLong = 9223372036854775807L; //usar la letra l o L para indicar al sistema que es un numero long
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a:"+ Long.BYTES); //Uso de memoria
        System.out.println("tipo long corresponde en bites a: "+ Long.SIZE); //tamaño en que se puede almacenar
        System.out.println("valor máximo de un long " +  Long.MAX_VALUE); //Rango máximo de valor
        System.out.println("valor minimo de un long " + Long.MIN_VALUE); //Rango minimo de valor

        //uso de variable var, o variable flexible: solo se puede usar a partir de JDK 10
        //var numeroVar = 9223372036854775807L;




    }
}
