public class Primitivos {
    public static void main(String[] args) {
        byte numeroByte = 127; //almacenamiento de 8 bytes
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a:"+ Byte.BYTES); //Uso de memoria
        System.out.println("tipo byte corresponde en bites a: "+ Byte.SIZE); //tamaño en que se puede almacenar
        System.out.println("valor máximo de un byte " + Byte.MAX_VALUE); //Rango máximo de valor
        System.out.println("valor minimo de un byte " + Byte.MIN_VALUE); //Rango minimo de valor

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a:"+ Short.BYTES); //Uso de memoria
        System.out.println("tipo short corresponde en bites a: "+ Short.SIZE); //tamaño en que se puede almacenar
        System.out.println("valor máximo de un short " + Short.MAX_VALUE); //Rango máximo de valor
        System.out.println("valor minimo de un short " + Short.MIN_VALUE); //Rango minimo de valor

    }
}
