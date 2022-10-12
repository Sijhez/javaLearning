package moduloDos;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        // creacion de una referencia al objeto String
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println( detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB); //se concatenan entre si los numeros, y no se suman por que asume que toda la operacion es con strings
        System.out.println(detalle + (numeroA + numeroB)); // ahora si se suman por que especificamos la prioridad de la operacion aritmetica aparte del string
        System.out.println(numeroA + numeroB + detalle); // la precedencia, o evaluacion de operaciones, cambia de orden y poir ello realiza primero la suma y luego la concatenacion

        String detalle2 = curso.concat(" con ").concat(profesor);//los strings que se usan son inmutables, por lo que se genera una nueva instancia de detalle2, assignandole los valores de la operacion realizada
        System.out.println("detalle2 = " + detalle2);
        //usar esta forma de concatenar es mejor que usar el operador mas, ya que al usar mas se genera otra instancia llamada builder



    }
}
