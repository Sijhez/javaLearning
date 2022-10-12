package moduloDos;

public class EjemploStringValidacion {
    public static void main(String[] args) {
        String curso = null;
        //debemos indicar siempre que el valor de nuestras instancias contenga algún valor, y evitar que sea nulo,
        //por lo tanto, validar si es nulo o no, nos ayudará a evitar el error NullPointerException

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        //si hacemos la comprobacion del null, podemos evitar el nullPointerException, como en este
        if(curso == null){
            curso = " "; //"Programación Java";
          }
        boolean esVacio = curso.length() == 0; //verifica la extension del string, no es lomismo que sea null a que sea un string vacío
       System.out.println("esVacio = " + esVacio);

      /* if(!esVacio){
           System.out.println(curso.toUpperCase());
           System.out.println("Bienvenido al curso".concat(" ").concat(curso));
       }*/

        boolean esVacio2 = curso.isEmpty(); //verifica si el string esta vacío, pero contiene un espacio
        //evalúa que el length del string sea cero
        System.out.println("esVacio2 = " + esVacio2);

        if(esVacio2){
            System.out.println("esVacio2 = " + esVacio2);
        }


        boolean esEspacioBlanco = curso.isBlank();//la forma mas segura de validar la validez de un string es con .isBlank (version jdk11) ya que verifica que no esté vacío, sin espacio y no sea nulo el string
        System.out.println("esEspacioBlanco = " + esEspacioBlanco);
        
        if(esEspacioBlanco == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso".concat(" ").concat(curso));//esto demuestra que debemos usar el metodo .concat() si, y solo si el objeto no es nulo

        }

    }


}
