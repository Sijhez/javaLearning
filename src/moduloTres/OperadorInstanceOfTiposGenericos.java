package moduloTres;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        //se puede generar un object de cualquier tipo ya que es la instancia padre
        Object texto = "Creando un objeto de la clase string.. qué tal!"; //instancia de objeto string

        Number myNum = Integer.valueOf(7); //7; es igual que si ponemos INteger.valueOf(7) //el integer sigue siento integer de tipo generico

        Boolean b1 = texto instanceof String; // instance of ayuda a preguntar si una instancia es referente a una clase en especifico
                                     // si agregamos Object nos va a resultar true, por que es el objeto padre de todas las clases
        System.out.println("texto es del tipo String? " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object? " + b1);

        b1 = texto instanceof Integer;//si preguntamos si objeto es instancia de integer, nos permite hacer la validacion, pero arroja resultado falso, por que Oject no es instancia de INteger
        System.out.println("Texto es del tipo Integer? " + b1);


        b1 = myNum instanceof Integer;
        System.out.println("myNum es instancia de Integer? " + b1);

        b1 = myNum instanceof Number;
        System.out.println("myNum es instancia de Number? " + b1);

        b1 = myNum instanceof Object;
        System.out.println("myNum es instancia de Object? " + b1);

        b1 = myNum instanceof Long; // si myNum es instancia del tipo Number, y preguntamos si es instancia de Long, permite hacer la validacion pero es falso, porque no Number no es instancia de Long
        System.out.println("myNum es instancia del tipo Long? " + b1);

        b1 = myNum instanceof Double;
        System.out.println("myNum es instancia de Double? " + b1);


        Number decimal = Float.valueOf(34.56f);//3456.5f;//si agregamos f despues de la cifra, afirmamos que es un float y deja de ser un double
        b1 = decimal instanceof Double;
        System.out.println("decimal es instancia del tipo Double? " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es instancia del tipo Float? " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es instancia del tipo Number? " + b1);


        b1 = b1 instanceof Boolean;
        System.out.println("b1 es instancia de Boolean " + b1);
    }
}
