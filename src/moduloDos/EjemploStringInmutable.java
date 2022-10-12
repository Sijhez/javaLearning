package moduloDos;

public class EjemploStringInmutable {
    public static void main(String[] args) {
        // creacion de una referencia al objeto String
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

       String resultado = curso.concat(profesor);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

       //version jdk 12: expresion lambda, similar a un fragmento de funcion
        //el parametro c se envía como un parámetro de curso
         String resultado2 = curso.transform(c->{
             return c + " con " + profesor;
         });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2); //gracias a que se esta referenciando, al fin se consigue la concatenacion
        resultado.replace("a", "A");
        System.out.println("resultado = " + resultado); // el resultado no cambia, por que estos métodos no alteran el arreglo principal
        String resultado3= resultado.replace("a", "A");// para modificar, es necesario generar una nueva instancia donde se realice el cambio, y esta deberá ser referenciada
        System.out.println("resultado3 = "+resultado3); // el resultado se muestra cuando se instancia en otra variable


    }
}
