package moduloTres;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase string.. qué tal!"; //instancia de objeto string  new String ("también esta forma de instanciar funciona")

        Integer myNum = 7; // instancia de una clase de Integer, es un objeto de la clase wrapper

        Boolean b1 = texto instanceof String; // instance of ayuda a preguntar si una instancia es referente a una clase en especifico
                                     // si agregamos Object nos va a resultar true, por que es el objeto padre de todas las clases
        System.out.println("texto es del tipo String? " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object? " + b1);

        b1 = myNum instanceof Integer;
        System.out.println("myNum es instancia de Integer? " + b1);

        b1 = myNum instanceof Number;
        System.out.println("myNum es instancia de Number? " + b1);

        b1 = myNum instanceof Object;
        System.out.println("myNum es instancia de Object? " + b1);

        Double decimal = 3456.5;
        b1 = decimal instanceof Number;
        System.out.println("decimal es instancia del tipo Number? " + b1);

        b1 = decimal instanceof Object;
        System.out.println("decimal es instancia del tipo Object " + b1 );

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es instancia de Boolean " + b1);
    }
}
